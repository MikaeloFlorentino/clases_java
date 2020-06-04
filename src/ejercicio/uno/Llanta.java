package ejercicio.uno;

import java.util.Date;

public class Llanta extends Estatus{
	
	private int pulgadasRin;
	private String marca;
	private int ancho;
	private int capacidadVolumen;
	private Date fechaCreacion;
	private double precio;
	
	public int getPulgadasRin() {
		return pulgadasRin;
	}
	public void setPulgadasRin(int pulgadasRin) {
		this.pulgadasRin = pulgadasRin;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getCapacidadVolumen() {
		return capacidadVolumen;
	}
	public void setCapacidadVolumen(int capacidadVolumen) {
		this.capacidadVolumen = capacidadVolumen;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
}
