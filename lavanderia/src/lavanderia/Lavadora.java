package lavanderia;

public class Lavadora {

	public void lavar(Ropa unaPrenda) {
		System.out.println("La lavadora lava una prenda");
		unaPrenda.setEstaLimpia(true);
		unaPrenda.setEstaSeca(false);
	}
	
}
