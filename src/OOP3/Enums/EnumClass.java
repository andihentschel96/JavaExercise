package OOP3.Enums;

public class EnumClass {
    public static void main(String[] args) {
        System.out.println("The size of the pizza is: " + Sizes.SMALL.getSize());
    }
}

enum Sizes {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize() {
        switch(this) {
            case SMALL:
                return "small";
            case MEDIUM:
                return "medium";
            case LARGE:
                return "large";
            case EXTRALARGE:
                return "extra large";
            default:
                return null;
        }
    }
}