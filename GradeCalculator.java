import java.util.Scanner;
public class GradeCalculator {

    public static void main(String[] args) {
        int score = getStudentScore(); //calls the getStudentScore method as an integer
        String grade = calculateGrade(score); //calls the calculateGrade method as a string
        System.out.println("Your Grade is: " + grade); //displays the student's grade in the letter grade form
    }

    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        int score;

        do {
            System.out.print("Enter your score: "); //ask the user to input their score
            score = scanner.nextInt(); //scans the user input
            if (score < 0 || score > 100) { //if statement to validate if the user input is between 0 and 100
                System.out.println("Invalid score. Please enter a value between 0 and 100.");
            }
        } while (score < 0 || score > 100); //the loop continues to run as long as the input is between 0 to 100
        return score; //this will return the value of score when the method is called
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A"; //this will display if the score is greater than or equal to 90
        } else if (score >= 80) {
            return "B"; //this will display if the score is greater than or equal to 80
        } else if (score >= 70) {
            return "C"; //this will display if the score is greater than or equal to 70
        } else if (score >= 60) {
            return "D"; //this will display if the score is greater than or equal to 60
        } else {
            return "F"; //this will display if the score is not stated in the choices above
        }
    }
}
