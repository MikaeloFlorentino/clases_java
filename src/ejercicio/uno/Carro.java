package ejercicio.uno; // contenedor de clases que permite agrupar diferentes partes de un programa

public class Carro { // cualquier tipo de clase puede acceder a ella
	
	private int puertas; // private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, int es un tipo de dato entero
	private Llanta llanta; //private no puede acceder por codigo de otra clase
	private Motor motor; //private no puede acceder por codigo de otra clase
	private int velocidades; // private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, int es un tipo de dato entero
	private int asientos; // private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, int es un tipo de dato entero
	private String Marca; //private no puede acceder por codigo de otra clase, string ingresamos cualquier caracter o numero
	private int ventanas; // private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, int es un tipo de dato entero
	private int anio; // private no puede acceder por codigo de otra clase,excepto por los que fueron declarados, int es un tipo de dato entero
	private String modelo; //private no puede acceder por codigo de otra clase, string ingresamos cualquier caracter o numero
	private double precio; //private no puede acceder por codigo de otra clase,double lo usamos para ingresar numeros decimales
	private String color; //private no puede acceder por codigo de otra clase, string ingresamos cualquier caracter o numero
	
	public int getPuertas() { // public cualquier clase puede acceder a el,int es el tipo entero, getpuertas es mostrar o obtener el dato
		return puertas; // return es el fin del metodo y regresa al principio
	}
	public void setPuertas(int puertas) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo, int tipo de dato entero
		this.puertas = puertas; //this se utiliza para hacer referencia al objeto actual
	}
	public Llanta getLlanta() { // public cualquier clase puede acceder a el,int es el tipo entero, getpuertas es mostrar o obtener el dato
		return llanta;  // return es el fin del metodo y regresa al principio
	}
	public void setLlanta(Llanta llanta) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo
		this.llanta = llanta; //this se utiliza para hacer referencia al objeto actual
	}
	public Motor getMotor() { // public cualquier clase puede acceder a el, getpuertas es mostrar o obtener el dato
		return motor;  // return es el fin del metodo y regresa al principio
	}
	public void setMotor(Motor motor) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo
		this.motor = motor; //this se utiliza para hacer referencia al objeto actual
	}
	public int getVelocidades() { // public cualquier clase puede acceder a el,int es el tipo entero, getpuertas es mostrar o obtener el dato
		return velocidades;  // return es el fin del metodo y regresa al principio
	}
	public void setVelocidades(int velocidades) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo, int tipo de dato entero
		this.velocidades = velocidades; //this se utiliza para hacer referencia al objeto actual
	}
	public int getAsientos() { // public cualquier clase puede acceder a el,int es el tipo entero, getpuertas es mostrar o obtener el dato
		return asientos;  // return es el fin del metodo y regresa al principio
	}
	public void setAsientos(int asientos) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo, int tipo de dato entero
		this.asientos = asientos; //this se utiliza para hacer referencia al objeto actual
	}
	public String getMarca() { // public cualquier clase puede acceder a el,int es el tipo entero, getpuertas es mostrar o obtener el dato
		return Marca;  // return es el fin del metodo y regresa al principio
	}
	public void setMarca(String marca) { //public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo, string sirve para representar caracteres o numeros
		Marca = marca;
	}
	public int getVentanas() { // public cualquier clase puede acceder a el,int es el tipo entero, getpuertas es mostrar o obtener el dato
		return ventanas;  // return es el fin del metodo y regresa al principio
	}
	public void setVentanas(int ventanas) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el atributo,int  tipo de dato entero
		this.ventanas = ventanas; //this se utiliza para hacer referencia al objeto actual
	}
	public int getAnio() { // public cualquier clase puede acceder a el,int es el tipo entero, getpuertas es mostrar o obtener el dato
		return anio;  // return es el fin del metodo y regresa al principio
	}
	public void setAnio(int anio) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualiar el atributo, int tipo de dato entero
		this.anio = anio; //this se utiliza para hacer referencia al objeto actual
	}
	public String getModelo() { //cualquier clase puede aaceder a el, string representa numeros o caracteres, get es para mostra o modificar el dato
		return modelo;  // return es el fin del metodo y regresa al principio
	}
	public void setModelo(String modelo) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion,, set sirve para modificar o actualizar el valor, string sirve para representar caracteres y numeros
		this.modelo = modelo; //this se utiliza para hacer referencia al objeto actual
	}
	public double getPrecio() { // public cualquier clase puede acceder a el,double se utiliza paranumeros deciamles, get es mostrar o obtener el dato
		return precio;  // return es el fin del metodo y regresa al principio
	}
	public void setPrecio(double precio) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el valor,double sirve para ingresar numeros decimales
		this.precio = precio; //this se utiliza para hacer referencia al objeto actual
	}
	public String getColor() { // public cualquier clase puede acceder a el, set sirve para modificar o actualizar el valor, string sirve para representar caracteres y numeros
		return color;  // return es el fin del metodo y regresa al principio
	}
	public void setColor(String color) { // public void cualquier clase puede acceder a el y el objeto regresa a la funcion, set sirve para modificar o actualizar el valor, string sirve para representar caracteres y numeros
		this.color = color; //this se utiliza para hacer referencia al objeto actual
	}

	
}
