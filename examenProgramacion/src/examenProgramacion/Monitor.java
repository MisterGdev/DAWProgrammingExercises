package examenProgramacion;

public class Monitor {
	
	private final int numeroPulgadas;
	private boolean estaEstropeado;
	
	public Monitor(int numeroPulgadas) {
		this.numeroPulgadas = numeroPulgadas;
		estaEstropeado = false;
		System.out.println("Se ha creado un Monitor."); //Crea un monitor.
	}
	
	public void arreglarMonitor(boolean estaEstropeado) {
		this.estaEstropeado = estaEstropeado;
		//Cambia el estado del monitor a arreglado.
		//System.out.println("Se ha arreglado el monitor del equipo.");
	}
	
	
//Getters & Setters
	public boolean getEstaEstropeado() {
		return estaEstropeado;
	}

	public void setEstaEstropeado(boolean estaEstropeado) {
		this.estaEstropeado = estaEstropeado;
	}

	public int getNumeroPulgadas() {
		return numeroPulgadas;
	}
}
