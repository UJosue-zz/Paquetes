package me.ujosue.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import me.ujosue.bean.Paquete;
import me.ujosue.bean.Ruta;
import me.ujosue.bean.Usuario;
import me.ujosue.db.Conexion;
import me.ujosue.db.Encriptar;

public class NuevoPaquete extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		RequestDispatcher despachador = null;
		Encriptar.getInstancia();
		double lat=0;
		double lng=0;
		String empresa = "Google, palo alto";
		double costo = Double.valueOf((req.getParameter("txtPeso")));
		Ruta ruta = new Ruta(
			0,
			req.getParameter("txtNombre"),
			lat,
			lng,
			lat,
			lng,
			empresa,
			req.getParameter("txtDireccion")
		);
		
		Paquete paquete = new Paquete(
				0,
				req.getParameter("txtNombre"),
				Integer.parseInt(req.getParameter("txtPeso")),
				costo,
				ruta,
				(Usuario) req.getSession().getAttribute("usuario")
				);
		Conexion.getInstancia().agregar(ruta);
		Conexion.getInstancia().agregar(paquete);
		despachador=req.getRequestDispatcher("nuevoPaquete.jsp");
		despachador.forward(req, resp);
		System.out.println("Paquete agregado");
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		doPost(req, resp);
	}
}
