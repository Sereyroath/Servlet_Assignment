/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class insertRecord extends HttpServlet {
    Statement st;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        students std = new students();
        std.setFullname( request.getParameter("fullname"));
        std.setAge(request.getParameter("age"));
        std.setMajor(request.getParameter("major"));
        std.setBatch(request.getParameter("batch"));
        System.out.println(std.getBatch());
        try {
            st = connectDB.getConnection().createStatement();
            st.execute("insert into students(fullname,age,major,batch,student_id) values ('"+std.getFullname()+"','"+std.getAge()+"','"+std.getMajor()+"','"+std.getBatch()+"','"+1+"')");
            System.out.println("Insert Succesfully");

        } catch (SQLException ex) {
            request.setAttribute("inserted", "false");
            Logger.getLogger(insertRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("inserted", "true");
        request.getRequestDispatcher("InsertRecord.jsp").forward(request, response);
    }
}
