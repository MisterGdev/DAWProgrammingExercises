package lavanderia;

public class Ropa {
	
	private boolean estaLimpia, estaSeca;
	private final String talla;
	private String color;

	public Ropa(String talla, String color) {
		this.talla=talla;
		this.color=color;
		estaLimpia=false;
		estaSeca=true;
		System.out.println("Se crea una prenda de ropa sucia y seca");
	}
	
	public boolean getEstaLimpia() {
		return estaLimpia;
	}
	
	public boolean getEstaSeca() {
		return estaSeca;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getTalla() {
		return talla;
	}
	
	public void setEstaSeca(boolean estaSeca) {
		System.out.println("Una prenda pasa de estar seca a mojada o viceversa");
		this.estaSeca=estaSeca;
	}
	
	public void setEstaLimpia(boolean estaLimpia) {
		System.out.println("Una prenda cambia su estado de limpieza.");
		this.estaLimpia=estaLimpia;
	}
	
	public void setColor(String nuevoColor) {
		System.out.println("Una prenda cambia de color");
		color=nuevoColor;
	}
	
}
