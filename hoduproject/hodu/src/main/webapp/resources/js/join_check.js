function join_check(){
    var userId = document.getElementById("userId");
    var userPw = document.getElementById("userPw");
    var userPwRe = document.getElementById("userPwRe");
    var userName = document.getElementById("userName");
    var userMobile = document.getElementById("userMobile");
    var userEmail = document.getElementById("userEmail");

    

    if(userId.value == ""){
        alert("아이디를 입력하세요.");
        userId.focus();
        return false;
    };

    var idReg = /^[a-zA-z0-9]{6,12}$/;
    if(!idReg.test(userId.value)){
        alert("아이디는 영문 대소문자와 숫자 6~12자리로 입력해야 합니다.");
        userId.focus();
        return false;
    }

    if(userPw.value == ""){
        alert("비밀번호를 입력하세요")
        userPw.focus();
        return false;
    };

    var userPwCheck = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,25}$/;

    if(!userPwCheck.test(userPw.value)){
        alert("비밀번호는 영문자+숫자+특수문자 조합으로 8~25자리 입력하세요.");
        userPw.focus();
        return false;
    };

    if(userPwRe.value !== userPw.value){
        alert("비밀번호가 일치하지 않습니다.");
        userPwRe.focus();
        return false;
    };

    if(userName.value == ""){
        alert("이름을 입력하세요");
        userName.focus();
        return false;
    };

    var reg = /^01[016]-\d{3,4}-\d{4}$/;
    if(!reg.test(userMobile.value)){
        alert("전화번호 형식에 맞게 입력하세요.");
        userMobile.focus();
        return false;
    }

    var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/;
    if(!regExp.test(userEmail.value)){
        alert("이메일 형식에 맞게 입력하세요.");
        userEmail.focus();
        return false;
    }

    document.join_form.submit();

}
