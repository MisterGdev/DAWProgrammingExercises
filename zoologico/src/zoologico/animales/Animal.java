package zoologico.animales;

public abstract class Animal {
	
	protected int numeroAletas;
	protected int numeroPatas;
	protected boolean tieneBranquias;
	protected boolean tienePulmones;
	
	protected Animal() {
		System.out.println("Se crea un animal");
	}
	
	public abstract void respirar();
}
