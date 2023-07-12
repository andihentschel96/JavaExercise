package OOP1.AccessModifiers;

class Person {
    //Fields
    private String name;
    private String surname;
    private int age;

    //getter and setter
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        //Creating a person object with the default constructor
        Person p1 = new Person();

        //Output the default values for each name, surname and age by getter
        System.out.println("Name: " + p1.getName() + " Surname: " + p1.getSurname() + " Age: " + p1.getAge());

        //setting all fields by setter
        p1.setName("Hans");
        p1.setSurname("Gruber");
        p1.setAge(42);

        //Output the new values to see if it worked
        System.out.println("Name: " + p1.getName() + " Surname: " + p1.getSurname() + " Age: " + p1.getAge());
    }
}