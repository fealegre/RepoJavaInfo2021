package informatorio.Guiados;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int dia;
        String op;

        do {

            System.out.print("Ingrese un numero de dia de la semana: >>");
            dia=scan.nextInt();
            
            switch (dia) {
                case 1:
                    System.out.println("LUNES");               
                    break;
                case 2:
                    System.out.println("MARTES");               
                    break;
                case 3:
                    System.out.println("MIERCOLES");               
                    break;
                case 4:
                    System.out.println("JUEVES");               
                    break;
                case 5:
                    System.out.println("VIERNES");               
                    break;
                case 6:
                    System.out.println("SABADO");               
                    break;
                case 7:
                    System.out.println("DOMINGO");               
                    break;        
                default:
                    System.out.println("ERROR - VALOR FUERA DE RANGO");
                    break;
            }

            System.out.print("Repetir proceso? (S/N):>>");
            op=scan.next();
            
        } while ("s".equalsIgnoreCase(op));

        scan.close();
    }

        

}


