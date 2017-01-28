var fileCount = $('#' + employeePortletNamespace + 'count'),
	firstNameJEL = $('#'+ employeePortletNamespace + 'firstName'),
	lastNameJEL = $('#'+employeePortletNamespace + 'lastName');


/** Add document fields */
$('#' + employeePortletNamespace + 'addButton').click(function(e) {
	var fileCountValue = $(fileCount).val(), 
		idUpload = $('#'+ employeePortletNamespace + 'uploadDocument'), 
		count = (fileCountValue < 1) ? 1  : fileCountValue,
		incrementCounter = parseInt(count) + 1, 
		name = employeePortletNamespace + "uploadedFile" + incrementCounter;
		spanId = employeePortletNamespace + "span" + incrementCounter;
		fileNameText = employeePortletNamespace + "fileNameText" + incrementCounter;
	var html = '<tr class="extraFile""  id="'+ spanId +'">'
			+ '<td valign="middle">'
			+ '<div class="uploaderinput">'
			+ '<input type="text" id="'+fileNameText+'" name="'+fileNameText+'" readonly="readonly"/>'
			+ '<input type="file" class="mainuploader"  id="'+ name + '" name="'+ name + '" value="' + incrementCounter + '" />'
			+ '<span><i class="fa fa-upload" aria-hidden="true"></i></span>'
			+ '</div>'
			+ '</td>'
			+ '<td align="center" valign="middle" >'
			+ '<a href="javascript:void(0);" class="cancleIcon" onclick="removeCurrentElement('+incrementCounter+');"><i class="fa fa-close" aria-hidden="true"></i></a>'
			+ '</td>'
			+ '</tr>';
	idUpload.append(html);
	$(fileCount).val(incrementCounter);
});

$('#resetPublicationFileIcon').click(function(){
	$('#' + employeePortletNamespace + 'fileNameText1').val('');
	$('#' + employeePortletNamespace + 'uploadedFile1').val('');
});

$(document).on( 'change', ':file', function(){
	if (this.files && this.files[0]) {
		var fileName = $(this).val().split('/').pop().split('\\').pop();
		var fileExtension = fileName.split('.').pop().toLowerCase(); 
		var counter = (this.id).slice(-1);
		$('#'+employeePortletNamespace+'fileNameText'+counter).val(fileName);
		var validExtensionsFrVisible = { jpg: true, jpeg: true, png: true, gif: true, pdf:true};
		var validExtensionsFrPageNo = { pdf:true};
		if (validExtensionsFrVisible[fileExtension]) {
			$('#' + employeePortletNamespace + 'uploadRadio' + counter).removeClass('hide');
		}else{
			$('#' + employeePortletNamespace + 'uploadRadio' + counter).addClass( "hide" );
		}
		
		if (validExtensionsFrPageNo[fileExtension]) {
			$('#' + employeePortletNamespace + 'uploadText' + counter).removeClass('hide');
		}else{
			$('#' + employeePortletNamespace + 'uploadText' + counter).addClass( "hide" );
		}
    }
});

/** remove current element **/
function removeCurrentElement(counter){
	$('#' +adminPortletNamespace+'span'+counter).remove();
}



/** Save document */
$('#' + employeePortletNamespace + 'submitBtn').click(function(e) {
	var formData = new FormData(),
	fileCountValue = $(fileCount).val(), 
	firstName = $(firstNameJEL).val(),
	lastName = $(lastNameJEL).val();
	
	
	formData.append(employeePortletNamespace + 'firstName', $(firstNameJEL).val());
	formData.append(employeePortletNamespace + 'lastName', $(lastNameJEL).val());
	formData.append(employeePortletNamespace + 'fileCount', fileCountValue);
	
	for(var i = 1; i <= fileCountValue; i++) {
		var $id = $("#" + employeePortletNamespace + "uploadedFile" + i);
		formData.append( 'file'+i, $id[0].files[0]);
	}
	
	$.ajax({
		url: addEmployeeURL,
		type: 'POST',
		data: formData,
		processData: false,
		contentType: false,
		success: function(data){
			var jsonData = JSON.parse(data);
			if (jsonData.status === 'success') {
				alert('Employee Updated SuccessFully.');
				resetForm();
			} else if (jsonData.status === 'error') {
				alert('Error In Updating Employee');
			}
		},error: function(xhr) { 
		}
	});
});

function resetForm(){
	$(firstNameJEL).val('');
	$(lastNameJEL).val('');
	$(fileCount).val(1);
	$('.extraFile').remove();
	$('#' + employeePortletNamespace + 'fileNameText1').val('');
	$('#' + employeePortletNamespace + 'uploadedFile1').val('');
}