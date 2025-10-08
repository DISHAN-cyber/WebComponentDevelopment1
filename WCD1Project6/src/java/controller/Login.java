
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        
        if (email.equals("test@gmail.com") && password.equals("1234")){
           if(remember != null){
               Cookie c1 = new Cookie("email"  , email);
               Cookie c2 = new Cookie("password"  , password);
               c1.setMaxAge(60*60*24);
               c2.setMaxAge(60*60*24);
               response.addCookie(c1);
               response.addCookie(c2);
            }else{
            Cookie c1 = new Cookie("email"  , "");
               Cookie c2 = new Cookie("password"  , "");
               c1.setMaxAge(0);
               c2.setMaxAge(0);
               response.addCookie(c1);
               response.addCookie(c2);
           }
           request.getRequestDispatcher("home.jsp").forward(request, response);
        }else{
            response.getWriter().write("Invalid");
        }
    }

    
}
