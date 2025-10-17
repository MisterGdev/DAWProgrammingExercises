package informatico;

public class Teclado {

	private final boolean esInalambrico;
	private boolean estaEstropeado;
	
	public Teclado(boolean esInalambrico) {
		this.esInalambrico=esInalambrico;
		this.estaEstropeado=false;
	}
	
	public boolean getEsInalambrico() {
		return esInalambrico;
	}
	
	public void setEstaEstropeado(boolean estaEstropeado) {
		this.estaEstropeado=estaEstropeado;
	}
	
	public boolean getEstaEstropeado() {
		return estaEstropeado;
	}
}
