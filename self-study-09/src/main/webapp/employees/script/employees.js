function loginCheck(){
	
	if(document.frm.id.value.length == 0){
		alert("아이디를 써주세요.");
		frm.id.focus();
		return false;
	}

	if(document.frm.pass.value == ""){
		alert("암호는 반드시 입력해야 합니다.");
		frm.pass.focus();
		return false;
	}

	return true;
}