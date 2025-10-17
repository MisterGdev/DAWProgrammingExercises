package informatico;

public class Monitor {
	
	private final int pulgadas;
	private boolean estaEstropeado;
	
	public Monitor(int pulgadas) {
		this.pulgadas=pulgadas;
		estaEstropeado=false;
	}
	
	public int getPulgadas() {
		return pulgadas;
	}
	
	public void setEstaEstropeado(boolean estaEstropeado) {
		this.estaEstropeado=estaEstropeado;
	}
	
	public boolean getEstaEstropeado() {
		return estaEstropeado;
	}

}
