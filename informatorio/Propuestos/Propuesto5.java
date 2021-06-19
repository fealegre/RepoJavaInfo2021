package informatorio.Propuestos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import informatorio.LibUtil;

public class Propuesto5 {

    public static Emploee processLine(String content) throws ParseException {

        List<String> line = new ArrayList<>(Arrays.asList(content.split(",")));
        Emploee emp = new Emploee(line.get(0), line.get(1), line.get(2), line.get(3));
        return emp;

    }

    public static List<Emploee> filterByLastName(List<Emploee> entrada, String letra) {

        List<Emploee> salida = new ArrayList<>();
        for (Emploee Emploee : entrada) {
            if (Emploee.getLastName().startsWith(letra)) {
                salida.add(Emploee);
            }

        }
        return salida;
    }

    public static class AgeOrdenator implements Comparator<Emploee> {

        public int compare(Emploee e1, Emploee e2) {

            return Integer.valueOf(e1.getAge()).compareTo(e2.getAge());
        }

    }

    public static class SalaryComparator implements Comparator<Emploee> {

        public int compare(Emploee e1, Emploee e2) {

            return Double.valueOf(e1.getSalary()).compareTo(e2.getSalary());
        }

    }

    public static class NameOrdenator implements Comparator<Emploee> {
        public int compare(Emploee e1, Emploee e2) {
            // Si el apellido de p1 y el apellido de p2 no son comparativamente equivalentes,
            // Compara p1 con p2 comparando sus apellidos.
            // De lo contrario, compare p1 con p2 comparando sus nombres
            if (e1.getLastName().compareTo(e2.getLastName()) != 0) {
                return e1.getLastName().compareTo(e2.getLastName());
            } else {
                return e1.getFirstName().compareTo(e2.getFirstName());
            }
        }
    }

    public static void youngerEmploee(List<Emploee> emploees) {

        Collections.sort(emploees, new AgeOrdenator());
        System.out.println("\nEL EMPLEADO DE MENOR EDAD ES\n" + emploees.get(0));
    }

    public static void olderEmploee(List<Emploee> emploees) {
        
        Collections.sort(emploees, new AgeOrdenator());
        System.out.println("\nEL EMPLEADO DE MAYOR EDAD ES\n" + emploees.get(emploees.size() - 1));
    }

    public static void lowerSalary(List<Emploee> emploees) {

        Collections.sort(emploees, new SalaryComparator());
        System.out.println("\nEL EMPLEADO CON MENOR SUELDO ES\n" + emploees.get(0));
    }

    public static void higherSalary(List<Emploee> emploees) {

        Collections.sort(emploees, new SalaryComparator());
        System.out.println("\nEL EMPLEADO CON MAYOR SUELDO ES\n" + emploees.get(emploees.size() - 1));
    }

    private static void sortEmploees(List<Emploee> emploees) {

        Collections.sort(emploees, new NameOrdenator());
        System.out.println("\nORDENADOS POR APELLIDO Y NOMBRE\n" + emploees);        
    }

    
    public static void main(String[] args) throws IOException, ParseException {

        List<Emploee> emploees = new ArrayList<>();
        String path = "D:/ESCRITORIO/INFORMATORIO 2020/JAVA/Libro1.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String content = br.readLine();
            while (content != null) {
                emploees.add(processLine(content));
                content = br.readLine();
            }

        } catch (IOException ex) {
            // TODO
        }
        LibUtil.limpiarPantalla();
        System.out.println("\n" + emploees);
        System.out.println("\nFILTRADOS POR APELLIDO");
        System.out.println(filterByLastName(emploees, "a"));        
        youngerEmploee(emploees);
        olderEmploee(emploees);        
        lowerSalary(emploees);
        higherSalary(emploees);
        sortEmploees(emploees);

    }

    
}
