package banco;

public class CuentaBancaria {
	
	private String numeroCuenta;
	private String nombreTitular;
	private int saldo;
	
	public CuentaBancaria(String nombreTitular) {
		this.nombreTitular = nombreTitular;
		this.numeroCuenta = GeneradorCuenta.generarNumeroCuenta();
		this.saldo = 0;
		
		System.out.println(this.nombreTitular + " gracias por confiar en Caja Mural, tu cuenta " + this.numeroCuenta + " ha sido creada.");
		
	}

	
	public void ingresarDinero(int cantidadEuros) {
		this.saldo = cantidadEuros + this.saldo;
		System.out.println("Has ingresado " + cantidadEuros + " a tu cuenta con éxito.");
	}
	
	public void retirarDinero(int cantidadEuros) {
		this.saldo = this.saldo - cantidadEuros;
		System.out.println("Has retirado " + cantidadEuros + " de tu cuenta con éxito.");
	}
	
	public void mostrarSaldo() {
		System.out.println("Tu saldo actual es de " + this.saldo + " euros.");
	}
	
	public void setNombreTitular() {
	}
	
	public String getNombreTitular() {
		return nombreTitular;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public int getSaldo() {
		return saldo;
	}
} 
