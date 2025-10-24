package zoologico.instalaciones;

public final class Jaula extends Instalacion {

	protected int metrosJaula;
	
	public Jaula(int parcela, int metros) {
		super(parcela);
		
		this.metrosJaula = metros;
	}
	
	public String toString() {
		String descripcion;
		descripcion = "[Parque]\n";
		descripcion += "Parcela asignada: " + this.parcelaZoo;
		descripcion += "Metros cuadrados: " + this.metrosJaula;
		descripcion += "Capacidad: 5 animales.";
		return descripcion;
	}
}
