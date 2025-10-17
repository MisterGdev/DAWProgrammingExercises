package examenProgramacion;

public class Informatico {
	private Equipo unEquipo;
	
	public Informatico() {
		this.unEquipo = new Equipo();
		unEquipo.getUnMonitor();
		unEquipo.getUnTeclado();
	}
	
	public void cambiarTeclado(boolean esInalambrico) {
		Teclado TecladoCable = new Teclado(esInalambrico);
		unEquipo.setUnTeclado(TecladoCable);
		System.out.println("Has cambiado el teclado."); //Cambiar el teclado.
	}
	
	public void cambiarMonitor( int pulgadas) {
		Monitor MonitorG = new Monitor(pulgadas); //Cambiar el monitor.
		unEquipo.setUnMonitor(MonitorG);
		System.out.println("Has cambiado el monitor.");
	}
	
	public void arreglarEquipo() {
		unEquipo.arreglarTodo();
		System.out.println("Has arreglado el equipo, ahora el teclado y la pantalla funcionan correctamente.");
	}
	
	
	//Getters & Setters
	public Equipo getUnEquipo() {
		return unEquipo;
	}
}
