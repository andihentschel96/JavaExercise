package OOP1.Methods;

public class MethodParameter {
    public static void NoParam() {
        System.out.println("This method has no parameters.");
    }
    public static void TwoParameters(int a, int b) {
        System.out.println("This method has two parameters: " + a + " & " + b);
    }
    public static void main(String[] args) {
        int a = 12, b = 24;
        NoParam();
        TwoParameters(a, b);
    }
}