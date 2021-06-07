package informatorio.ComplLevel1;

import java.util.Scanner;

public class Compl9 {

    public static int cantVeces(char[] frase, char letra) {
        int cant=0;
        for (char l: frase) {
            if  (letra==l){
                cant++;
            }            
        }
        return cant;
    }
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("\nIngrese una palabra o frase: ");
        char[] frase=scan.nextLine().toLowerCase().toCharArray();        
        System.out.print("\nIngrese una letra para contar: ");
        char letra=scan.next().toLowerCase().charAt(0);        
        System.out.printf("\nLa letra '%s' aparece %d veces en la frase",letra,cantVeces(frase, letra));
        scan.close();
        
    }
    
}
