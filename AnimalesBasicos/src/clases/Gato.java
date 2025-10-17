package clases;

public class Gato {
	
	private String nombreGato;
	private int pesoGr;
	
	public Gato (String nombreGato, int pesoGr) { //Crea al gato asignando parámetros de Nombre y peso.
		this.nombreGato = nombreGato;
		this.pesoGr = pesoGr;
	}
	
	public void nacerGato() { //Invoca al gato e imprime su nombre.
		System.out.println(" Ha nacido un gato y se llama " + nombreGato);	
	}
	
	public void comer(int gramosDeComida) { //Indica que el gato come y cuanto cantidad en gramos.
		System.out.println(this.nombreGato + " ha comido " + gramosDeComida + " gramos de comida ");
	}
	
	public void mostrarPeso() { //Imprime el peso del gato en pantalla.
		System.out.println(this.nombreGato + " pesa " + this.pesoGr + " gramos ");
	}

	public String getNombreGato() {
		return nombreGato;
	}
	
	public void setNombreGato(String nuevoNombre) { //Le cambia el nombre al gato.
		nombreGato = nuevoNombre;
		System.out.println("Se ha renombrado al gato como " + nuevoNombre);
	}
	
	public int getPesoGr() { 
		return pesoGr;
	}
}
