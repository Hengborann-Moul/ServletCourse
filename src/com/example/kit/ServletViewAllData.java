package com.example.kit;

import com.example.kit.model.StudentDao;
import com.example.kit.model.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletViewAllData")
public class ServletViewAllData extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Students> students;

        students = StudentDao.getAllStudents();

        for (Students student:students){
            System.out.println(student.getName());
        }

        request.setAttribute("students", students);

        request.getRequestDispatcher("view-all-data.jsp").forward(request, response);

    }
}
