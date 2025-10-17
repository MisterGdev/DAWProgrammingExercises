package lavanderia;

public class Operario {
	
	private Lavadora unaLavadora;
	private Secadora unaSecadora;
	
	public Operario() {
		System.out.println("Se crea un operario.");
		unaLavadora=new Lavadora();
		unaSecadora=new Secadora();
	}
	
	public void lavar(Ropa unaPrenda) {
		System.out.println("El operario lava una prenda");
		unaLavadora.lavar(unaPrenda);
	}
	
	public void secar(Ropa unaPrenda) {
		System.out.println("El operario seca una prenda");
		unaSecadora.secar(unaPrenda);
	}
	
	public void tenhir(Ropa unaPrenda, String color) {
		System.out.println("El operario tiñe una prenda");
		unaPrenda.setColor(color);
	}

}
