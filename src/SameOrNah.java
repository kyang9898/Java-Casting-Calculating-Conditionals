import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String wordOne = String.valueOf(scanner.nextLine()); 

        System.out.println("Enter another word:");
        String wordTwo = String.valueOf(scanner.nextLine());
        
        if(wordOne.equals(wordTwo)) { //checks if word one and word two are the same
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are different");
        }
    }
}
