import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        boolean tf = makes10();
        if (tf) {
            System.out.print("The sum of these numbers is ten.");
        } else {
            System.out.print("The sum of these numbers is not ten.");
        }
    }

    public static boolean makes10() {
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        if (sum == 10) {
            return true;
        } else {
            return false;
        }
    }
}
