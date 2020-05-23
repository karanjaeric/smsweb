/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;

/**
 *
 * @author ekaranja
 */
@WebServlet(name = "StudentServlet", urlPatterns = {"/student"})
public class StudentServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String name = request.getParameter("name");
            String regno = request.getParameter("regNo");
            String gender = request.getParameter("gender");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String course = request.getParameter("course");
            String phoneNumber = request.getParameter("phoneNumber");
            Student student = new Student();
            student.setName(name);
            student.setGender(gender);
            student.setRestrationNumber(regno);
            student.setUsername(username);
            student.setPassword(password);
            student.setCourse(course);

            String url = "jdbc:mysql://localhost:3306/smsdatabase?useSSL=false";
            String dbUsername = "root";
            String dbPassword = "";
            String insertStudentQuery = "insert into students (name,registrationNumber,gender,course,phoneNumber,username,password)"
                    + "values (?,?,?,?,?,?,?)";
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            PreparedStatement insertPst = connection.prepareStatement(insertStudentQuery, Statement.RETURN_GENERATED_KEYS);
            insertPst.setString(1, name);
            insertPst.setString(2, regno);
            insertPst.setString(3, gender);
            insertPst.setString(4, course);
            insertPst.setString(5, phoneNumber);
            insertPst.setString(6, username);
            insertPst.setString(7, password);

            insertPst.executeUpdate();
            ResultSet rs = insertPst.getGeneratedKeys();
            int id=0;
            if (rs.first()) {
                id=rs.getInt(1);
                System.out.println("Your Account created Successfully " + id);
            }
            request.setAttribute("message", "Dear "+name+"Your Account Was created Successfully Your ID=>" + id);
            request.getRequestDispatcher("/response.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(StudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
