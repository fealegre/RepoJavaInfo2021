package informatorio.ComplLevel2;

import java.util.*;
import informatorio.LibUtil;

public class Compl7 {

    public static List<String> FizzBuzz(int a, int b) {

        List<String> arreglo=new ArrayList<String>();
        String frase="";
        
        for (int i = a; i < b; i++) {
            if (i%2==0 && i%3==0) {
                frase="FizzBuzz";                
            }
            else if (i%2==0) {
                frase="Fizz";                
            }
            else if (i%3==0){
                frase="Buzz";
            }
            else {
                frase=i+"";
            }
            arreglo.add(frase);
            
        }
        return arreglo;
        
    }

    public static void main(String[] args) {
        
        List<String> arreglo=new ArrayList<String>();
        LibUtil.limpiarPantalla();
        arreglo=FizzBuzz(1, 6);        
        System.out.println(arreglo);
        arreglo=FizzBuzz(1, 8);
        System.out.println(arreglo);
            
        
    }
    
    
}
