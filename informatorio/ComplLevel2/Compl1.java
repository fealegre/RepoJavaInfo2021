package informatorio.ComplLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compl1 {

    public static void main(String[] args) {
        
        String ciudad;
        List<String> ciudades= new ArrayList<String>();
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingrese una ciudad o FIN: ");
        ciudad=scan.nextLine();

        while (!ciudad.equalsIgnoreCase("fin")) {
            ciudades.add(ciudad);
            System.out.print("Ingrese una ciudad o FIN: ");
            ciudad=scan.nextLine();            
        }

        System.out.println("\nLISTA DE CIUDADES\n");

        for (int elemento=0;elemento<ciudades.size();elemento++) {
            System.out.println("#"+(elemento+1)+" "+ciudades.get(elemento));
        }

        scan.close();

        
        
    }
    
}
