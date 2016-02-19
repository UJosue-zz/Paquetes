package me.ujosue.bean;

public class Paquete {
	private int idPaquete;
	private String nombre;
	private double peso;
	private double costo;
	private Ruta idRuta;
	private Usuario idUsuario;
	public Paquete(int idPaquete, String nombre, double peso, double costo, Ruta idRuta, Usuario idUsuario){
		this.idPaquete = idPaquete;
		this.nombre = nombre;
		this.peso = peso;
		this.costo = costo;
		this.idRuta = idRuta;
		this.idUsuario = idUsuario;
	}
	public Paquete(){
		super();
	}
	public int getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(int idPaquete) {
		this.idPaquete = idPaquete;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public Ruta getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(Ruta idRuta) {
		this.idRuta = idRuta;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	
}
