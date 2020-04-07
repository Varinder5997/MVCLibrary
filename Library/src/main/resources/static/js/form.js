function validateform() {
	
	var name = document.myform.libraryName.value;
	if (name == "abcd") {
		alert("This library is already exist");

		return false;
	}

}

