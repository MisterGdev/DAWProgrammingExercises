package zoologico.animales;

public class Delfin extends Mamifero {

	public Delfin() {
		this.numeroAletas = 3;
		this.numeroPatas = 0;
	}
	
	public void respirar() {
		System.out.println("Un delfín respira con sus pulmones por el espiraculo.");
	}
}
