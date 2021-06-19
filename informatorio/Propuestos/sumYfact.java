package informatorio.Propuestos;

import java.util.Scanner;
import informatorio.LibUtil;

public class sumYfact {

    public static int suma(int num1, int num2) {
        return num1 + num2;

    }

    public static double fact(int num) {
        if (num < 2) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        LibUtil.limpiarPantalla();
        System.out.print("Ingrese 1er sumando: ");
        int n1=scan.nextInt();
        System.out.print("Ingrese 2do sumando: ");
        int n2=scan.nextInt();
        System.out.println("La suma es: " + suma(n1, n2));
        System.out.print("Ingrese numero para calcular factorial: ");
        int n3=scan.nextInt();
        System.out.print("El factorial de "+n3+" es: "+fact(n3));
        scan.close();
    }

}
