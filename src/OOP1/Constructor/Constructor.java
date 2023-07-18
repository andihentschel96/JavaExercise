package OOP1.Constructor;

public class Constructor {
    String name;
    String surname;
    int age;
    Constructor(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void main(String[] args) {
        Constructor object = new Constructor("Andi", "Hentschel", 26);

        System.out.println(object.name);
        System.out.println(object.surname);
        System.out.println(object.age);
    }
}