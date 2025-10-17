package vehiculos;

public class Motor {
	
	private int rpm;
	
	public Motor() {
		rpm = 0;
		System.out.println("Se crea un motor a " + rpm + " rpm");
	}
	
	public void subirRevoluciones(int revoluciones) {
		rpm = rpm + revoluciones; //rpm += revoluciones
		System.out.println("Las revoluciones han subido a " + rpm);
	}

	public void bajarRevoluciones(int revoluciones) {
		rpm = rpm - revoluciones;
	}
	
	public int getRevoluciones() {
		return rpm;
	}
}
