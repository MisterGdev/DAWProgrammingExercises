package vehiculos;

public class Coche {
	
	private int velocidad;
	private Motor unMotor;
	
	
	
	public Coche() {
		velocidad = 0;
		unMotor = new Motor();
		System.out.println("¡Enhorabuena! Se ha creado tu coche a " + velocidad + " Km/h"); //Informa de que lo ha creado
	}

	public void acelerar(int kmh) {
		velocidad = velocidad +kmh;
		unMotor.subirRevoluciones(kmh * 5);
	}
	
	public void frenar(int kmh) {
		velocidad = velocidad - kmh;
		unMotor.bajarRevoluciones(kmh * 5);
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	public int getRevoluciones() {
		return unMotor.getRevoluciones();
	}
	
	
}  
