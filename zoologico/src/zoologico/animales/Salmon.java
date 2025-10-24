package zoologico.animales;

public final class Salmon extends Pez {
	
	protected String nombre;
	public boolean tieneHambre;
	
	public Salmon(String nombre) {	
		
		this.nombre = nombre;
		this.tieneHambre = true;
		System.out.println("Se ha creado un Salmon.");
	}
	
	public String toString() {
		String descripcion;
		descripcion = "[Salmon]\n";
		descripcion += "- Nombre: " + nombre + "\n";
		descripcion += "- Número de patas: " + numeroPatas + "\n";
		descripcion += "- Número de aletas: " + numeroAletas + "\n";
		descripcion += "- ¿Tiene pulmones?: " + this.tienePulmones + "\n";
		descripcion += "- ¿Tiene branquias?: " + this.tieneBranquias + "\n";
		descripcion += "- ¿Tiene hambre?: " + tieneHambre + "\n";
	
		return descripcion;
	}
}