import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100");
        int score = Integer.valueOf(scanner.nextLine());

        if (score < 60 && score > 0) { //checks if score is in the range of 0-59, if so the grade is an F.
            System.out.println("Your grade is an F :'(");
        } else if (score >= 60 && score <= 69) { //checks if the score is in the range of 60-69, if so the grade is a D.
            System.out.println("Your grade is a D :(");
        } else if (score >= 70 && score <= 79) { //checks if the score is in the range of 70-79, if so the grade is a C.
            System.out.println("Your grade is a C :|");
        } else if (score >= 80 && score <= 89) { //checks if the score is in the range of 80-89, if so the grade is a B.
            System.out.println("Your grade is a B :/");
        } else { //If the score doesn't meet any of the conditions then the grade is an A.
            System.out.println("Your grade is an A :)");
        }

    }
}
