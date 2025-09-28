/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.user;


public class A extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        user u1 = new user("",20,"Male","0772345789");
        user u2 = new user("",21,"Male","0712655789");
        user u3 = new user("",22,"Female","076789809");
        user u4 = new user("",23,"Male","0787698211");
        
        ArrayList <user> user = new ArrayList<>();
        user.add(u1);
        user.add(u2);
        user.add(u3);
        user.add(u4);
      
        request.getServletContext().setAttribute("userList", user);
        response.getWriter().write("success");
    }

   

}
