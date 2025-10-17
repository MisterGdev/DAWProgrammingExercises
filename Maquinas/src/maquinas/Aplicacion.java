package maquinas;

import java.util.Scanner; //Hace que pueda utilizar el Scanner.

public class Aplicacion {
	
	public Aplicacion() {
		Scanner teclado = new Scanner(System.in); //Define el Scanner
		int maximoRefrescos, maximoGominolas;
		
		System.out.println("Bienvenido a tu gestor de Vending, estamos listos para configurar tus dispositivos."); //Primera línea de texto
		
		System.out.println("¿Cuál es el máximo de refrescos en tu máquina?");
		maximoRefrescos = teclado.nextInt(); //Lee y asigna el valor que hemos introducido como usuario.
		
		System.out.println("¿Cuál es el máximo de gominolas en la máquina?");
		maximoGominolas = teclado.nextInt(); //Lee y asigna el valor que hemos introducido como usuario.
		
		
		MaquinaVending maquina1 = new MaquinaVending(maximoRefrescos,maximoGominolas); //Creo la máquina con los valores introducidos por el usuario.
		
		Scanner teclado2 = new Scanner(System.in); //Define el Scanner
		int refrescosComprados;
		System.out.println("¿Cuántos refrescos quieres comprar?");
		refrescosComprados = teclado2.nextInt();
		maquina1.comprarResfrescos(refrescosComprados);
		//maquina1.reponerRefrescos(maximoRefrescos);
		
		Scanner teclado3 = new Scanner(System.in); //Define el Scanner
		int gominolasCompradas;
		System.out.println("¿Cuántas gominolas quieres comprar?");
		gominolasCompradas = teclado3.nextInt();
		maquina1.comprarGominolas(gominolasCompradas);
		//maquina1.reponerGominolas(maximoGominolas);
		
		maquina1.estadoMaquina();
		/* Scanner teclado4 = new Scanner(System.in); //Define el Scanner
		String respuestaGominolas;
		System.out.println("¿Quieres reponer las gominolas? Responde con Si o No");
		respuestaGominolas = teclado4.next();
		if (respuestaGominolas = "Si") {
			maquina1.reponerGominolas(maximoGominolas);
			System.out.println("Has repuesto las gominolas en la máquina, vuelve a haber" + maximoGominolas);
		}
		else if (respuestaGominolas = "No") {
			System.out.println("No se han repuesto las gominolas de la maquina");
			
		}*/
		
	}

	public static void main(String[] args) {
		Aplicacion miAplicacion = new Aplicacion();

	}
}
