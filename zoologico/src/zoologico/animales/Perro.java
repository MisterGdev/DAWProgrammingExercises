package zoologico.animales;

public class Perro extends Mamifero {

	public Perro() {
		
		this.numeroAletas = 0;
		this.numeroPatas = 4;
		
		System.out.println("Se ha creado un perro.");
		
		System.out.println("¿Tiene pulmones el perro? " + tienePulmones);
		
		System.out.println("¿Tiene branquias el perro? " + tieneBranquias);
	}
	
	/*public void respirar() {
		System.out.println("Un perro respira con sus pulmones por la boca");
	}*/
}
