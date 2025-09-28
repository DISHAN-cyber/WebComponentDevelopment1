
<%@page import="java.util.ArrayList"%>
<%@page import="model.user"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>user</h1>
        <hr/>

        <table>
            <thead>
                <tr>
                    <td>Name</td>
                    <td>Age</td>
                    <td>Gender</td>
                    <td>Mobile</td>
                </tr>
            </thead>
            <tbody>
                <%
                    ServletContext context = getServletContext();
                    ArrayList<user> users = (ArrayList<user>) context.getAttribute("userList");
                %>

                <%
                    if(users != null){
                        for (user u : users) {
                     %>
                <tr>
                    <td><%out.print(u.getName());%></td>
                    <td><%out.print(u.getAge());%></td>
                    <td><%out.print(u.getGender());%></td>
                    <td><%out.print(u.getMobile());%></td>
                </tr>
                <%
                        }
                    }else{
                    %>
                    <tr>
                        <td>No user found!    </td>
                    </tr>
                <%
}
                %>
              
            </tbody>
        </table>
    </body>
</html>
