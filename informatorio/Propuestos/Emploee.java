package informatorio.Propuestos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class Emploee implements Comparable<Emploee>{

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int age;
    private double salary;

    public Emploee(){

    }

    public Emploee(String firstName, String lastName, String birthDate, String salary) throws ParseException{
        this.firstName = firstName;
        this.lastName = lastName;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = LocalDate.parse(birthDate, formatter);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        cal.setTime(sdf.parse(birthDate));// all done
        this.age= calculateAge(cal);
        this.salary = Double.parseDouble(salary);
        
    }

    @Override
    public String toString() {
        
        return "\nNOMBRE Y APELLIDO: " + String.valueOf(this.firstName) + " " + String.valueOf(this.lastName) + 
        "| FECHA DE NACIMIENTO: " + String.valueOf(this.birthDate) + "| EDAD: " + String.valueOf(this.age) + "| SUELDO: $" + String.valueOf(this.salary);
    }

    @Override
    public int compareTo(Emploee e) {
        if (age < e.age) {
            return -1;
        }
        if (age > e.age) {
            return 1;
        }
        return 0;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    } 

    public int getAge() {
        return this.age;
    }

    public int calculateAge(Calendar birthDate) {

        Calendar currentDate = Calendar.getInstance();
        int years = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        int months = currentDate.get(Calendar.MONTH) - birthDate.get(Calendar.MONTH);
        int days = currentDate.get(Calendar.DAY_OF_MONTH) - birthDate.get(Calendar.DAY_OF_MONTH);
        
        if (months < 0 
                || (months == 0 && days < 0)) { 
            years--;
        }
        return years;

    }

    
}

