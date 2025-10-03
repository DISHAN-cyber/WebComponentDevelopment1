

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>x</title>
    </head>
    <body>
        <h1>welcome</h1>
        
        <%
        
        for (int i = 1; i<= 10; i++){
        %>
        <button><%= i %></button>
        
        <%
            }
        %>
    </body>
</html>
