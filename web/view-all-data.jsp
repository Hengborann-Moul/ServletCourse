<%@ page import="com.example.kit.model.Students" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: tadashii
  Date: 8/23/2017
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All data</title>
    <link rel="stylesheet" href="asset/css/uikit.min.css">
    <script src="asset/js/jquery.min.js"></script>
    <script src="asset/js/main.js"></script>
</head>
<body>

    <%@include file="include/navbar.jsp"%>

    <div class="uk-container">
        <h1 class="uk-heading-divider" align="center">This is all datas in Database</h1>
    </div>
    <div class="uk-container-small uk-flex-wrap uk-align-center">
        <table class="uk-table uk-table-divider">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Batch</th>
                </tr>
            </thead>
            <tbody>
                <%
                    ArrayList<Students> students = (ArrayList<Students>) request.getAttribute("students");
                    for (Students student: students){
                        out.println("<tr>");
                        out.println("<td>"+ student.getId() +"</td>");
                        out.println("<td>"+ student.getName() +"</td>");
                        out.println("<td>"+ student.getEmail() +"</td>");
                        out.println("<td>"+ student.getPassword() +"</td>");
                        out.println("<td>"+ student.getBatch() +"</td>");
                        out.println("</tr>");
                    }
                %>
            </tbody>
        </table>
    </div>

<script src="asset/js/uikit.min.js"></script>
</body>
</html>
