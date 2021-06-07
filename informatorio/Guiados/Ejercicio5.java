package informatorio.Guiados;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        int factor;
        String op;

        do {           
        
            System.out.print("Ingrese un numero:>>");
            factor=scan.nextInt();
            
            for (int i = 1; i < 11; i++) {
                
                System.out.printf("%d * %d = %d\n", factor, i, factor*i);
            }

            System.out.print("Repetir proceso? (S/N):>>");
            op=scan.next();

        } while ("s".equalsIgnoreCase(op));

        scan.close();

    }
    
}
