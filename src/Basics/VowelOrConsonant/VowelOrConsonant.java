package Basics.VowelOrConsonant;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char c = 'e';

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c + " is a vowel.");
                break;
            default:
                System.out.println(c + " is a consonant.");
        }
    }
}