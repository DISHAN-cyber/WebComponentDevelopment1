

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login To The System</title>
    </head>
    <body>
        <h1>Login To the System</h1>
        <form method="post" action="Login">
            <label>Email:</label><input type ="Email" name="email"/>
            <br/>
            <label>password:</label><input type ="password" name="password"/>
            <br/>
            <button type="submit">Login</button>
        </form>
    </body>
</html>
