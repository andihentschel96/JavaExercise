package OOP2.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        //instantiate an object of class Person
        Person p1 = new Person();

        //using of the getter and setter
        p1.setAge(26);
        p1.getAge();
    }
}

class Person {
    //declare the fields private so other classes can't access them
    private int age;

    //using getter to read the variable (getter)
    public void getAge() {
        System.out.println("This persons age is: " + this.age);
    }

    // or write a value in it (setter)
    public void setAge(int age) {
        this.age = age;
    }
}