package zoologico.instalaciones;

public abstract class Instalacion {

	protected final int parcelaZoo;
	
	public Instalacion(int parcela) {
		this.parcelaZoo = parcela;
	}
	
	public void construir() {
		System.out.println("Se ha construido la instalación en la parcela " + this.parcelaZoo);
	}
}
