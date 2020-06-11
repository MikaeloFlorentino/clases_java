package ejercicio.uno; // contenedor de clases que permite agrupar diferentes partes de un programa

public class Motor extends Estatus{ // cualquier tipo de clase puede acceder a ella, extends era el contenido de una clase

	private int cilindro; //private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, int es un tipo de dato entero
	private double litros; //private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, double se para numeros decimales
	private int caballosFuerza; //private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, int es un tipo de dato entero
	private String Marca; //private no puede acceder por codigo de otra clase,excepto por los que fueron declarados,string representa numeros y caracteres
	
	public int getCilindro() { // public cualquier clase puede acceder a el,int es el tipo entero, get es mostrar o obtener el dato
		return cilindro; // return es el fin del metodo y regresa al principio
	}
	public void setCilindro(int cilindro) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo,int  tipo de dato entero
		this.cilindro = cilindro; //this se utiliza para hacer referencia al objeto actual
	}
	public double getLitros() { // public cualquier clase puede acceder a el, double lo usamos para numeros decimales, get mostrar o obtener el dato
		return litros; // return es el fin del metodo y regresa al principio
	}
	public void setLitros(double litros) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo, double lo usamos para numeros decimales
		this.litros = litros; //this se utiliza para hacer referencia al objeto actual
	}
	public int getCaballosFuerza() { // public cualquier clase puede acceder a el,int es el tipo entero, get es mostrar o obtener el dato 
		return caballosFuerza; // return es el fin del metodo y regresa al principio
	}
	public void setCaballosFuerza(int caballosFuerza) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo,int  tipo de dato entero
		this.caballosFuerza = caballosFuerza; //this se utiliza para hacer referencia al objeto actual
	}
	public String getMarca() { //cualquier clase puede acceder a el, string representa numeros o caracteres, get es para mostra o modificar el dato
		return Marca;// return es el fin del metodo y regresa al principio
	}
	public void setMarca(String marca) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo, string representa numeros o caracteres
		Marca = marca;
	}
	
}
