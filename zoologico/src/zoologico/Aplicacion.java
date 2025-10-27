package zoologico;

import zoologico.animales.*;
import zoologico.empleados.*;
import zoologico.instalaciones.*;
import java.util.Scanner;

public class Aplicacion {

	public Aplicacion() {
		//SCANNERS
		Scanner nombre = new Scanner(System.in);
		String nombreAnimal;
		String nombreEmpleado;
		String nombreInstalacion;
		
		Scanner parcela = new Scanner(System.in);
		int parcelaAsignada;
		
		Scanner metros = new Scanner(System.in);
		int metrosInstalacion;
		
		//TEXTO BIENVENIDA
		System.out.println("¡Bienvenido a la gestión de tu zoológico!" + "\n");
		System.out.println("En este zoológico podrás: " + "\n ");
		System.out.println("1. Crear animales.");
		System.out.println("2. Crear sus hábitats.");
		System.out.println("3. Gestionar tus empleados.");
		System.out.println("4. Alimentar a los animales.");
		System.out.println("5. Limpiar sus hábitats. " + "\n");
		
		//CREAR UN CANICHE
		System.out.println("Vamos a darle nombre a tu primer animal, un caniche. ¿Cómo quieres que se llame?");
		nombreAnimal = nombre.next();
		Caniche unCaniche = new Caniche(nombreAnimal);
		System.out.println(unCaniche.toString()); //Imprime la descripción de Caniche.
		
		System.out.println(); //Linea en blanco.
		
		//CREAR UN CHOWCHOW
		System.out.println("Ahora vamos a darle nombre a tu segundo animal, un chowchow. ¿Cómo quieres que se llame?");
		nombreAnimal = nombre.next();
		Chowchow unChowchow = new Chowchow(nombreAnimal);
		System.out.println(unChowchow.toString()); //Imprime la descripción de Chowchow.
		
		System.out.println(); //Linea en blanco.
		
		//CREAR UN DELFÍN
		System.out.println("Ahora vamos a darle nombre a tu tercer animal, un delfín. ¿Cómo quieres que se llame?");
		nombreAnimal = nombre.next();
		Delfin unDelfin = new Delfin(nombreAnimal);
		System.out.println(unDelfin.toString()); //Imprime la descripción de Delfin.
		
		System.out.println(); //Linea en blanco.
		
		//CREAR UN SALMÓN
		System.out.println("Ahora vamos a darle nombre a tu cuarto animal, un salmón. ¿Cómo quieres que se llame?");
		nombreAnimal = nombre.next();
		Salmon unSalmon = new Salmon(nombreAnimal);
		System.out.println(unSalmon.toString()); //Imprime la descripción de Salmon.
		
		System.out.println(); //Linea en blanco.
		
		//CREAR INSTALACIONES (PARQUE)
		System.out.println("¡Enhorabuena! Ya tienes a tus animales creados, ahora necesitas unos recintos para que vivan.");
		System.out.println("Empecemos creando un PARQUE para perros, ¿cómo quieres llamar al recinto?");
		nombreInstalacion = nombre.next();
		System.out.println("Introduce la parcela en la que quieres crearlo: |1|2|3|4|");
		parcelaAsignada = parcela.nextInt();
		System.out.println("¿Cuantos metros cuadrados ocupa el parque?");
		metrosInstalacion = metros.nextInt();
		Parque unParque = new Parque(nombreInstalacion,parcelaAsignada, metrosInstalacion);
		System.out.println(unParque.toString()); //Imprime la descripción de Parque.
		
		System.out.println(); //Linea en blanco.
		
		//CREAR CUIDADOR
		System.out.println("Pasemos a crear a tus empleados: Cuidadores y Limpiadores. ");
		System.out.println("¿Cuál será el nombre de tu primer cuidador?");
		nombreEmpleado = nombre.next(); 
		Cuidador unCuidador = new Cuidador(nombreEmpleado);
		System.out.println("Se ha creado al cuidador " + nombreEmpleado);
		System.out.println("Ahora vamos a alimentar a un animal:"); 
		unCuidador.alimentarAnimal(unSalmon);
		
		System.out.println(); //Linea en blanco.
		
		//CREAR LIMPIADOR
		System.out.println("¿Y el de tu primer limpiador?");
		nombreEmpleado = nombre.next(); 
		Limpiador unLimpiador = new Limpiador(nombreEmpleado);
		System.out.println("Se ha creado al limpiador " + nombreEmpleado);
		System.out.println("Vamos a limpiar un Parque:");
		unLimpiador.limpiarInstalacion(unParque);
	}
	
	public static void main(String[] args) {
		Aplicacion miAplicacion = new Aplicacion();
	}
}
