package com;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class connectDB extends HttpServlet {

    static private Connection con;
    private static boolean connected=false;
    
    static {
        String dbUrl = "jdbc:mysql://localhost:3306/assignment";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl,user,pass);
            System.out.println("DB is CONNECTED");
            connected = true;
        } catch (ClassNotFoundException | SQLException ex) {
            connected = false;            
            Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    
    public static Connection getConnection(){
        return con;
    }

    public static boolean isConnected(){
        return connected;
    }
    

}
