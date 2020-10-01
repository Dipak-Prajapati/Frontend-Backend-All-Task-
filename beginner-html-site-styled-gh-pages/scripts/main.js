
	//Heading Change Code
//  myHeading = document.querySelector('h1');
// myHeading.textContent = 'Hello World!';

	//Image Switcher Code
// let myImage = document.querySelector('img');

// myImage.onclick = function() {
//     let mySrc = myImage.getAttribute('src');
//     if(mySrc === 'images/firefox-icon.png') {
//       myImage.setAttribute ('src','images/firefox2.png');
//     } else {
//       myImage.setAttribute ('src','images/firefox-icon.png');
//     }
// }

	//Welcome Meassge Code
let myButton = document.querySelector('button');
let myHeading = document.querySelector('h1');


function setUserName()
 {
	// body...
	let myName = prompt('Please Enter Your Name');
	if(!myName || myName === null)
	{
		setUserName();
	}
	else
	{
		localStorage.setItem('name',myName);
		myHeading.innerHTML = "Mozilla is cool,"+ ' ' +myName;
	}
}

if(!localStorage.getItem('name')) {
  setUserName();
} else {
  let storedName = localStorage.getItem('name');
  myHeading.innerHTML = 'Mozilla is cool'+ ' ' + storedName;
}
myButton.onclick = function()
{
  setUserName();
}