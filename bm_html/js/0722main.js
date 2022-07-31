/**
 * 
 */

 function che(id){
	url = "idCheck.jsp?id="+id;
	this.window.open(url, id, "width=500, height=230");
}

function inputCheck() // 회원가입버튼을 누르면 호출되는 함수 입력하지 않은 값이 있으면 경고창이 뜸
                        // 정상이면 회원가입이 완료됨
{
    if (document.regFrm.id.value == "") {
        alert("아이디 입력 필요");
        document.regFrm.id.focus();
        return;
    }
 
    if (document.regFrm.pwd.value == "") {
        alert("비밀번호 입력 필요");
        document.regFrm.pwd.focus();
        return;
    }
 
    if (document.regFrm.pwd.value == "") {
        alert("비밀번호를 확인하세요");
        document.regFrm.pwd.focus();
        return;
    }
 
    if (document.regFrm.pwd.value != document.regFrm.repwd.value) // 입력한 비밀번호와 대조
                                                                    // 안 맞으면 경고 메시지 나옴
                                                                   
    {
        alert("비밀번호가 일치하지 않습니다");
        document.regFrm.repwd.value = "";
        document.regFrm.id.focus();
        return;
    }
 
    if (document.regFrm.name.value == "") {
        alert("이름 입력 필요");
        document.regFrm.name.focus();
        return;
    }
 
    if (document.regFrm.birthday.value == "") {
        alert("생년월일 입력 필요");
        document.regFrm.birthday.focus();
        return;
    }
 
    if (document.regFrm.email.value == "") {
        alert("이메일 입력 필요");
        document.regFrm.email.focus();
        return;
    }
 
    var str = document.regFrm.email.value;
    var atPos = str.indexOf('@');
    var atLastPos = str.lastIndexOf('@');
    var dotPos = str.indexOf('.');
    var spacePos = str.indexOf('');
    var commaPos = str.indexOf(',');
    var eMailSize = str.length;
    if (atPos > 1 && atPos == atLastPos && dotPos > 3 && spacePos == -1
            && commaPos == -1 && atPos + 1 < dotPos && dotPos + 1 < eMailSize)
        ;
    else {
        alert('이메일 주소 형식이 잘못됨');
        document.regFrm.email.focus();
        return;
        // 이메일 형식을 검사하는 부분입니다.
    }
 
    if (document.regFrm.zipcode.value == "") {
        alert("우편번호를 검색해 주세요");
        return;
    }
 
    if (document.regFrm.job.value == "") {
        alert("직업 입력 필요");
        document.regFrm.job.focus();
        return;
    }
 
    document.regFrm.submit();
}
 
function win_close() {
    self.close();
}

function open_zip() {
	//우편번호 검색 클릭 시 zip.jsp 페이지를 띄운다.
	//검색 결과 없이 창만 띄우면 n, 검색 결과가 있으면 y
	url = "zip.jsp?search=n";
	window.open(url, "ZipCodeSearch", "width=500,height=300,scrollbars=yes");
}

function zipSearch() {
		frm = document.zipFrm;
		if(frm.area3.value == ""){	//도로명 검색어가 없으면
			alert("도로명을 입력하세요.");
			return;				
		}
		//도로명 검색어가 있으면
		frm.action="zip.jsp";
		frm.submit();
	}
	
function sendAdd(zipcode,adds){
	//검색결과 중 주소 선택 시 부모창(opener)에 검색어를 입력하고, 창을 닫는다
	opener.document.zipFrm.zipcode.value = zipcode;
	opener.document.zipFrm.address.value = adds;
	self.close();
}
