import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number:");
        int numTwo = Integer.valueOf(scanner.nextLine());

        // adds two numbers
        int addition = numOne + numTwo;
        System.out.println(numOne + " + " + numTwo + " = " + addition);

        int subtraction = numOne - numTwo;
        System.out.println(numOne + " - " + numTwo + " = " + subtraction);

        int multiplication = numOne * numTwo;
        System.out.println(numOne + " * " + numTwo + " = " + multiplication);

        double division = (float) numOne / numTwo;
        System.out.println(numOne + " / " + numTwo + " = " + division);

        int remainder = numOne % numTwo;
        System.out.println(numOne + " % " + numTwo + " = " + remainder);

    }
}
