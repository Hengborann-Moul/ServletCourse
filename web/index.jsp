<%--
  Created by IntelliJ IDEA.
  User: tadashi
  Date: 7/1/17
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="asset/css/uikit.min.css">
    <link rel="stylesheet" href="asset/css/main.css">
    <script src="asset/js/jquery.min.js"></script>
    <script src="asset/js/main.js"></script>
</head>
<body>

    <%@include file="include/navbar.jsp"%>

    <div class="uk-container">
        <div class="uk-align-center">
            <h1 class="uk-heading-divider" align="center">Welcome to Servlet Course</h1>
        </div>
        <div class="uk-container-small uk-flex-wrap uk-align-center">
            <ul class="uk-list uk-list-striped">
                <li><a class="uk-link-text" href="ServletLoginForm">Go to login page</a></li>
                <li><a class="uk-link-text" href="ServletLoginCookie">Login by Cookie</a></li>
                <li><a class="uk-link-text" href="ServletHeaderRequest">Go to See Header Request</a></li>
                <li><a class="uk-link-text" href="ServletShowConfig">Go to See Servlet Config</a></li>
                <li><a class="uk-link-text" href="ServletConnection">Check Database Connection.</a></li>
                <li><a class="uk-link-text" href="ServletLoginFilter">Login With Filter</a></li>
                <li><a class="uk-link-text" href="ServletSignUp">Go to Sign Up page</a></li>
                <li><a class="uk-link-text" href="login.jsp">Go to view your profile</a></li>
                <li><a class="uk-link-text" href="ServletViewAllData">View All Data</a></li>
                <li>List item 3</li>
            </ul>
        </div>
    </div>


<script src="asset/js/uikit.min.js"></script>
</body>
</html>
