package cl.myconstruction.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        if ("admin".equals(usuario) && "admin123".equals(clave)) {
            response.getWriter().append("<h1>Bienvenido, " + usuario + "!</h1>");
        } else {
            response.getWriter().append("<h1>Error: Usuario o contraseña incorrectos.</h1>");
        }
    }
}