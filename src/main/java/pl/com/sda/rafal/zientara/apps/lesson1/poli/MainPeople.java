package pl.com.sda.rafal.zientara.apps.lesson1.poli;

public class MainPeople {

    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Person("Janusz", "Kolano");
        people[1] = new Employee("Krzysiu", "Je¿yna");
//        people[0] = new Apple();

        Person p = people[1];
//        Employee e = people[1];
        if(p instanceof Employee) {
            Employee e = (Employee) p;
            e.work();//teraz moeg bo wiem ze Employee
        }
    }
}
