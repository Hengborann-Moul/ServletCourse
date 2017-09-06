<%--
Created by IntelliJ IDEA.
User: tadashi
Date: 7/1/17
Time: 3:49 PM
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlet Course</title>
    <link rel="stylesheet" href="asset/css/main.css">
    <link rel="stylesheet" href="asset/css/uikit.min.css">
</head>
<body>

    <%@include file="include/cookie_navbar.jsp"%>

    <div class="uk-container">
        <div class="uk-align-center">
            <h1 class="uk-heading-divider" align="center">Welcome to Servlet Course</h1>
        </div>
        <div class="uk-container-small uk-flex-wrap uk-align-center">
            <ul class="uk-list uk-list-striped">
                <li><a class="uk-link-text" href="ServletLoginForm">Go to login page</a></li>
                <li><a class="uk-link-text" href="ServletHeaderRequest">Go to See Header Request</a></li>
                <li><a class="uk-link-text" href="ServletShowConfig">Go to See Servlet Config</a></li>
                <li>List item 2</li>
                <li>List item 3</li>
            </ul>
        </div>
    </div>

    <script src="asset/js/jquery.min.js"></script>
    <script src="asset/js/uikit.min.js"></script>
    <script src="asset/js/uikit-icons.min.js"></script>
    <script src="asset/js/main.js"></script>
</body>
</html>