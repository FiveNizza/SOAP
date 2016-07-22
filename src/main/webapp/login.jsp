<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
    <body>
        <form name="LoginForm" method="post" action="controller">
            <input type="hidden" name="command" value="login">
            <label>Login </label>
            <input type="text" name="login" value=""/>  <br/>
            <label>Password</label>
            <input type="password" name="password" value=""/>
            <br/>
            ${ errorLoginPassMessage }
            <input type="submit" name="command" value="Login"/>
        </form>
    </body>
</html>