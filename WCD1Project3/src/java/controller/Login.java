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

public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        ServletContext context = request.getServletContext();

        ArrayList<User> users = (ArrayList<User>) context.getAttribute("userList");

        for (User u : users) {
            if (getEmail().equals(email) && u.getPassword().equals(password)) {
            }
        }
        
        response.getWriter().write("Invalid Credentials");
        
    }

}
