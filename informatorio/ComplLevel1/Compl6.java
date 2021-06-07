//Se desea una aplicación que solicite 2 números enteros y realice la operación
//de potencia (sin uso de librerías).

package informatorio.ComplLevel1;

import java.util.Scanner;

public class Compl6 {

    public static long potencia(int base, int exponente) {
        
        long potencia=1;
        for (int i = 1; i <= exponente; i++) {

            potencia*=base;           
        }
        return potencia;

    }
    public static void main(String[] args) {
        
        int base;
        int exponente;        
        Scanner scan=new Scanner(System.in);
        System.out.print("\nIngrese base: ");
        base=scan.nextInt();
        System.out.print("\nIngrese exponente: ");
        exponente=scan.nextInt();
        System.out.printf("\nPotencia de %d elevado a %d = %d",base,exponente,potencia(base,exponente));
        scan.close();
    }
    
}
