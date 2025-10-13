
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    String email = "";
    String password = "";
    boolean remember = false;

    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("email")) {
                email = c.getValue();
            } else if (c.getName().equals("password")) {
                password = c.getValue();
            }
        }
        if (email != "" && password != "") {
            remember = true;
        }
    }
%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User Login</title>
        <link rel="stylesheet" href="css/style.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

    </head>
    <body>
        <div class="login-container">
            <div class="login-header">
                <h1>
                    <span class="user-icon">👤</span>
                    User Login
                </h1>
            </div>

            <form action="Login" method="POST">
                <div class="form-group">
                    <label>Email Address</label>
                    <div class="input-wrapper">
                        <div class="input-icon">✉️</div>
                        <input type="email" name="email" id="email" placeholder="Enter your email" value="<%=email%>" required>
                    </div>
                </div>

                <div class="form-group">
                    <label>Password</label>
                    <div class="input-wrapper">
                        <div class="input-icon">🔒</div>
                        <input type="password" name="password" id="password" placeholder="Enter your password" value="<%= password%>" required>
                    </div>
                </div>

                <div class="form-options">
                    <label class="remember-me">
                        <input type="checkbox" name="remember" id="remember" <%if(remember){out.write("checked");}%>>
                        Remember Me
                    </label>
                    <a href="#" class="forgot-password">Forgot Password?</a>
                </div>

                <button type="submit" class="login-button">
                    <span>🔓</span>
                    Login
                </button>

                <div class="signup-link">
                    Don't have an account? <a href="#">Sign Up</a>
                </div>
            </form>
        </div>
    </body>
</html>