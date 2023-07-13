package OOP2.Inheritance;


public class Inheritance {
    public static void main(String[] args) {
        Person p1 = new Person("Andi", "Hentschel", 26);
        Worker w1 = new Worker();
        w1.name = "Steven";
        w1.surname = "Schwenzer";
        w1.age = 27;
        w1.pn = 100;
        p1.display();
        w1.display();
    }
}
class Person {
    String name, surname;
    int age;
    Person() {}
    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Age: " + this.age);
    }
}

class Worker extends Person {
    int pn;

    @Override
    public void display() {
        super.display();
        System.out.println("Personell Number: " + this.pn + " Name: " + this.name + " Surname: " + this.surname + " Age: " + this.age);
    }
}