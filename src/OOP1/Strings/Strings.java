package OOP1.Strings;


public class Strings {
    public static void main(String[] args) {

        String test = "Java is fun!";
        System.out.println("String: " + test);
        String a = "Learning Java ";
        String b = "is nice!";
        String equal1 = "How are you?";
        String equal2 = "How are you?";
        String equal3 = "I'm good and you?";


        StringLength(test);
        JoinTwoStrings(a, b);
        StringsAreEqual(equal1, equal2);
        StringsAreEqual(equal1, equal3);
    }
    public static void StringLength(String s) {
        int length = s.length();
        System.out.println("This String is " + length + " chars long.");
    }

    public static void JoinTwoStrings(String a, String b) {
        String joinedString = a.concat(b);
        System.out.println("First String: " + a);
        System.out.println("Second String: " + b);
        System.out.println("Joined String: " + joinedString);
    }

    public static void StringsAreEqual(String a, String b) {
        boolean result = a.equals(b);

        if (result == true)
            System.out.println("These Strings are equal!");
        else
            System.out.println("These Strings are NOT equal!");
    }
}