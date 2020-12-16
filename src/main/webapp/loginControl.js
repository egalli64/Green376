
document.getElementById('frm1').onsubmit = () => {

	if (document.getElementById("inputUser").value.length < 6) {
		alert("l'username deve contenere almeno sei caratteri");
		document.getElementById("inputUser").focus();
		return false;
	} else if (document.getElementById("inputPassword").value.length < 8) {
		alert("La password deve contenere almeno 8 caratteri");
		document.getElementById("inputPassword").focus();
		return false;
	}
	return true;
};
