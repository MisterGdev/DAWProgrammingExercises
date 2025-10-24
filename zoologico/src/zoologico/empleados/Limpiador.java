package zoologico.empleados;

import zoologico.animales.*;
import zoologico.instalaciones.*;

public final class Limpiador extends Empleado {
	
	public Limpiador(String nombre) {
		
		super(nombre);
	}
	
	public void limpiarInstalacion(Instalacion unaInstalacion) {
		unaInstalacion.setEstaLimpio(true);
		System.out.println(nombreEmpleado + " ha limpiado " + nombreInstalacion);
	}
	
	public void limpiarAnimal(Animal unAnimal) {
		unAnimal.setestaSucio(false);
	}
}
