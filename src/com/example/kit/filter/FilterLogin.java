package com.example.kit.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by tadashii on 7/12/2017.
 */
@WebFilter(filterName = "FilterLogin")
public class FilterLogin implements Filter {

    private static int AdminRequestTime = 0;
    private static int TeacherRequestTime = 0;
    private static int StudentRequestTime = 0;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        String role = req.getParameter("role");

        try {
            if (role.isEmpty() || role.equals(null)){
                role = "";
            }
        }catch (NullPointerException e){
            role = "";
        }

        switch (role){
            case "Student":
                StudentRequestTime ++;
                break;
            case "Admin":
                AdminRequestTime ++;
                break;
            case "Teacher":
                TeacherRequestTime ++;
                break;
            default:
                break;
        }

        req.setAttribute("student", StudentRequestTime);
        req.setAttribute("teacher", TeacherRequestTime);
        req.setAttribute("admin", AdminRequestTime);

        chain.doFilter(req, resp);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("This is Admin Request Time:  " + AdminRequestTime);
        System.out.println("This is Teacher Request Time:  " + TeacherRequestTime);
        System.out.println("This is Student R:  " + StudentRequestTime);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }

    public void init(FilterConfig config) throws ServletException {



    }

}
