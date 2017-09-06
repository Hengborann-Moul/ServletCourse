package com.example.kit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tadashii on 7/17/2017.
 */
@WebServlet(name = "ServletLogoutCookie")
public class ServletLogoutCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect("index.jsp");

        Cookie cookie = new Cookie("name", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);

    }
}
