<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en">
<head>
    <title>NSESA &rsaquo; Login</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <!-- Latest compiled and minified CSS -->
    <!-- use as a base URL - makes subsequent URLs much cleaner since we don't need a context path -->
    <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>

    <link rel='stylesheet' href='css/bootstrap.min.css'>
    <script src="js/jquery-1.11.0.min.js"></script>

    <!-- Curse you, IE! -->
    <script type="text/javascript">
        function focusit() {
            document.getElementById('username').focus();
        }

        function sendIt() {
            // remove trailing spaces
            var username = $.trim($('#username').val());
            $('#username').val(username);

            // avoid a second click on the button
            $('#submit').attr('disabled', 'true');
            return true;
        }

        window.onload = focusit;
    </script>

</head>
<body>

<div class="container">
    <div id="page" class="row" style="padding-top: 200px;">
        <div class="col-xs-4"></div>
        <div class="col-xs-4" id="login">

            <div style="text-align: center;">
                <h1>NSESA</h1>

                <p></p>

                <p></p>
            </div>


            <div id="error">
                <c:if test="${not empty param['login_error']}">
                    <div class="alert alert-error">Password incorrect.</div>
                </c:if>
                <c:if test="${not empty param['login_forbidden']}">
                    <div class="alert alert-error">User not allowed.</div>
                </c:if>
                <p></p>

                <p></p>
            </div>


            <div>
                <form name="loginform" id="loginform" action="j_security_check" method="post" class="well"
                      onsubmit="return sendIt()">
                    <p>
                        <label for="username">
                            Username
                        </label>
                        <input type="text" name="j_username" id="username" placeholder="Username"
                               class="input <c:if test="${not empty param['login_error']}">input_error</c:if>" value=""
                               size="35" tabindex="10"/>
                    </p>

                    <p>
                        <label for="password">
                            Password
                        </label>
                        <input type="password" name="j_password" id="password" placeholder="Password"
                               class="input password <c:if test="${not empty param['login_error']}">input_error</c:if>"
                               value="" size="35" tabindex="20"/>
                    </p>

                    <p id="btsection">
                        <input type="submit" name="submit" id="submit" class="btn btn-primary btn-large" value="Login"/>
                    </p>
                </form>
            </div>

        </div>
    </div>
</div>
</body>
<script src="js/bootstrap.min.js"></script>
</html>
