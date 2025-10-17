package banco;

public final class GeneradorCuenta {
	
	private static final String ID_BANCO = "0000";
	private static final String ID_SUCURSAL = "0000"; // Esto hace que los bloques de numeros fijos sean "0000 0000 XX" antes de la ID de la cuenta.
	
	private static int identificador = 1; //Este es el contador para los 2 ultimos digitos (la id).
	
	private static long contador = 1_000_000_000L; //Es el valor inicial de la secuencia del número de cuenta.

	public static String generarNumeroCuenta() {
		
		String formatoId = String.format("%02d", identificador);
		
		String numeroCuenta = ID_BANCO + " " + ID_SUCURSAL + " " + formatoId;
		
		identificador++; //Incrementa el numero si se crean varias cuentas.
		
		return numeroCuenta; //Devuelve el número de cuenta con formato "0000 0000 XX".
		
	}
}
