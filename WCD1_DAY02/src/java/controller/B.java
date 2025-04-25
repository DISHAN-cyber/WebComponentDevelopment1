
package controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;



@WebServlet(name = "B", urlPatterns = {"/B"})
public class B extends HttpServlet {

    
    @Override
    public void init() throws ServletException {
       System.out.println("hello");
    }

}
