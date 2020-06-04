package ejercicio.uno;

public class Estatus {
	
	private boolean disponible;
	private String mensaje;
	
	public Estatus(){
		disponible = false;
		mensaje =  "No Disponible";
	}
	
	public Estatus(boolean disponible, String mensaje){
		this.disponible = disponible;
		this.mensaje = mensaje;
	}
	
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

}
