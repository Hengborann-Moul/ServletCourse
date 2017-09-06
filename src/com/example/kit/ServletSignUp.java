package com.example.kit;

import com.example.kit.model.StudentDao;
import com.example.kit.model.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletSignUp")
public class ServletSignUp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String batch = request.getParameter("batch");

        Students students = new Students();
        students.setName(name);
        students.setEmail(email);
        students.setPassword(password);
        students.setBatch(batch);

        int status = StudentDao.save(students);
        if (status>0){
            String message = "SignUp successfully! now you can login";
            request.setAttribute("message", message);
            request.getRequestDispatcher("ServletLoginForm").forward(request, response);
        }else {
            String error_message = "Sorry we are unable to save you record.";
            request.setAttribute("error_message", error_message);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("signup.jsp").forward(request,response);
    }
}
