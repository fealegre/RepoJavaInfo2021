package informatorio.Guiados;

import java.util.*;

public class Ejercicio7_2 {

	public static List<Integer> pedirNumeros() {
		List<Integer> numeros = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Cuantos numeros va a ingresar?");
		int cantidad = scan.nextInt();
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Ingrese número:");
			numeros.add(scan.nextInt());
		}
		scan.close();
		return numeros;
	}

	public static String ordinal(int numero) {
		String texto = "";
		switch (numero) {
			case 1:
				texto = "primer";
				break;
			case 2:
				texto = "segundo";
				break;
			case 3:
				texto = "tercer";
				break;
			case 4:
				texto = "cuarto";
				break;
			case 5:
				texto = "quinto";
				break;
			case 6:
				texto = "sexto";
				break;
			case 7:
				texto = "septimo";
				break;
			case 8:
				texto = "octavo";
				break;
			case 9:
				texto = "noveno";
				break;
			case 10:
				texto = "decimo";
				break;
			default:
				texto = "enesimo";
				break;
		}
		return texto;

	}

	public static void imprimirSalida(List<Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("El " + ordinal(i + 1) + " número es: " + lista.get(i));
		}

	}

	public static void main(String[] args) {

		imprimirSalida(pedirNumeros());

	}
}
