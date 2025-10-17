package lavanderia;

public class Aplicacion {

	public Aplicacion() {
		Ropa unaPrenda=new Ropa("L","Blanco");
		Operario unOperario=new Operario();
		unOperario.lavar(unaPrenda);
		unOperario.secar(unaPrenda);
		unOperario.tenhir(unaPrenda,"Rojo");
	}
	
	
	public static void main(String[] args) {
		Aplicacion unaApp=new Aplicacion();
	}
}
