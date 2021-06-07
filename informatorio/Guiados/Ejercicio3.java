package informatorio.Guiados;
import java.util.*;



public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String seguir = "s";

        do {

            System.out.print("Ingrese la nota del alumno: >>");
            int nota=scan.nextInt();
            
            if (nota>92) {
                System.out.println("EXCELENTE");            
            } else if (nota>84){
                System.out.println("SOBRESALIENTE");
            } else if (nota>74){
                System.out.println("DISTINGUIDO");
            } else if (nota>59) {
                System.out.println("BUENO");                        
            } else {
                System.out.println("DESAPROBADO");            

            }

            System.out.println("Desea continuar ingresando notas (S/N): >>");
            seguir=scan.next();
            
        } while ("s".equalsIgnoreCase(seguir));
        
        scan.close();

        
        
    }
    
}
