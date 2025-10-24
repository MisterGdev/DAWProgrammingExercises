package zoologico.empleados;

public final class Limpiador extends Empleado {
	
	protected Limpiador() {
		
		this.nombreEmpleado = "Mario";
	}
	
	public void limpiar() {
		System.out.println("El limpiador ha limpiado la instalación.");
	}
}
