package zoologico.instalaciones;

public final class Parque extends Instalacion {

	protected int metrosParque;
	protected String nombreParque;
	
	public Parque( String nombre, int parcela, int metros) {
		super(parcela);
		this.nombreParque = nombre;
		this.metrosParque = metros;
	}
	
	public String toString() {
		String descripcion;
		descripcion = "[Parque] " + this.nombreParque + "\n";
		descripcion += "Parcela asignada: " + this.parcelaZoo + "\n";
		descripcion += "Metros cuadrados: " + this.metrosParque + "\n";
		descripcion += "Capacidad: 5 animales.";
		return descripcion;
	}

	public String getNombreParque() {
		return nombreParque;
	}
}

