package clases;

public class Pajaro {
	
	private final String especiePajaro; //Al poner "final" indico que no se puede modificar nisiquiera en la propia clase
	private int kmRecorridos;
	
	public Pajaro (String especiePajaro) {
		this.especiePajaro = especiePajaro;
	}
	
	public void nacerPajaro() {
		System.out.println(" Ha nacido un " + this.especiePajaro);
	}
	
	public void volar(int numeroKm) {
		System.out.println(" El " + especiePajaro + " vuela " + numeroKm + " kilometros. ");
		kmRecorridos += numeroKm;// Esto es igual que decir kmRecorridos = kmRecorridos + numeroKm; (A partir de ahora mejor asi)
		System.out.println(this.especiePajaro + " ha recorrido " + kmRecorridos + " kilometros. ");
	}
	
	public String getEspeciePajaro() {
		return especiePajaro;
	}
	
	public int getkmRecorridos() {
		return kmRecorridos;
	}
	
	
}
