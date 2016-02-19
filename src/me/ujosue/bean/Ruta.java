package me.ujosue.bean;

public class Ruta {
	private int idRuta;
	private String nombre;
	private double latIn;
	private double lngIn;
	private double latFin;
	private double lngFin;
	private String direccionEnvio;
	private String direccionRecibe;
	public Ruta(int idRuta, String nombre, double latIn, double lngIn, double latFin, double lngFin, String direccionEnvio, String direccionRecibe){
		this.idRuta = idRuta;
		this.nombre = nombre;
		this.latIn = latIn;
		this.lngIn = lngIn;
		this.latFin = latFin;
		this.lngFin = lngFin;
		this.direccionEnvio = direccionEnvio;
		this.direccionRecibe = direccionRecibe;
	}
	public Ruta(){
		super();
	}
	public int getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLatIn() {
		return latIn;
	}
	public void setLatIn(double latIn) {
		this.latIn = latIn;
	}
	public double getLngIn() {
		return lngIn;
	}
	public void setLngIn(double lngIn) {
		this.lngIn = lngIn;
	}
	public double getLatFin() {
		return latFin;
	}
	public void setLatFin(double latFin) {
		this.latFin = latFin;
	}
	public double getLngFin() {
		return lngFin;
	}
	public void setLngFin(double lngFin) {
		this.lngFin = lngFin;
	}
	public String getDireccionEnvio() {
		return direccionEnvio;
	}
	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}
	public String getDireccionRecibe() {
		return direccionRecibe;
	}
	public void setDireccionRecibe(String direccionRecibe) {
		this.direccionRecibe = direccionRecibe;
	}
	
}
