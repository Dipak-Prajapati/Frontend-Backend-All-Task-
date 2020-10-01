function validate() {
	var fname = document.getElementById('fname').value;
	var lname = document.getElementById('lname').value;
	var email = document.getElementById("email").value;
	var dob = document.getElementById("dob").value;
	var contact = document.getElementById("m_no").value;
	var password = document.getElementById("pwd").value;
	var cpassword = document.getElementById("cpwd").value;

	if (fname == "") {
		document.getElementById('sfname').innerHTML = "* Required Field!!!";
		return false;
	}
	if (fname != "") {
		document.getElementById('sfname').innerHTML = "";
	}
	if (lname == "") {
		document.getElementById('slname').innerHTML = "* Required Field!!!";
		return false;
	}
	if (lname != "") {
		document.getElementById('slname').innerHTML = "";
	}
	if (email == "") {
		document.getElementById('semail').innerHTML = "* Required Field!!!";
		return false;
	}
	if (email != "") {
		document.getElementById('semail').innerHTML = "";
	}
	if (dob == "") {
		document.getElementById('sdob').innerHTML = "* Required Field!!!";
		return false;
	}
	if (dob != "") {
		document.getElementById('sdob').innerHTML = "";
	}
	if (contact == "") {
		document.getElementById('sm_no').innerHTML = "* Required Field!!!";
		return false;
	}
	if (contact != "") {
		document.getElementById('sm_no').innerHTML = "";
	}
	if (password == "") {
		document.getElementById('spwd').innerHTML = "* Required Field!!!";
		return false;
	}
	if (password != "") {
		document.getElementById('spwd').innerHTML = "";
	}
	if (cpassword == "") {
		document.getElementById('scpwd').innerHTML = "* Required Field!!!";
		return false;
	}
	if (cpassword != "") {
		document.getElementById('scpwd').innerHTML = "";
	}
}

function inputFile() {
	var file = document.getElementById("pic").files[0];
	var fileName = document.getElementById("pic").value;
	var allowed_extensions = new Array("jpg", "png", "gif", "jpeg");
	var file_extension = fileName.split('.').pop();
	var valid = false;

	if (fileName == 0) {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('spic').innerText = "* Please Select Your Profile Pic *";
	}
	for (var i = 0; i < allowed_extensions.length; i++) {
		if (allowed_extensions[i] == file_extension) {
			valid = true;

			if (file.size > 2097152) {
				document.getElementById('spic').innerText = "* Image Size Must Be Under 2mb *";
			} else {
				document.getElementById('shead').innerText = " ";
				document.getElementById('spic').innerText = " ";
			}
		}
	}
	if (valid == false) {
		document.getElementById('spic').innerText = "* Please Select The Valid Image *";
	}
}

function inputfname() {
	var firstname = document.getElementById("fname");
	var alphaExp = /^[a-zA-Z]+$/;

	if (firstname.value.length == 0) {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('sfname').innerText = "* Enter The First Name *";
	} else if (firstname.value.match(alphaExp)) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('sfname').innerText = " ";
	} else {
		document.getElementById('shead').innerText = " ";
		document.getElementById('sfname').innerText = "* For Your First Name Please Use Alphabets Only *";
	}
}

function inputlname() {
	var lastname = document.getElementById("lname");
	var alphaExp = /^[a-zA-Z]+$/;

	if (lastname.value.length == 0) {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('slname').innerText = "* Enter The Last Name *";
	} else if (lastname.value.match(alphaExp)) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('slname').innerText = " ";
	} else {
		document.getElementById('slname').innerText = "* For Your Last Name Please Use Alphabets Only *";
	}
}

function inputemail() {
	var emailid = document.getElementById("email");
	var emailExp = /^[a-z0-9._][a-zA-Z0-9-_]+@[a-z0-9]+\.[a-z]{2,4}/;

	if (emailid.value.length == 0) {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('semail').innerText = "* Please Enter The Email *";
	} else if (emailid.value.match(emailExp)) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('semail').innerText = " ";
	} else {
		document.getElementById('semail').innerText = "* Please Enter a Valid Email Address *";
	}
}

function inputdob() {
	var birthday = document.getElementById("dob").value;

	if (birthday.length == 10) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('sdob').innerText = " ";
	} else {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('sdob').innerText = "* Enter The Valid Date Of Birth *";
	}
}

function inputmno() {
	var m_no = document.getElementById("m_no");
	var mobileExp = /^[0-9]{10,10}$/;

	if (m_no.value.length == 0) {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('sm_no').innerText = "* Please Enter The Mobile Number *";
	} else if (m_no.value.match(mobileExp)) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('sm_no').innerText = " ";
	} else {
		document.getElementById('sm_no').innerText = "* Please Enter The Valid Mobile Number *";
	}
}

function inputgender() {
	var genders = document.getElementsByName("gender");
	if (genders[0].checked == true) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('sgender').innerText = " ";
	} else if (genders[1].checked == true) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('sgender').innerText = " ";
	} else {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('sgender').innerText = "* You Must Select Your Gender *";
	}
}

function inputlanguage() {
	var languages = document.getElementsByName("language");
	var check = false;

	for (var i = 0; i < languages.length; i++) {
		if (languages[i].checked) {
			check = true;
			break;
		}
	}
	if (check == false) {
		document.getElementById('scheck').innerText = "* Please Select Atleast One Language *";
	}
}
function inputHobbie() {
	var hobbie = document.getElementById("hobbie").value;

	if (hobbie == '') {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('shobbie').innerText = "* Please select an option! *";
	} else {
		document.getElementById('shead').innerText = " ";
		document.getElementById('shobbie').innerText = " ";
	}
}

function inputaddress(count) {
	var paddress = document.getElementById(count + '.address');
	if (paddress.value == "") {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('saddress' + count).innerText = "* Please Enter The Address*";
	} else {
		document.getElementById('shead').innerText = " ";
		document.getElementById('saddress' + count).innerText = " ";
	}
}
function inputcity(count) {
	var cityname = document.getElementById(count + '.city');
	var alphaExp = /^[a-zA-Z]+$/;

	if (cityname.value == "") {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('scity' + count).innerText = "* Enter The City Name *";
	} else if (cityname.value.match(alphaExp)) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('scity' + count).innerText = " ";
	} else {
		document.getElementById('shead').innerText = " ";
		document.getElementById('scity' + count).innerText = "* For Your City Name Please Use Alphabets Only *";
	}
}
function inputstate(count) {
	var statename = document.getElementById(count + '.state');
	var alphaExp = /^[a-zA-Z]+$/;

	if (statename.value == "") {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('sstate' + count).innerText = "* Enter The State Name *";
	} else if (statename.value.match(alphaExp)) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('sstate' + count).innerText = " ";
	} else {
		document.getElementById('shead').innerText = " ";
		document.getElementById('sstate' + count).innerText = "* For Your State Name Please Use Alphabets Only *";
	}
}
function inputcountry(count) {
	var countryname = document.getElementById(count + '.country');
	var alphaExp = /^[a-zA-Z]+$/;

	if (countryname.value == "") {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('scountry' + count).innerText = "* Enter The Country Name *";
	} else if (countryname.value.match(alphaExp)) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('scountry' + count).innerText = " ";
	} else {
		document.getElementById('shead').innerText = " ";
		document.getElementById('scountry' + count).innerText = "* For Your Country Name Please Use Alphabets Only *";
	}
}

function inputpassword() { /* "^([a-zA-Z0-9@*#]{8,15})$" */
	var pwdExp = /^[a-zA-Z0-9]{8,16}$/;
	var password1 = document.getElementById("pwd");
	if (password1.value == '') {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('spwd').innerText = "* Please Enter The Password *";
	} else if (password1.value.match(pwdExp)) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('spwd').innerText = " ";
	} else {
		document.getElementById('shead').innerText = " ";
		document.getElementById('spwd').innerText = "* Password Not In Range *";
	}
}

function inputcpassword() {
	var password1 = document.getElementById("pwd");
	var confirm_password = document.getElementById("cpwd");

	if (confirm_password.value == '') {
		document.getElementById('shead').innerText = "* All Fields Are Mandatory *";
		document.getElementById('scpwd').innerText = "* Please Enter The Confirm Password *";
	} else if (password1.value != confirm_password.value) {
		document.getElementById('shead').innerText = " ";
		document.getElementById('spwd').innerText = " ";
		document.getElementById('scpwd').innerText = "* Password Did Not Match...Please Try Again :( *";
	} else {
		document.getElementById('shead').innerText = " ";
		document.getElementById('scpwd').innerText = " ";
	}
}

function resetFile() {
	document.getElementById('spic').innerText = " ";
}
function resetFirstName() {
	document.getElementById('sfname').innerText = " ";
}
function resetLastName() {
	document.getElementById('slname').innerText = " ";
}
function resetEmail() {
	document.getElementById('semail').innerText = " ";
}
function resetDob() {
	document.getElementById('sdob').innerText = " ";
}
function resetMno() {
	document.getElementById('sm_no').innerText = " ";
}
function resetGender() {
	document.getElementById('sgender').innerText = " ";
}
function resetLanguage() {
	document.getElementById('scheck').innerText = " ";
}
function resetHobbie() {
	document.getElementById('shobbie').innerText = " ";
}
function resetAddress(count) {
	document.getElementById('saddress' + count).innerText = " ";
}
function resetCity(count) {
	document.getElementById('scity' + count).innerText = " ";
}
function resetState(count) {
	document.getElementById('sstate' + count).innerText = " ";
}
function resetCountry(count) {
	document.getElementById('scountry' + count).innerText = " ";
}
function resetPassword() {
	document.getElementById('spwd').innerText = " ";
}
function resetConfirmPassword() {
	document.getElementById('scpwd').innerText = " ";
}
