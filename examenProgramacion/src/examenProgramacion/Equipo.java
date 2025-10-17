package examenProgramacion;

public class Equipo {
	
	private Teclado unTeclado;
	private Monitor unMonitor;
	
	public Equipo() {
		this.unTeclado = new Teclado(true);
		this.unMonitor = new Monitor(32);
		System.out.println("Se ha creado un Equipo");
	}
	
	public void arreglarTodo() {
		unTeclado.arreglarTeclado(false);
		unMonitor.arreglarMonitor(false);
	}
	
	
	//Getters & Setters
	public Teclado getUnTeclado() {
		return unTeclado;
	}

	public void setUnTeclado(Teclado unTeclado) {
		this.unTeclado = unTeclado;
	}

	public Monitor getUnMonitor() {
		return unMonitor;
	}

	public void setUnMonitor(Monitor unMonitor) {
		this.unMonitor = unMonitor;
	}
}
