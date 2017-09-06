package com.example.kit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tadashii on 7/12/2017.
 */
@WebServlet(name = "ServletLoginFilter")
public class ServletLoginFilter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter printWriter = response.getWriter();
        int StudentRequestTime = (int) request.getAttribute("student");
        int TeacherRequestTime = (int) request.getAttribute("teacher");
        int AdminRequestTime = (int) request.getAttribute("admin");

        printWriter.println("This is Admin Request Time:  " + AdminRequestTime);
        printWriter.println("This is Teacher Request Time:  " + TeacherRequestTime);
        printWriter.println("This is Student Request Time:  " + StudentRequestTime);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("login.jsp").forward(request, response);

    }
}
