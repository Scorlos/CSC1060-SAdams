import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Addition Calculator:");
        System.out.println("Please enter two numbers:");
        System.out.print("Number 1: ");
        int num1 = in.nextInt();
        System.out.print("Number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}