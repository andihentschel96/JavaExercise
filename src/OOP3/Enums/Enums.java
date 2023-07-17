package OOP3.Enums;

public class Enums {
    public static void main(String[] args) {
        System.out.println(Size.MEDIUM);
        System.out.println(Size.EXTRA_LARGE);

        Test t1 = new Test(Size.LARGE);

        t1.orderPizza();
    }
}
class Test {
    Size pizzaSize;
    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza() {
        switch(pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium pizza.");
                break;
            case LARGE:
                System.out.println("I ordered a large pizza.");
                break;
            default:
                System.out.println("I can't decide...");
        }
    }
}
enum Size {
    SMALL, MEDIUM, LARGE, EXTRA_LARGE
}