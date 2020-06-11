package ejercicio.uno; // contenedor de clases que permite agrupar diferentes partes de un programa

public class Estatus { // cualquier tipo de clase puede acceder a ella
	
	private boolean disponible; // private es que no se puede modificar por otra clase solo por la misma clase declarada, boolean se utiliza para tener 2 valores el cierto o falso
	private String mensaje; //private es que no se puede modificar por otra clase solo por la misma clase declarada, string es para representar numeros y caracteres
	
	public Estatus(){ // public cualquiera puede acceder a ella
		disponible = false; // sentencia de que es falso
		mensaje =  "No Disponible"; // mensaje de que no esta disponible
	}
	
	public Estatus(boolean disponible, String mensaje){ //public cualquiera puede acceder a ella,boolean se utiliza para tener 2 valores el cierto o falso, string represenacion de caracteres o numeros
		this.disponible = disponible; //this hace referencia al objeto actual
		this.mensaje = mensaje; //this hace referencia al objeto actual
	}
	
	public boolean isDisponible() { //public cualquiera puede acceder a ella,boolean se utiliza para tener 2 valores el cierto o falso, is que es?
		return disponible; // return es el fin del metodo y regresa al principio
	}
	public void setDisponible(boolean disponible) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set modificar o actualizar un atributo, boolean se utiliza para tener 2 valores el cierto o falso, 
		this.disponible = disponible; //this hace referencia al objeto actual
	}
	public String getMensaje() { // public cualquiera puede acceder a ella, string representacion de caracteres o numeros, get mostrar o obyetener un dato
		return mensaje; // return es el fin del metodo y regresa al principio
	}
	public void setMensaje(String mensaje) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set modificar o actualizar un atributo, string representacion de numeros o caracteres
		this.mensaje = mensaje; //this hace referencia al objeto actual
	}
	

}
