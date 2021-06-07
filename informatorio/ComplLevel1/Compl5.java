//Se desea una aplicación que solicite 2 números enteros y realice la operación
//de multiplicación por sumas sucesivas (sin uso de librerías).

package informatorio.ComplLevel1;

import java.util.Scanner;
import informatorio.LibUtil;

public class Compl5 {

    public static int producto(int factor1, int factor2) {

        int producto = 0;
        for (int i = 1; i <= factor1; i++) {

            producto += factor2;
        }
        return producto;
    }

    public static void main(String[] args) {
        
        int factor1;
        int factor2;
        LibUtil.limpiarPantalla();
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIngrese primer factor: ");        
        factor1 = scan.nextInt();
        System.out.print("\nIngrese segundo factor: ");
        factor2 = scan.nextInt();
        System.out.printf("\nProducto de %d * %d = %d", factor1, factor2, producto(factor1, factor2));
        scan.close();
    }

}
