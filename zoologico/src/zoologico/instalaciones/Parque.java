package zoologico.instalaciones;

public final class Parque extends Instalacion {

	protected int metrosParque;
	
	public Parque(int parcela, int metros) {
		super(parcela);
		
		this.metrosParque = metros;
	}
	
	public String toString() {
		String descripcion;
		descripcion = "[Parque]\n";
		descripcion += "Parcela asignada: " + this.parcelaZoo;
		descripcion += "Metros cuadrados: " + this.metrosParque;
		descripcion += "Capacidad: 5 animales.";
		return descripcion;
	}
}

