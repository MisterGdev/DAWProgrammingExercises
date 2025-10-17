package examenProgramacion;

public class Aplicacion {
	
	public Aplicacion( ) {
		Informatico unInformatico = new Informatico();
		unInformatico.arreglarEquipo();
		unInformatico.cambiarMonitor(50);
	}
	
	
	public static void main(String[] args) {
		Aplicacion unaApp = new Aplicacion();
	}
}
