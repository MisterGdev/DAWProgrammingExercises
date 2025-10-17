package informatico;

public class Aplicacion {

	public Aplicacion() {
		Informatico unInformatico=new Informatico();
		Equipo unEquipo=new Equipo(20,true); //20 pulgadas y teclado inalámbrico
		Monitor monitorNuevo=new Monitor(25);
		unInformatico.arreglar(unEquipo);
		unInformatico.sustituirMonitor(unEquipo, monitorNuevo);
	}
	
	public static void main(String[] args) {
		Aplicacion unaAplicacion=new Aplicacion();
	}

}
