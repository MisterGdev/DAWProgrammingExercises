package zoologico.animales;

public abstract class Animal {
	
	public static final int MAX_NUMERO_PATAS = 4;
	protected int numeroAletas;
	protected int numeroPatas;
	protected boolean tieneBranquias;
	protected boolean tienePulmones;
	protected boolean tieneHambre;
	protected boolean estaSucio;
	
	protected Animal() {
		System.out.println("Se crea un animal");
	}
	
	public void setTieneHambre(boolean tieneHambre) {
		this.tieneHambre=tieneHambre;
	}
	
	public void setestaSucio(boolean estaSucio) {
		this.estaSucio=estaSucio;
	}
	
	public abstract void respirar();
}
