
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "LogInServlet", urlPatterns = {"/LogInServlet"})
public class LogInServlet extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         response.getWriter().print ("GET request");
       
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
         String email = request.getParameter("email");
         String password = request.getParameter("password");
        
        if(email.equals("admin@admin.com")& password.equals("1234")){
                response.getWriter().print("Success");
            }else{
                    
                response.getWriter().print("Invalide Details");
            }
    }
    
    
}
