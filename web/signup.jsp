<%--
  Created by IntelliJ IDEA.
  User: tadashi
  Date: 7/2/17
  Time: 9:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp</title>
    <link rel="stylesheet" href="asset/css/uikit.min.css">
    <link rel="stylesheet" href="asset/css/main.css">
    <script src="asset/js/jquery.min.js"></script>
    <script src="asset/js/main.js"></script>
</head>
<body>

    <%@include file="include/navbar.jsp"%>
    <div class="uk-container">
        <div class="uk-align-center">
            <h1 class="uk-heading-divider" align="center">Welcome to SignUp Page</h1>
        </div>

        <div class="uk-container-small uk-flex-wrap uk-align-center">
            <p class="uk-text-danger"><%
                String error_mess = (String) request.getAttribute("error_message");
                if (error_mess == null)
                    error_mess = "";
                out.println(error_mess);
            %></p>
            <form class="uk-form-stacked" action="ServletSignUp" method="post">
                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-username">Username</label>
                    <div class="uk-form-controls">
                        <input class="uk-input" name="username" id="form-stacked-username" type="text" placeholder="username">
                    </div>
                </div>
                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-email">Email</label>
                    <div class="uk-form-controls">
                        <input class="uk-input" name="email" id="form-stacked-email" type="email" placeholder="email">
                    </div>
                </div>
                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-password">Password</label>
                    <div class="uk-form-controls">
                        <input class="uk-input" name="password" id="form-stacked-password" type="password" placeholder="password">
                    </div>
                </div>
                <div class="uk-margin">
                    <label for="form-stacked-confirm" class="uk-form-label">Confirm Password</label>
                    <div class="uk-form-controls">
                        <input type="password" id="form-stacked-confirm" name="confirm" class="uk-input" placeholder="confirm password">
                    </div>
                </div>
                <div class="uk-margin">
                    <label for="form-stacked-batch" class="uk-form-label">Choose your batch</label>
                    <div class="uk-form-controls">
                        <select class="uk-select" name="batch" id="form-stacked-batch">
                            <option value=""></option>
                            <option value="Batch I">Batch I</option>
                            <option value="Batch II">Batch II</option>
                            <option value="Batch III">Batch III</option>
                        </select>
                    </div>
                </div>
                <div class="uk-margin">
                    <input type="submit" class="uk-button uk-button-primary" value="signup" name="signup">
                </div>
            </form>
        </div>

    </div>

    <script src="asset/js/uikit.min.js"></script>
    <script src="asset/js/uikit-icons.min.js"></script>
</body>
</html>
