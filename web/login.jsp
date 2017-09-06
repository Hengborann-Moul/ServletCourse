<%--
  Created by IntelliJ IDEA.
  User: tadashi
  Date: 6/22/17
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
    <link rel="stylesheet" href="asset/css/uikit.min.css">
    <script src="asset/js/jquery.min.js"></script>
    <script src="asset/js/main.js"></script>
</head>
<body>

<%@include file="include/navbar.jsp" %>
<div class="uk-container">
    <div class="uk-align-center">
        <h1 class="uk-heading-divider" align="center">Welcome to Login Page</h1>
    </div>
    <div class="uk-container-small uk-flex-wrap uk-align-center">
        <p class="uk-text-danger"><%
            String message = (String) request.getAttribute("errormessage");
            if (message == null){
                message = "";
            }
            out.println(message);
        %></p>
        <p class="uk-text-success">
            <%
                String message_suc = (String) request.getAttribute("message");
                if (message_suc == null){
                    message_suc = "";
                }
                out.println(message_suc);
            %>
        </p>
        <p class="uk-text-primary">
            <%
                String message_request = (String) request.getAttribute("message_req");
                if (message_request == null){
                    message_request = "";
                }
                out.println(message_request);
            %>
        </p>
        <form class="uk-form-stacked" method="post" action="ServletViewProfile">

            <div class="uk-margin">
                <label class="uk-form-label" for="form-stacked-text">Username</label>
                <div class="uk-form-controls">
                    <input class="uk-input" id="form-stacked-text" name="username" type="text" placeholder="username" required>
                </div>
            </div>

            <div class="uk-margin">
                <label class="uk-form-label" for="form-stacked-password">Password</label>
                <div class="uk-form-controls">
                    <input type="password" class="uk-input" name="password" id="form-stacked-password" placeholder="password" required>
                </div>
            </div>

            <div class="uk-margin">
                <label class="uk-form-label" for="form-stacked-role">Role</label>
                <Select class="uk-select" name="role" id="form-stacked-role" required>
                    <option value=""></option>
                    <option value="Admin">Admin</option>
                    <option value="Teacher">Teacher</option>
                    <option value="Student">Student</option>
                </Select>
            </div>

            <div class="uk-margin">
                <input type="submit" class="uk-button uk-button-primary" value="submit" name="submit">
            </div>
        </form>
    </div>
</div>

<script src="asset/js/uikit.min.js"></script>
</body>
</html>
