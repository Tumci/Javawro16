package pl.com.sda.rafal.zientara.apps.lesson1.poli;

public class Employee extends Person {

    public Employee(String name, String surname) {
        super(name, surname);
    }

    public void work() {
        System.out.println("Work, work!");
    }
}
