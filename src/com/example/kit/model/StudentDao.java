package com.example.kit.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class StudentDao {

    // The JDBC Connector Class.
    private static final String dbClassName = "com.mysql.jdbc.Driver";

    private static Connection getConnection(){
        Connection connection = null;
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password","");

        try {
            Class.forName(dbClassName);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", properties);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

    public static int save(Students students){

        int status = 0;
        try {
            Connection connection = StudentDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student_info(std_name, std_email, std_pass, std_batch) VALUE (?, ?, ?, ?)");
            preparedStatement.setString(1, students.getName());
            preparedStatement.setString(2, students.getEmail());
            preparedStatement.setString(3, students.getPassword());
            preparedStatement.setString(4, students.getBatch());

            status = preparedStatement.executeUpdate();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;

    }

    public static int update(Students students){

        int status = 0;
        try {
            Connection connection = StudentDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update student_info set std_name = ?, std_email = ?, std_pass = ?, std_batch = ? where std_id = ? ;");
            preparedStatement.setString(1, students.getName());
            preparedStatement.setString(2, students.getEmail());
            preparedStatement.setString(3, students.getPassword());
            preparedStatement.setString(4, students.getBatch());

            status = preparedStatement.executeUpdate();

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;

    }

    public static int delete(Students students){

        int status = 0;
        try {
            Connection connection = StudentDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM student_info WHERE std_id = ?");
            preparedStatement.setInt(1, students.getId());

            status = preparedStatement.executeUpdate();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;

    }

    public static Students getStudents(int std_id){

        Students students = new Students();

        try {
            Connection connection = StudentDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student_info WHERE std_id = ?");
            preparedStatement.setInt(1, students.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                students.setId(resultSet.getInt(1));
                students.setName(resultSet.getString(2));
                students.setEmail(resultSet.getString(3));
                students.setPassword(resultSet.getString(4));
                students.setBatch(resultSet.getString(5));
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;

    }

    public static List<Students> getAllStudents(){

        List<Students> list = new ArrayList<Students>();

        try {
            Connection connection = StudentDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student_info");
            ResultSet resultSet = preparedStatement.executeQuery();

            Students students = new Students();
            while (resultSet.next()){
                students.setId(resultSet.getInt(1));
                students.setName(resultSet.getString(2));
                students.setEmail(resultSet.getString(3));
                students.setPassword(resultSet.getString(4));
                students.setBatch(resultSet.getString(5));
                System.out.println(students.getName());
                list.add(students);
                System.out.println(list);
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(list);

        return list;

    }

    public static Students validation(String uname, String upass){

        Students students = new Students();

        try{
            Connection connection = StudentDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student_info WHERE std_name = ? AND std_pass = ?");
            preparedStatement.setString(1, uname);
            preparedStatement.setString(2, upass);
            ResultSet resultSet = preparedStatement.executeQuery();
            students.setId(resultSet.getInt(1));
            students.setName(resultSet.getString(2));
            students.setEmail(resultSet.getString(3));
            students.setPassword(resultSet.getString(4));
            students.setBatch(resultSet.getString(5));

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        return students;
    }

}
