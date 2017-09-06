package com.example.kit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by tadashi on 6/21/17.
 */
@WebServlet(name = "ServletHeaderRequest")
public class ServletHeaderRequest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Headers</h1><hr>");
        Enumeration<String> headernames = request.getHeaderNames();

        while (headernames.hasMoreElements()){
            String headername = headernames.nextElement();
            out.print("Header Name: <em>" + headername);
            String headervalue = request.getHeader(headername);
            out.print("</em>, Header Value: <em>" + headervalue);
            out.println("<em><br/>");
        }
    }
}
