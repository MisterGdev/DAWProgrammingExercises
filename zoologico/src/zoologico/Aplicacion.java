package zoologico;

import zoologico.animales.*;

public class Aplicacion {

	public Aplicacion() {
		
		Animal animalGenerico;
		
		animalGenerico = new Delfin();
		animalGenerico.respirar();
		System.out.println();
		
		animalGenerico = new Perro();
		animalGenerico.respirar();
		System.out.println();
		
		Caniche unCaniche = new Caniche();
		unCaniche.respirar();
		System.out.println();
		
		Chowchow unChowchow = new Chowchow();
		unChowchow.respirar();
	}
	
	public static void main(String[] args) {
		Aplicacion miAplicacion = new Aplicacion();
	}
}
