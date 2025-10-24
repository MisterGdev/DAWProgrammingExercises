package zoologico.animales;

public final class Caniche extends Perro {
	
	protected String nombre;
	
	public Caniche(String nombre) {	
		
		this.nombre = nombre;
		this.tieneHambre = true;
		System.out.println("Se ha creado un Caniche.");
	}
	
	public String toString() {
		String descripcion;
		descripcion = "[Caniche]\n";
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
		System.out.println("Un Caniche respira por los pulmones con su boca.");
	}
	*/
}
