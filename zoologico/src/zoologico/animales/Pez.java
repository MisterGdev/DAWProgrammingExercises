package zoologico.animales;

public abstract class Pez extends Animal {
	
	protected Pez() {
		this.tieneBranquias = true;
		this.tienePulmones = false;
		this.numeroPatas = 0;
		System.out.println("Se ha creado un pez.");
	}
	
	public void respirar()  {
		System.out.println("Un pez respira por sus branquias.");
	}

}
