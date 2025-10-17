package clases;

public class Aplicacion {
	
	public Aplicacion() {
		
		Gato gato1 = new Gato(" Pelusa ", 2500); //Crea un nuevo gato
		gato1.nacerGato(); //Invoca al método nacerGato
		gato1.mostrarPeso(); //Invoca al método mostrarPeso
		gato1.comer(200); //Invoca al método comer
		gato1.setNombreGato("Josefa"); //Le cambio el nombre al gato
		System.out.println("----------");
		
		Pajaro pajaro1 = new Pajaro("Colibri");
		pajaro1.nacerPajaro();
		pajaro1.volar(3);
		pajaro1.volar(5);
		System.out.println("----------");
		
		
		
		Gato gato2 = new Gato("Bigotes", 3000);
		gato2.nacerGato();
		gato2.mostrarPeso();
		gato2.comer(150);
		System.out.println("----------");
	}
		
	

	public static void main(String[] args) {
		Aplicacion miAplicacion = new Aplicacion();
	}

}
