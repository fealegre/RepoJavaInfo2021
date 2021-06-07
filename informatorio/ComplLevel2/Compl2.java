package informatorio.ComplLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compl2 {

    public static void main(String[] args) {
        
        List<Integer> enteros= new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Ingrese un entero: ");            
            enteros.add(scan.nextInt());
            
        }

        System.out.println("\nLista original de enteros");

        for (int i = 0; i < enteros.size(); i++) {

            System.out.print(enteros.get(i)+" ");
        
        }
        
        System.out.print("\n\nAgregando un entero al principio:");
        enteros.add(0, scan.nextInt());
        System.out.print("Agregando un entero al final:");
        enteros.add(enteros.size(), scan.nextInt());
        System.out.println("\nLista final de enteros\n");

        for (int i = 0; i < enteros.size(); i++) {
        
            System.out.print(enteros.get(i)+" ");
        
        }
        scan.close();

        
    }
    
}
