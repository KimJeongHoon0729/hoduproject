<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>login page</title>
        <link rel="stylesheet" href="/resources/style.css">
    </head>
    <body>
        <div class="wrap">
            <div class="form-wrap">
                <div class="button-wrap">
                    <div id="btn"></div>
                    <button type="button" class="togglebtn" onclick="login()">User</button>
                    <button type="button" class="togglebtn" onclick="register()">Partner</button>
                     </div>
                <form id="login" action="logincheck.do" class="input-group">
                    <input type="text" id="userId" name="userId" class="input-field" placeholder="User name or Email" required>
                    <input type="password" id="userPw" name="userPw" class="input-field" placeholder="Enter Password" required>
                    <button class="submit">Login</button>
                    <button class="nextLine"></button>
                    <button class="submit">Signin</button>
                    <c:if test="${msg == 'fail' }">
                       <script>
                        alert("로그인에 실패하였습니다.");
                        history.back();
                        </script>
                    </c:if>
                </form>
                <form id="register" action="plogincheck.do" class="input-group">
                    <input type="text" id="businessNum" name="businessNum" class="input-field" placeholder="Business Registration Number" required>
                    <input type="text" id="partnerId" name="partnerId" class="input-field" placeholder="Business name" required>
                    <input type="password" id="partnerPw" name="partnerPw" class="input-field" placeholder="Enter Password" required>
                    <button class="submit">Login</button>
                     <button class="nextLine"></button>
                    <button class="submit">Signin</button>
                    <c:if test="${msg == 'fail' }">
                       <script>
                        alert("로그인에 실패하였습니다.");
                        history.back();
                        </script>
                    </c:if>
                </form>
            </div>
        </div>
        <script>
            var x = document.getElementById("login");
            var y = document.getElementById("register");
            var z = document.getElementById("btn");
            
            
            function login(){
                x.style.left = "50px";
                y.style.left = "450px";
                z.style.left = "0";
            }

            function register(){
                x.style.left = "-400px";
                y.style.left = "50px";
                z.style.left = "110px";
            }
        </script>
    </body>
</html>