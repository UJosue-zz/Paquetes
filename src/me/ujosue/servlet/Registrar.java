package me.ujosue.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import me.ujosue.bean.Usuario;
import me.ujosue.db.Conexion;
import me.ujosue.db.Encriptar;

public class Registrar extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	System.out.println("Registrando");
	RequestDispatcher despachador = null;
	Encriptar.getInstancia();
	Usuario usuario = new Usuario(
			null,
			req.getParameter("txtNombre"),
			req.getParameter("txtUsuario"),
			Encriptar.getMD5(req.getParameter("txtContrasena"))
			);
	Conexion.getInstancia().agregar(usuario);
	HttpSession sesion = req.getSession(true);
	sesion.setAttribute("usuario", usuario);
	despachador=req.getRequestDispatcher("nuevoPaquete.jsp");
	despachador.forward(req, resp);
	System.out.println("Usuario agregado");
}
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	doPost(req, resp);
}
}
