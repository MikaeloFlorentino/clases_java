package ejercicio.uno;

public class Motor extends Estatus{

	private int cilindro;
	private double litros;
	private int caballosFuerza;
	private String Marca;
	
	public int getCilindro() {
		return cilindro;
	}
	public void setCilindro(int cilindro) {
		this.cilindro = cilindro;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public int getCaballosFuerza() {
		return caballosFuerza;
	}
	public void setCaballosFuerza(int caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	
}
