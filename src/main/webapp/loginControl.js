
document.getElementById('frm1').onsubmit = () => {

	if (document.getElementById("inputUser").value.length < 2) {
		alert("l'username deve contenere almeno due caratteri");
		document.getElementById("inputUser").focus();
		return false;
	} else if (document.getElementById("inputPassword").value.length < 2) {
		alert("La password deve contenere almeno due caratteri");
		document.getElementById("inputPassword").focus();
		return false;
	}
	return true;
};
