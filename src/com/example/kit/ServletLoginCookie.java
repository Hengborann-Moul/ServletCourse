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
@WebServlet(name = "ServletLoginCookie")
public class ServletLoginCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Cookie cookie = new Cookie("username", username);

        if (username.equals("Tadashi") && password.equals("ratanaktepi")){
            response.addCookie(cookie);
            request.getRequestDispatcher("index_cookie.jsp").include(request, response);
            System.out.println("This is cookie value:" + cookie.getValue());
        }else {
            String message = "Your username or password not correct!!";
            request.setAttribute("errormessage", message);
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("login.jsp").forward(request,response);

    }
}
