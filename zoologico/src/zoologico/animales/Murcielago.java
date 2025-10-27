package zoologico.animales;

public class Murcielago extends Mamifero implements Volador {

	public Murcielago() {}

    //Heredado de la interfaz Volador
	public void volar() {
		System.out.println("Los muerciélagos vuelan a ciegas.");
		
	}
}
