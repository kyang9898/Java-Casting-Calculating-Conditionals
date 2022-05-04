import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number:");
        int numTwo = Integer.valueOf(scanner.nextLine());

        if (numOne == numTwo) { //Checks if both numbers are the same
            System.out.println("Numbers are the same");
        } else if (numOne > numTwo) { //Checks if the first number is larger than the second. 
            System.out.println("The first number was larger than the second.");
        } else { //If the conditions above were not met, then the second number is larger than the first number.
            System.out.println("The second number was larger than the first.");
        }
    }
}
