// Realizar un Programa que dado un String de entrada en minúsculas lo
// convierta por completo a mayúsculas. Sin uso de métodos o librerías que
// realicen toUppercase().

package informatorio.ComplLevel1;

import java.util.Scanner;

public class Compl7 {

    public static String mayusculado(String palabra) {
        
        String may="";
        for (int k = 0; k < palabra.length(); k++) { //FOR QUE RECORRE LA PALABRA LETRA POR LETRA  

            int asciimin= palabra.charAt(k);         // GUARDA EL VALOR ASCII DEL CARACTER EN CURSO
            int asciimay= asciimin-32;               // CALCULA EL VALOR ASCII DE LA MAYUSCULA
            char caracter=(char)asciimay;            // GUARDA EL CARACTER DEL VALOR ASCII MAYUSCULA
            may+=caracter;                   // CONCATENA EL CARACTER EN CURSO CONVERTIDO A MAYUSCULA
            
        }
        return may;
    }
    public static void main(String[] args) {

        String palabra;       
        Scanner scan=new Scanner(System.in);
        System.out.print("\nIngrese una palabra:>>");
        palabra=scan.next();
        System.out.println(mayusculado(palabra));
        scan.close();
        
    }
    
}
