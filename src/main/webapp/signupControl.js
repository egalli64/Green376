
document.getElementById('contact-form').onsubmit = () => {

	if (document.getElementById("password1").value !== document.getElementById('password2').value) {
		alert("Le due password devono coincidere");
		document.getElementById("password1").focus();
		return false;
	}
	if (document.getElementById("password1").value.length < 8) {
		alert("La password deve contenere almeno 8 caratteri");
		document.getElementById("password1").focus();
		return false;
		}
	
	return true;
	
};