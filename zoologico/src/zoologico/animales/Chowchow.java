package zoologico.animales;

public final class Chowchow extends Perro {
	
	protected String nombre;
	
	public Chowchow(String nombre) {	
		
		this.nombre = nombre;
		super.tieneHambre = true;
		System.out.println("Se ha creado un Chowchow.");
	}
	
	public String toString() {
		String descripcion;
		descripcion = "[Chowchow]\n";
		descripcion += "- Nombre: " + nombre + "\n";
		descripcion += "- Número de patas: " + numeroPatas + "\n";
		descripcion += "- Número de aletas: " + numeroAletas + "\n";
		descripcion += "- ¿Tiene pulmones?: " + this.tienePulmones + "\n";
		descripcion += "- ¿Tiene branquias?: " + this.tieneBranquias + "\n";
		descripcion += "- ¿Tiene hambre?: " + tieneHambre + "\n";
		
		return descripcion;
	}
	
	/*
	public void respirar() {
		System.out.println("Un chowchow respira por los pulmones con su boca.");
	}
	*/
}