package Clases;

public class Jugador{
	
	private String nombreJugador;
	private int puntosDeVida;
	private int puntosDeMagia;
	//Crea los atributos
	
	private static final int VIDA_MAX = 100;
	private static final int MAGIA_MAX = 100;
	//Crea constantes de la clase (para todos los jugadores) y no se cambia después de definirse
	
	public Jugador (String nombreJugador) {
		this.nombreJugador = nombreJugador;
		this.puntosDeMagia = MAGIA_MAX;
		this.puntosDeVida = VIDA_MAX; 
		//Asigna valores con atributos y utiliza this. para coger atributo y no clase
	}
	
	public void mostrarEstado() {
		System.out.println("Jugador: " + nombreJugador + " | Vida: " + puntosDeVida + " | Magia: " + puntosDeMagia);	
		//Define como mostrar las estadísticas
	}
	
	public void atacar(Jugador objetivo, int puntosDeAtaque) {
		objetivo.puntosDeVida = Math.max(0, objetivo.puntosDeVida - puntosDeAtaque);
		this.puntosDeMagia = Math.max(0, this.puntosDeMagia - (puntosDeAtaque / 2));
		System.out.println(objetivo.nombreJugador + " ha sido atacado por " + this.nombreJugador);
		//Define la acción atacar
	}
	
	public void defender(int puntosDeDefensa) {
		this.puntosDeVida = Math.min(VIDA_MAX, this.puntosDeVida + puntosDeDefensa);
		this.puntosDeMagia = Math.max(0, this.puntosDeMagia - (puntosDeDefensa /2));
		System.out.println(nombreJugador + " se ha defendido.");
	}
	
	public void reflejarAtaque(int puntosDeAtaque) {
		
	}
	
	public String getNombre() {
		return nombreJugador;
	} //Deja que otros objetos cojan el nombre del jugador
	
	public void setNombre(String nuevoNombre) {
		nombreJugador = nuevoNombre;
	} //Deja que otros objetos sobreescriban el nombre del jugador
	
	public int puntosDeMagia() {
		return puntosDeMagia;
	}
	
	public int puntosDeVida() {
		return puntosDeVida;
	}
}