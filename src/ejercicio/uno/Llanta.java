package ejercicio.uno; // contenedor de clases que permite agrupar diferentes partes de un programa

import java.util.Date; // import es importar, java.util.date contiene clases para fechas y tiempo generador de numeros y arreglos, date no se si sea de los mismo?

public class Llanta extends Estatus{ // cualquier tipo de clase puede acceder a ella, extends era el contenido de una clase
	
	private int pulgadasRin; //private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, int es un tipo de dato entero
	private String marca; //private no puede acceder por codigo de otra clase,excepto por los que fueron declarados,string representa numeros y caracteres
	private int ancho; //private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, int es un tipo de dato entero
	private int capacidadVolumen; //private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, int es un tipo de dato entero
	private Date fechaCreacion;//private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, date es fecha
	private double precio; //private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, double se para numeros decimales
	
	public int getPulgadasRin() { // public cualquier clase puede acceder a el,int es el tipo entero, get es mostrar o obtener el dato
		return pulgadasRin; // return es el fin del metodo y regresa al principio
	}
	public void setPulgadasRin(int pulgadasRin) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo,int  tipo de dato entero
		this.pulgadasRin = pulgadasRin; //this se utiliza para hacer referencia al objeto actual
	}
	public String getMarca() { //cualquier clase puede acceder a el, string representa numeros o caracteres, get es para mostra o modificar el dato
		return marca; // return es el fin del metodo y regresa al principio
	}
	public void setMarca(String marca) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo,string representa numeros y caracteres
		this.marca = marca; //this se utiliza para hacer referencia al objeto actual
	}
	public int getAncho() { // public cualquier clase puede acceder a el,int es el tipo entero, get es mostrar o obtener el dato
		return ancho;// return es el fin del metodo y regresa al principio
	}
	public void setAncho(int ancho) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo,int  tipo de dato entero
		this.ancho = ancho; //this se utiliza para hacer referencia al objeto actual
	}
	public int getCapacidadVolumen() { // public cualquier clase puede acceder a el,int es el tipo entero, get es mostrar o obtener el dato
		return capacidadVolumen;// return es el fin del metodo y regresa al principio
	}
	public void setCapacidadVolumen(int capacidadVolumen) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo,int  tipo de dato entero
		this.capacidadVolumen = capacidadVolumen; //this se utiliza para hacer referencia al objeto actual
	}
	public Date getFechaCreacion() { // public cualquier clase puede acceder a el,int es el tipo entero, get es mostrar o obtener el dato
		return fechaCreacion;// return es el fin del metodo y regresa al principio
	}
	public void setFechaCreacion(Date fechaCreacion) {// public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo
		this.fechaCreacion = fechaCreacion; //this se utiliza para hacer referencia al objeto actual
	}
	public double getPrecio() { // public cualquier clase puede acceder a el, double lo usamos para numeros decimales, get mostrar o obtener el dato
		return precio; // return es el fin del metodo y regresa al principio
	}
	public void setPrecio(double precio) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo, double lo usamos para numeros decimales
		this.precio = precio; //this se utiliza para hacer referencia al objeto actual
	}

	
}
