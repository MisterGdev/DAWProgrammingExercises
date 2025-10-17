package informatico;

public class Equipo {
	
	private Teclado unTeclado;
	private Monitor unMonitor;
	
	public Equipo(int pulgadasMonitor, boolean tecladoInalambrico) {
		unMonitor=new Monitor(pulgadasMonitor);
		unTeclado=new Teclado(tecladoInalambrico);
	}
	
	public void sustituir(Monitor unMonitor) {
		this.unMonitor=unMonitor;
	}
	
	public void sustituir(Teclado unTeclado) {
		this.unTeclado=unTeclado;
	}
	
	public void reparar() {
		unMonitor.setEstaEstropeado(false);
		unTeclado.setEstaEstropeado(false);
	}

}
