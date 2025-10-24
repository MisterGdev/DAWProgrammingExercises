package zoologico.instalaciones;

public abstract class Instalacion {

	protected final int parcelaZoo;
	protected boolean estaLimpio;
	
	public Instalacion(int parcela) {
		this.parcelaZoo = parcela;
	}
	
	public void construir() {
		System.out.println("Se ha construido la instalación en la parcela " + this.parcelaZoo);
	}
	
	public void setEstaLimpio(boolean estaLimpio) {
		this.estaLimpio = estaLimpio;
	}
}
