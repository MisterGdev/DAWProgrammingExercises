package zoologico.instalaciones;

public final class Acuario extends Instalacion {

	protected int metrosAcuario;
	
	public Acuario(int parcela, int metros) {
		super(parcela);
		this.metrosAcuario = metros;
	}
	
	public String toString() {
		String descripcion;
		descripcion = "[Acuario]\n";
		descripcion += "Parcela asignada: " + this.parcelaZoo;
		descripcion += "Metros cúbicos: " + this.metrosAcuario;
		descripcion += "Capacidad: 5 animales.";
		return descripcion;
	}
}

