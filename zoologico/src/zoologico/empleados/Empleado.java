package zoologico.empleados;

public abstract class Empleado {

	protected String nombreEmpleado;
	
	protected Empleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
		System.out.println("Se crea un Empleado.");
	}
}
