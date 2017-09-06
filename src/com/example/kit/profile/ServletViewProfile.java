package com.example.kit.profile;

import com.example.kit.model.StudentDao;
import com.example.kit.model.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletViewProfile")
public class ServletViewProfile extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Students students = StudentDao.validation(username, password);
        if (students == null){
            request.setAttribute("message", "Your user name or password is incorrect.");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }else {
            printWriter.println("This is your username: "+ students.getName());
            printWriter.println("This is your password:" + students.getEmail());
            printWriter.println("This is your Batch: " + students.getBatch());
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
