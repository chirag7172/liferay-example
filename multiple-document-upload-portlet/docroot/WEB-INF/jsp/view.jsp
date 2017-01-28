<%@ include file="init.jsp"%>

<portlet:resourceURL var="addEmployeeURL" id="add-employee" />

<div class="mainBody">	
	<div class = "containDiv">
		<div class="row">
			<div class="col3">
				<label><liferay-ui:message key='first-Name' /></label>
				<input type="text" name="<portlet:namespace/>firstName" id="<portlet:namespace/>firstName" placeholder='<liferay-ui:message key="first-Name"/>'>
			</div>
			
			<div class="col3">
				<label><liferay-ui:message key='last-name' /></label>
				<input type="text" name="<portlet:namespace/>lastName" id="<portlet:namespace/>lastName" placeholder="<liferay-ui:message key="last-name"/>">
			</div>
		</div>
	</div>
		<div class = "containDiv">
		<div class="row">
			<div class="col60">
				<div class="table-responsive table-div table-bordered">
					<table class="table table-striped">
					  <thead>
						<tr>
						  <th><liferay-ui:message key='document' /></th>
						  <th></th>
						</tr>
					  </thead>
					  <tbody id="<portlet:namespace/>uploadDocument">
						<tr>
						  <td valign="middle">
							  <div class="uploaderinput">
							  	<input type="text" name="<portlet:namespace/>fileNameText1" id="<portlet:namespace/>fileNameText1" readonly="readonly"/>
							  	<input type="file" name="<portlet:namespace/>uploadedFile1" id="<portlet:namespace/>uploadedFile1"  class="mainuploader"/> 
							  	<span><i class="fa fa-upload" aria-hidden="true"></i></span> 
							  </div>
						  </td>
						  <td valign="middle" align="center">
						  	<a href="javascript:void(0);" class="refreshIcon" id="resetPublicationFileIcon">
						  		<i class="fa fa-undo" aria-hidden="true"></i>
						  	</a>
						  </td>
						</tr>
					  </tbody>
					</table>
					<input type="hidden" name="<portlet:namespace/>count" id="<portlet:namespace/>count" value="1">
				</div>
			</div>
			<div class="col40">
				<div class="addFileBtn" id="<portlet:namespace/>addButton">
					<i class="fa fa-plus" aria-hidden="true"></i>
					<span><liferay-ui:message key="add-more-files"/> </span>
				</div>
			</div>
		</div>
		</div>
<div class="btnsrow">
	<button type="button" id="<portlet:namespace/>submitBtn" class="btn-primary"><liferay-ui:message key="submit" /></button>
	<button type="button" id="<portlet:namespace/>cancel" class="btn-default"><liferay-ui:message key="cancel" /></button>
</div>
</div>

<script type="text/javascript" charset="utf-8">
	var employeePortletNamespace = '<portlet:namespace/>';
		addEmployeeURL = "${addEmployeeURL}";
</script>