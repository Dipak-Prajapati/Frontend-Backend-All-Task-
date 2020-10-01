/*alert("This is from Java Script");*/
function validate()
{
	var firstname = document.getElementById("fname");
	var lastname= document.getElementById("lname");
	var emailid= document.getElementById("email");
	var birthday= document.getElementById("dob");
	var m_no= document.getElementById("m_no");
	var genders= document.getElementsByName("gender");
	var hobbie= document.getElementsByName("language");
	var paddress= document.getElementById("address");
	var password= document.getElementById("pwd");
	var confirm_password= document.getElementById("cpwd");


	if(firstname.value== "")
	{
		document.getElementById('sfname').innerText = "* Enter The First Name *";
		false;
	}
	else
	{
			document.getElementById('sfname').innerText = "";
			true;
	}
}
