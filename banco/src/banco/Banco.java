package banco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		
		Scanner nombre = new Scanner(System.in);
		String nombreCuenta;
		
		Scanner dinero = new Scanner(System.in);
		int cantidadEuros;
		String respuesta = "si";
		
		System.out.println("¡Bienvenido a Caja Mural! Porfavor, introduce tu nombre");
		nombreCuenta =  nombre.next();
		
		
		CuentaBancaria cuenta1 = new CuentaBancaria(nombreCuenta);
		

		System.out.println("¿Cuánto dinero quieres ingresar? Solo puedes ingresar euros enteros");
		cantidadEuros = dinero.nextInt();
		cuenta1.ingresarDinero(cantidadEuros);
		cuenta1.mostrarSaldo();
		
		
		if (cuenta1.getSaldo() > 0) {
		    
		    while (cuenta1.getSaldo() > 0 && respuesta.equalsIgnoreCase("si")) { //Compara una string con otra obviando mayusculas
		        System.out.println("¿Qué deseas hacer? (1 = Retirar, 2 = Ingresar)");
		        int opcion = dinero.nextInt();

		        if (opcion == 1) {
		            System.out.println("¿Cuánto dinero quieres retirar? Solo puedes retirar euros enteros");
		            cantidadEuros = dinero.nextInt();
		            cuenta1.retirarDinero(cantidadEuros);
		        }
		        
		        
		        else if (opcion == 2) {
		            System.out.println("¿Cuánto dinero quieres ingresar? Solo puedes ingresar euros enteros");
		            cantidadEuros = dinero.nextInt();
		            cuenta1.ingresarDinero(cantidadEuros);
		        } 
		        
		        
		        else {
		            System.out.println("Opción no válida.");
		        }

		        cuenta1.mostrarSaldo();

		        // Si el saldo llega a 0, obliga a ingresar
		        if (cuenta1.getSaldo() <= 0) {
		            System.out.println("Tu saldo está a 0€, solo puedes ingresar dinero.");
		            
		            System.out.println("¿Cuánto dinero quieres ingresar? Solo puedes ingresar euros enteros");
		            cantidadEuros = dinero.nextInt();
		            cuenta1.ingresarDinero(cantidadEuros);
		           
		        }

		        System.out.println("¿Quieres realizar otra operación? (si/no)");
		        respuesta = dinero.next();  // aquí el usuario decide
		    }

		    System.out.println("Gracias por confiar en Caja Mural, vuelva pronto. Saldo final: " + cuenta1.getSaldo() + "€");
		    
		} 
		
		else {
		    System.out.println("Tu saldo está a 0€, ingresa dinero para empezar.");
		    
		    System.out.println("¿Cuánto dinero quieres ingresar? Solo puedes ingresar euros enteros");
            cantidadEuros = dinero.nextInt();
            cuenta1.ingresarDinero(cantidadEuros);
		}
	}

}
