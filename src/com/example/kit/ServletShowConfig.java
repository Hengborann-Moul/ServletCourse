package com.example.kit;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tadashi on 6/22/17.
 */
@WebServlet(name = "ServletShowConfig")
public class ServletShowConfig extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>This is Servlet Config</h1>");

        ServletConfig config = getServletConfig();
        String developer = config.getInitParameter("developer");
        out.println("This is our developer name:  " + developer);

    }
}
