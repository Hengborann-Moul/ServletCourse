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
 * Created by tadashi on 6/22/17.
 */
@WebServlet(name = "ServletLoginPage")
public class ServletLoginPage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession httpSession = request.getSession();
        String username = (String)httpSession.getAttribute("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("Hello  " + username);
        out.println("<a href='ServletLogout'>Logout</a>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
