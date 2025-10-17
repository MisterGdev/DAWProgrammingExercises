package zoologico.animales;

public abstract class Mamifero extends Animal {
	
	protected Mamifero() {
		this.tieneBranquias = false;
		this.tienePulmones = true;
		System.out.println("Se ha creado un mamifero.");
	}
	
	public void respirar()  {
		System.out.println("Un mamífero respira por los pulmones");
	}

}
