package informatorio.ComplLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compl5 {

    public static void main(String[] args) {
        
        List <Integer> horas_trabajadas=new ArrayList<Integer>();
        List <Integer> valor_por_hora=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese horas trabajadas dia "+(i+1)+" ");
            horas_trabajadas.add(scan.nextInt());
            System.out.print("Ingrese valor hora dia "+(i+1)+":");
            valor_por_hora.add(scan.nextInt());            
        }
        scan.close();
        System.out.println("\nArray horas trabajadas");
        System.out.print("[ ");
        for (int j = 0; j < 5; j++) {
            System.out.print(horas_trabajadas.get(j)+" ");                       
        }
        System.out.println("]");
        System.out.println("\nArray valor hora");
        System.out.print("[ ");
        for (int k = 0; k < 5; k++) {
            System.out.print(valor_por_hora.get(k)+" ");                       
        }
        System.out.println("]");
        System.out.println("\nArray totales diarios");
        System.out.print("[ ");
        int total_dia=0;
        int sueldo_total=0;
        for (int z = 0; z < 5; z++) {
            total_dia=horas_trabajadas.get(z)*valor_por_hora.get(z);
            System.out.print(total_dia+" ");                       
            sueldo_total+=total_dia;
        }
        System.out.println("]");
        System.out.println("\nTotal Final");
        System.out.print(sueldo_total);
        
    }
    
}
