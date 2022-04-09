package ilia;

//creating the factory class
public class CalculateFactory {
    public static Calculate getChar(char input) {
        System.out.println("Please choose an operation(+ or -): ");
        switch (input) {
            case ('+'):
                System.out.println();
                return new calcPlus();
            case ('-'):
                return new calcMinus();
            default:
                System.out.println("error!, wrong character");
                return null;
        }
    }
}