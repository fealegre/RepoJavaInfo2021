package informatorio.ComplLevel1;

import java.util.*;




public class Compl8 {
    
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese Nombre y Apellido: ");
        String nomyAp=scan.nextLine();
        System.out.print("Ingrese Edad: ");
        String edad=scan.nextLine();
        System.out.print("Ingrese Dirección: ");
        String direccion=scan.nextLine();
        System.out.print("Ingrese Ciudad: ");
        String ciudad=scan.nextLine();
        System.out.println();
        String frase= String.join(" - ", ciudad,direccion,edad,nomyAp);
        System.out.println(frase);
        scan.close();
                
    }
    
}
