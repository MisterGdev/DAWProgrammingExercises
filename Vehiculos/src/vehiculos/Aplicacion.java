package vehiculos;

import java.util.Scanner;

public class Aplicacion {

	public Aplicacion() {
		
		Scanner teclado = new Scanner(System.in); 
		int kmh; //Define teclado y la variable "kmh" tipo int.
		
		System.out.println("¡Bienvenido al configurador de vehiculos! "); //Inicia el programa
		
		Coche coche1 = new Coche(); //Crea un objeto de la clase coche
		
		System.out.println("¿Cuantos Km/h quieres que acelere tu coche?");
		
		kmh = teclado.nextInt(); //Le dice que el parámetro que hemos descrito antes será = a lo que el usuario ponga (tipo entero)
		
		coche1.acelerar(kmh); //Llama a acelerar ese coche.
		
		System.out.println("Tu coche ha acelerado, su velocidad actual es de: " + coche1.getVelocidad() ); //Informa de coche1.acelerar.
		
		
		System.out.println("¿Cuántos Km/h quieres que reduzca tu coche?");
		
		kmh = teclado.nextInt();
		coche1.frenar(kmh);
		
		System.out.println("Tu coche ha frenado, su velocidad actual es de: " + coche1.getVelocidad() + " km/h y las revoluciones son: " + coche1.getRevoluciones() ); 
	}
	
	
	public static void main(String[] args) {
		Aplicacion miAplicacion = new Aplicacion();
	}
}

