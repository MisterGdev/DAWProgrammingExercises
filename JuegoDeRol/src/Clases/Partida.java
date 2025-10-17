package Clases;

public class Partida {
	
	public static void main(String[] args) {
		Partida partida = new Partida();
		partida.jugar();
	}
	
	public Partida() {
		
		
	}
	
	public void jugar() {
		System.out.println("Empieza Partida"); //Muestra el comienzo
		
		Jugador jugador1 = new Jugador("Harry");
		jugador1.mostrarEstado(); //Crea el jugador y muestra stats
		
		Jugador jugador2 = new Jugador("Hermione");
		jugador2.mostrarEstado(); //Crea el jugador y muestra stats
		
		System.out.println("------------"); //Marca Principio de Turno
		System.out.println("Turno 1"); //Comienza el turno
		jugador1.atacar(jugador2, 10); //Jugador1 ataca a Jugador 2
		jugador2.atacar(jugador1, 10); //Jugador2 ataca a Jugador1
		
		jugador1.mostrarEstado();
		jugador2.mostrarEstado(); //Muestra las stats de los jugadores
		System.out.println("------------"); //Marca Final de Turno
		
		System.out.println("Turno 2"); //Marca Final de Turno
		jugador1.atacar(jugador2, 10); //Jugador1 ataca a Jugador2
		jugador2.defender(10); //Jugador2 se defiende
		
		jugador1.mostrarEstado(); 
		jugador2.mostrarEstado(); //Muestra las stats de los jugadores
		System.out.println("------------"); //Marca Final de Turno
		
	}
}
