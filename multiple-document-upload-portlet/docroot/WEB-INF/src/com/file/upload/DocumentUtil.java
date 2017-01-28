package com.file.upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.file.upload.model.EmployeeDetail;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.DuplicateFileException;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;

public class DocumentUtil {
	private static final Log log = LogFactoryUtil.getLog(DocumentUtil.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	
	public static void fileUpload(UploadPortletRequest uploadPortletRequest,
			ThemeDisplay themeDisplay, EmployeeDetail employeeDetail) {
		long fileCount = ParamUtil.getLong(uploadPortletRequest,"fileCount");
		
		for (int i = 1; i <= fileCount; i++) {
			
			String name = "file" + i;
			File file = uploadPortletRequest.getFile(name);
			if(Validator.isNotNull(file)){
				String fileName =  uploadPortletRequest.getFileName(name);
				String mimeType = uploadPortletRequest.getContentType(name);
				String description = StringPool.BLANK;
				long size = uploadPortletRequest.getSize(name);
				
				Folder folder = getFolder(themeDisplay, employeeDetail.getEmployeeId());
				if(Validator.isNotNull(folder)){
					try {
						
						ServiceContext serviceContext = ServiceContextFactory.getInstance(uploadPortletRequest);
						serviceContext.setAddGuestPermissions(true);
						
						InputStream inputStream = new FileInputStream(file);
						FileEntry fileEntry = DLAppServiceUtil.addFileEntry(themeDisplay.getScopeGroupId(), folder.getFolderId(), fileName, 
									mimeType, employeeDetail.getEmployeeId() + StringPool.UNDERLINE + fileName, description, "", inputStream, size, serviceContext);
					}catch (DuplicateFileException e){
						log.error(e.getMessage());
					} catch (Exception e) {
						log.error(e.getMessage());
					}
				}
			}
		}
	}

	private static Folder getFolder(ThemeDisplay themeDisplay, long employeeId) {
		
		Folder folder = null;
		try {
			folder = DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, "employeeDetail");
		}catch (PrincipalException e1){
			log.error("Please sign in to continue");
		} catch (Exception e1) {
			try{
				ServiceContext serviceContext = new ServiceContext();
				serviceContext.setAddGuestPermissions(true);
				folder = DLAppServiceUtil.addFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, String.valueOf("employeeDetail"), String.valueOf("employeeDetail"), serviceContext);
			}catch(Exception e){
				log.error(e.getMessage());
			}				
		}
		return folder;
	}

}
