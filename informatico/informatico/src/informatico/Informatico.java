package informatico;

public class Informatico {
	
	public void arreglar(Equipo unEquipo) {
		unEquipo.reparar();
	}
	
	public void sustituirTeclado(Equipo unEquipo, Teclado unTeclado) {
		unEquipo.sustituir(unTeclado);
	}
	
	public void sustituirMonitor(Equipo unEquipo, Monitor unMonitor) {
		unEquipo.sustituir(unMonitor);
	}

}
