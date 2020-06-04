package demos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pila {
	
	//variables
	String n;
	
	public pila(){
		n = "adios mundo";
		inicia();
	}
	public pila(String n){
		this.n = n;
		inicia();
	}
	
	private void inicia(){
		System.out.println(n);
	}
	
	private void ejecuta() throws IOException{
		int N;  // <-- declaracion  
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Localidades en pila? ");
		N = Integer.parseInt(entrada.readLine()); // <-- asignación 
		int[] xpila = new int[N];
		int dato,opcion,i;
		int cima = (-1);
		int tope = (N-1);
		do { // do-while || while-do || for
	    	System.out.println("       M e n u");
			System.out.println(" 1. Insertar en pila");
		    System.out.println(" 2. Eliminar de pila");
			System.out.println(" 3. Consultar datos en pila");
	    	System.out.println(" 4. Salir");System.out.println("");
	    	System.out.print("Escoja una opcion ");
			opcion=Integer.parseInt(entrada.readLine());
	    	System.out.println("");
	    	
        	switch(opcion){
			  	case 1:
			  			if (cima == tope) {
			  				System.out.println("Pila llena, no hay espacio ");
			  			} else {
			  				System.out.print("Teclee dato a insertar ");
							dato=Integer.parseInt(entrada.readLine());
							cima++;
							xpila[cima]=dato;
						} 					 	
	  				    break;
			  			
			  	case 2: 
			  			if (cima==(-1)) {
			            	System.out.println("Pila vacia, no hay datos por procesar");
			  			} else {
			  				dato=xpila[cima];
			  				System.out.println("Dato procesado: "+dato);
			  				cima--;
			  			}  					 	
	  				    break;
			  	case 3: 
			  			if (cima==(-1)) {
			            	System.out.println("Pila vacia, no hay datos para mostrar");
			  			} else {
			  				System.out.println(" Datos en la pila actualmente:");
							for (i=cima;i>=0;i--)
								System.out.println("Pila["+i+"]= "+xpila[i]);
							
			    		} 
        				break;
				case 4: 
						System.out.println("Fin de proceso, ?Excelente dia!");
				        break;
			  	default:
				  		System.out.println("Error de opcion, unicamente del 1 al 4!!!!");
				        break;	 
		 	} //CIERRA switch
		 } while ((opcion>=1) && (opcion<=3));
  		System.out.println("bye");
		System.exit(0);
	}
	
	public static void main( String[] args ) {
		pila nuevaClase = new pila();
		try {
			nuevaClase.ejecuta();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} //CIERRA main

}

