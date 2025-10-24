package zoologico.animales;

public final class Delfin extends Pez {
	
	protected String nombre;
	public boolean tieneHambre;
	
	public Delfin(String nombre) {	
		
		this.nombre = nombre;
		this.tieneHambre = true;
		System.out.println("Se ha creado un Delfin.");
	}
	
	public String toString() {
		String descripcion;
		descripcion = "[Delfin]\n";
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
		System.out.println("Un Delfin respira por sus pulmones con su espiraculo.");
	}
	*/
}
