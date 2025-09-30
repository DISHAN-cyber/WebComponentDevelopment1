
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;
import model.user;


public class adduser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        ServletContext context = request.getServletContext();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        User u = new User(email,password);
        
        ArrayList<User> users;
        
        if(context.getAttribute("userList")== null){
            users = new ArrayList<>();
        }else{
            users =(ArrayList<User>) context.getAttribute("userList");
        }
        
        users.add(u);
        
        response.getWriter().write("New user add successfully!");
    }

 

}
