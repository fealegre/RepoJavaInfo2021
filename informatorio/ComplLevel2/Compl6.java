package informatorio.ComplLevel2;

import java.util.Set;

import java.util.Map.Entry;
import informatorio.LibUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Compl6 {

    public static class Empleado {

        private int dni;
        private String nomYape;
        private int horasTrab;
        private int valorHora;

        public String getNomYape() {
            return this.nomYape;
        }

        public int getValorHora() {
            return valorHora;
        }

        public void setValorHora(int valorHora) {
            this.valorHora = valorHora;
        }

        public int getHorasTrab() {
            return horasTrab;
        }

        public void setHorasTrab(int horasTrab) {
            this.horasTrab = horasTrab;
        }

        public int getDni() {
            return dni;
        }

        public void setDni(int dni) {
            this.dni = dni;
        }

        public void setNomYape(String nomYape) {
            this.nomYape = nomYape;
        }

    }

    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();
        cargarSet(empleados);
        Map<Integer, Integer> sueldosCalculados = new HashMap<Integer, Integer>();
        LibUtil.limpiarPantalla();

        System.out.println("\nCONTENIDO DEL SET\n");
        for (Empleado empleado : empleados) {
            System.out.printf("%s : %d : %d : %d\n", empleado.getNomYape(), empleado.getDni(), empleado.getHorasTrab(),
                    empleado.getValorHora());
            sueldosCalculados.put(empleado.getDni(), empleado.getHorasTrab() * empleado.valorHora);
        }

        System.out.println("\nCONTENIDO DEL MAP\n");
        for (Entry<Integer, Integer> sueldo : sueldosCalculados.entrySet()) {
            System.out.printf("\nDNI: %d - SUELDO: %d", sueldo.getKey(), sueldo.getValue());
        }

    }

    public static void cargarSet(Set<Empleado> empl) {
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado();
        Empleado emp3 = new Empleado();
        Empleado emp4 = new Empleado();
        emp1.setNomYape("Matt Damon");
        emp1.setDni(6875654);
        emp1.setHorasTrab(48);
        emp1.setValorHora(2000);
        emp2.setNomYape("Kate Beckinsale");
        emp2.setDni(24879652);
        emp2.setHorasTrab(40);
        emp2.setValorHora(1000);
        emp3.setNomYape("Robert Downey Jr");
        emp3.setDni(21545878);
        emp3.setHorasTrab(40);
        emp3.setValorHora(1500);
        emp4.setNomYape("Scarlett Johansson");
        emp4.setDni(25465322);
        emp4.setHorasTrab(24);
        emp4.setValorHora(1800);
        empl.add(emp1);
        empl.add(emp2);
        empl.add(emp3);
        empl.add(emp4);

    }

}
