 function validate(){
	var name = document.getElementById('name').value;
	console.log(name);
	if(name == "") {
		document.getElementById('nameerror').innerHTML = "!!! Name is Must";
		document.getElementById('submitbtn').setAttribute('disabled','disabled');
	}
	else if(name.length < 6 || name.length > 15){
		document.getElementById('nameerror').innerHTML = "!!! Length of name must be in the rage of 6-12 characters";
		document.getElementById('submitbtn').setAttribute('disabled','disabled');
	}
	else{
		document.getElementById('nameerror').innerHTML = "";
		document.getElementById('submitbtn').removeAttribute('disabled');
	}
}

function validateId(){
	var id = document.getElementById('id').value;
	console.log(id);
	if(isNaN(id)){
		document.getElementById('nameerror').innerHTML = "!!! Id must be a number";
		document.getElementById('submitbtn').setAttribute('disabled','disabled');
	}
	else if(id < 100 || id > 200){
		console.log(id);
		document.getElementById('nameerror').innerHTML = "!!! Id must be in the rage of 100 to 200";
		document.getElementById('submitbtn').setAttribute('disabled','disabled');
	}
	else{
		document.getElementById('nameerror').innerHTML = "";
		document.getElementById('submitbtn').removeAttribute('disabled');
	}
}

function showDetails(){
	// checking if gender is checked - if yes, then check that only one of the radio btn is checked using XOR
	if(document.getElementById('gender_male').checked ^ document.getElementById('gender_female').checked){
		let name = document.getElementById('name').value;
		let id = document.getElementById('id').value;
		let gender;
		gender = (document.getElementById('gender_male').checked) ? "male" : "female";
		console.log(name);
		console.log(id);
		console.log(gender);
		document.write("NAME : " + name + ", ID : " + id + ", GENDER : " + gender);
	}
	else{
		document.getElementById('nameerror').innerHTML = "!!! Select Gender";
		document.getElementById('submitbtn').removeAttribute('disabled');
	}
}