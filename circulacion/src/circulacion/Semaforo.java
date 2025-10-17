package circulacion;

//Semaforo.java
public class Semaforo {
 private Bombilla roja;
 private Bombilla verde;

 // Constructor
 public Semaforo() {
     roja = new Bombilla("roja");
     verde = new Bombilla("verde");
 }

 // Dar paso (enciende verde, apaga roja)
 public void darPaso() {
     roja.apagar();
     verde.encender();
     System.out.println("Semáforo: DAR PASO (verde encendida).");
 }

 // Prohibir paso (enciende roja, apaga verde)
 public void prohibirPaso() {
     verde.apagar();
     roja.encender();
     System.out.println("Semáforo: PROHIBIR PASO (roja encendida).");
 }

 // Apagar ambas luces
 public void apagar() {
     roja.apagar();
     verde.apagar();
     System.out.println("Semáforo: APAGADO (ninguna luz encendida).");
 }

 // Mostrar estado actual
 public void mostrarEstado() {
     System.out.println("Estado actual del semáforo:");
     System.out.println(" - Bombilla roja: " + (roja.estaEncendida() ? "encendida" : "apagada"));
     System.out.println(" - Bombilla verde: " + (verde.estaEncendida() ? "encendida" : "apagada"));
 }
}

