<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Construction - Login</title>
</head>
<body>
    <h2>Iniciar Sesión</h2>
    <form action="LoginServlet" method="post">
        <table>
            <tr>
                <td>Usuario:</td>
                <td><input type="text" name="usuario" required/></td>
            </tr>
            <tr>
                <td>Contraseña:</td>
                <td><input type="password" name="clave" required/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Ingresar"/></td>
            </tr>
        </table>
    </form>
</body>
</html>