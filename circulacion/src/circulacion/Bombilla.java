package circulacion;

//Bombilla.java
public class Bombilla {
 private String color;
 private boolean encendida;

 // Constructor
 public Bombilla(String color) {
     this.color = color;
     this.encendida = false; // Por defecto, apagada
 }

 // Encender la bombilla
 public void encender() {
     encendida = true;
     System.out.println("La bombilla " + color + " se ha encendido.");
 }

 // Apagar la bombilla
 public void apagar() {
     encendida = false;
     System.out.println("La bombilla " + color + " se ha apagado.");
 }

 // Consultar si está encendida
 public boolean estaEncendida() {
     return encendida;
 }

 // Obtener el color
 public String getColor() {
     return color;
 }

 // Cambiar color (opcional)
 public void setColor(String nuevoColor) {
     color = nuevoColor;
 }

 @Override
 public String toString() {
     return "Bombilla{" + color + ", " + (encendida ? "encendida" : "apagada") + "}";
 }
}
