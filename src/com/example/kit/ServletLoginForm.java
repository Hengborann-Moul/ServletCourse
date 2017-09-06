package com.example.kit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tadashi on 6/20/17.
 */
@WebServlet(name = "ServletLoginForm")
public class ServletLoginForm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("Tadashi") && password.equals("ratanaktepi")){

            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("username", username);
            httpSession.setAttribute("password", password);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(request, response);

        }else {
            String message = "Your username or password not correct!!";
            request.setAttribute("errormessage", message);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        request.getRequestDispatcher("login.jsp").forward(request,response);

    }
}
