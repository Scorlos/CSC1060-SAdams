import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double grade;
        System.out.print("Enter your numeric grade: ");
        grade = in.nextDouble();
        if (grade < 0.0) {
            System.out.println("Grade must be a positive number or zero.");
        }
        else if (grade >= 0.0 && grade < 60.0) {
            System.out.println("Grade: F");
        }
        else if (grade >= 60.0 && grade < 67.0) {
            System.out.println("Grade: D");
        }
        else if (grade >= 67.0 && grade < 69.0) {
            System.out.println("Grade: D+");
        }
        else if (grade >= 69.0 && grade < 72.0) {
            System.out.println("Grade: C-");
        }
        else if (grade >= 72.0 && grade < 77.0) {
            System.out.println("Grade: C");
        }
        else if (grade >= 77.0 && grade < 79.0) {
            System.out.println("Grade: C+");
        }
        else if (grade >= 79.0 && grade < 82.0) {
            System.out.println("Grade: B-");
        }
        else if (grade >= 82.0 && grade < 87.0) {
            System.out.println("Grade: B");
        }
        else if (grade >= 87.0 && grade < 89.0) {
            System.out.println("Grade: B+");
        }
        else if (grade >= 89.0 && grade < 92.0) {
            System.out.println("Grade: A-");
        }
        else {
            System.out.println("Grade: A");
        }
    }
}