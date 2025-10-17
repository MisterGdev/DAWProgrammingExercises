package examenProgramacion;

public class Teclado {
	
	private final boolean esInalambrico;
	private boolean estaEstropeado;
	
	public Teclado(boolean esInalambrico) { 
		this.esInalambrico = esInalambrico;
		estaEstropeado = false;
		System.out.println("Se ha creado un Teclado."); //Crea un Teclado
	}
	
	public void arreglarTeclado(boolean estaEstropeado) {
		this.estaEstropeado = estaEstropeado;
		//Cambia el estado del teclado a arreglado.
		//System.out.println("Se ha arreglado el teclado del equipo."); 
	}
	
	
	//Getters & Setters
	public boolean getEstaEstropeado() {
		return estaEstropeado;
	}

	public void setEstaEstropeado(boolean estaEstropeado) {
		this.estaEstropeado = estaEstropeado;
	}

	public boolean getEsInalambrico() {
		return esInalambrico;
	}
}
