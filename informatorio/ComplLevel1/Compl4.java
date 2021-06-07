//Realizar un programa que calcule el factorial de un número:
//n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
//Sin hacer uso de librerías.

package informatorio.ComplLevel1;

import java.util.Scanner;

public class Compl4 {

    public static void main(String[] args) {
        
        int num;
        int fact=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingrese un numero:>>");
        num=scan.nextInt();

        for (int i = 2; i <= num; i++) {

            fact=fact*i;           
        }

        System.out.printf("\nFactorial de %d = %d",num,fact);
        scan.close();
    }
    
}
