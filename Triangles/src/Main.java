import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer;
        char fill;
        int size = 0;
        boolean yn = true;
        while (yn) {
            Scanner in = new Scanner(System.in);
            int n = 0;
            System.out.print("Enter the size of the triangle: ");
            while (n == 0) {
                size = in.nextInt();
                if (size <= 0 || size > 50) {
                    System.out.print("Size must be a number between 1-50: ");
                } else {
                    n = 1;
                }
            }
            System.out.print("Enter a character to use as the fill: ");
            fill = in.next().charAt(0);
            int j = 1;
            while (size > 0) {
                int i = size - 1;
                int k = j;
                while (i > 0) {
                    System.out.print(" ");
                    i--;
                }
                while (k > 0) {
                    if (k > 1) {
                        System.out.print(fill + " ");
                    } else {
                        System.out.println(fill);
                    }
                    k--;
                }
                j++;
                size--;
            }
            System.out.print("Would you like another triangle (Y/N)? ");
            boolean question = true;
            while (question) {
                answer = in.next().toLowerCase();
                if (answer.equals("n")) {
                    yn = false;
                    question = false;
                } else if (answer.equals("y")) {
                    question = false;
                } else {
                    System.out.print("Answer must be Y or N: ");
                }
            }
        }
    }
}