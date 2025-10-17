package claseTriangulo;

public class Triangulo {
	public static void main(String[] args) {
		int num;
		System.out.print("Introduce un número entero (de 1 a 9): ");
		num = MyInput.readInt();
		if ((num < 1) || (num > 9)) {
			System.out.println("El número no está entre 1 y 9. Terminando ...");
			System.exit(0);
		}
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
