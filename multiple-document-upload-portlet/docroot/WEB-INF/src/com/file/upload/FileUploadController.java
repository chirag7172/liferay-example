package com.file.upload;

import java.io.IOException;
import java.util.Date;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.file.upload.model.EmployeeDetail;
import com.file.upload.service.EmployeeDetailLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

@Controller(value = "FileUploadController")
@RequestMapping("VIEW")
public class FileUploadController {

	private static final String VIEW = "view";
	private static final Log log = LogFactoryUtil.getLog(FileUploadController.class);
	
	@RenderMapping
	public String view(RenderRequest renderRequest,RenderResponse renderResponse, Model model) throws PortalException, SystemException {
		
		return VIEW;
	}
	
	/**
	 * 
	 * @param resourceRequest
	 * @param resourceResponse
	 * @param model
	 * @throws IOException
	 * @throws SystemException 
	 * @throws PortalException 
	 */
	@ResourceMapping(value = "add-employee")
	public void addEmployee(ResourceRequest resourceRequest, ResourceResponse resourceResponse, Model model) throws IOException, PortalException, SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(EmployeeDetail.class.getName(), uploadPortletRequest);
		
		JSONObject responseObj = JSONFactoryUtil.createJSONObject();
		
		String firstName = ParamUtil.getString(uploadPortletRequest, "firstName");
		String lastName = ParamUtil.getString(uploadPortletRequest, "lastName");
		
		EmployeeDetail employeeDetail = null;
		
		employeeDetail = EmployeeDetailLocalServiceUtil.createEmployeeDetail(CounterLocalServiceUtil.increment(EmployeeDetail.class.getName()));
		
		employeeDetail.setFirstName(firstName);
		employeeDetail.setLastName(lastName);
		employeeDetail.setCreateDate(new Date());
		employeeDetail.setCompanyId(themeDisplay.getCompanyId());
		employeeDetail.setGroupId(themeDisplay.getScopeGroupId());
		employeeDetail = EmployeeDetailLocalServiceUtil.updateEmployeeDetail(employeeDetail);
				
		/**add title Doc*/
		DocumentUtil.fileUpload(uploadPortletRequest, themeDisplay,employeeDetail);
				
		responseObj.put("status", "success");
				
		HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(resourceResponse);
		try {
			ServletResponseUtil.write(httpResponse, responseObj.toString());
		} catch (IOException e) {
			log.error(e.getMessage());
		}
	}
}
