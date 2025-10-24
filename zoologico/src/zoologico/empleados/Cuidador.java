package zoologico.empleados;

import zoologico.animales.*;

public final class Cuidador extends Empleado {
	
	/*private Caniche unCaniche;
	private Chowchow unChowchow;
	private Delfin unDelfin;
	private Salmon unSalmon;
	*/
	public Cuidador(String nombre) {
		super();
	}
	
	public void alimentarPerro(Perro unPerro) {
		System.out.println("Alimento a un perro.");
		unPerro.setTieneHambre(false);
	}
	
	public void alimentarAnimal(Animal unAnimal) {
		System.out.println("Alimento a un animal.");
	}
	 
	/*public void AlimentarCaniche() { //PREGUNTAR EL JUEVES PARA EXPLICAR EN ALTO AlimentarAnimal(){}.
		unCaniche.tieneHambre = false;
		System.out.println("El cuidador ha alimentado al caniche");
	}
	
	public void AlimentarChowchow() {
		unCaniche.tieneHambre = false;
		System.out.println("El cuidador ha alimentado al chowchow");
	}*/
}
