package informatorio.ComplLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Compl3 {
    public static void main(String[] args) {

        List<Integer> baraja= new ArrayList<Integer>();
        

        for (int i = 0; i < 13; i++) {

            baraja.add(i+1);
            
        }

        System.out.println("\nBaraja");

        for (int i = 0; i < baraja.size(); i++) {

            System.out.print(baraja.get(i)+" ");
        
        }
        
        Collections.reverse(baraja);
        System.out.println("\n\nBaraja orden inverso");

        for (int i = 0; i<baraja.size() ; i++) {

            System.out.print(baraja.get(i)+" ");
        
        }
        
        Collections.shuffle(baraja);
        System.out.println("\n\nBaraja desordenada");
        
        for (int i = 0; i < baraja.size(); i++) {
        
            System.out.print(baraja.get(i)+" ");
        
        }
     
        
    }
    
}
