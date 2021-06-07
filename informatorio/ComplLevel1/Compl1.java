//Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
//mensaje “HOLA {USUARIO}!!!”

package informatorio.ComplLevel1;

import java.util.Scanner;

public class Compl1 {

    public static void main(String[] args) {
        
        String nombre;
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese su nombre:>>");
        nombre=scan.nextLine();
        System.out.println("\nHOLA " + nombre);
        scan.close();

    }
    
}
