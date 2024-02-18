import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        double sum = 0;
        double num;
        while (cont) {
            System.out.print("Enter a number to add to the sum or type 0 to view the sum: ");
            num = in.nextDouble();
            if (num == 0) {
                cont = false;
            }
            sum = sum + num;
        }
        System.out.print("The sum of these numbers is " + sum);
    }
}
