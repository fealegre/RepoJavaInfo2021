package informatorio.ComplLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compl4 {

    public static void imprimirclase(int clase, List<String> c) {
        
        System.out.println("\nCLASE "+clase);
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));            
        }
    }   
    public static void main(String[] args) {
        
        List<String> estudiantes=new ArrayList<String>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese nombre de 12 estudiantes");
        
        for (int i = 0; i < 12; i++) {

            estudiantes.add(scan.nextLine());            
        
        }
        scan.close();

        
        imprimirclase(1,estudiantes.subList(0, 4));        
        imprimirclase(2,estudiantes.subList(4, 8));        
        imprimirclase(3,estudiantes.subList(8, 12));
    }
    
}
