package com.example.kit.connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by tadashi on 7/1/17.
 */
@WebServlet(name = "ServletConnection")
public class ServletConnection extends HttpServlet {

    // The JDBC Connector Class.
    private static final String dbClassName = "com.mysql.jdbc.Driver";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        /*username and password*/
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password","");


        try {
            Class.forName(dbClassName);
            out.println("JDBC Driver Loaded.");
        } catch (ClassNotFoundException e) {
            out.println("Can't Load JDBC Driver");
        }

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", properties);
            out.println("Connected to database.");
        } catch (SQLException e) {
            /*e.printStackTrace();*/
            out.println("Can't connect to database.");
        }

        try {
            connection.close();
        } catch (SQLException e) {
            /*e.printStackTrace();*/
            out.println("Can't close the connection.");
        }

    }
}
