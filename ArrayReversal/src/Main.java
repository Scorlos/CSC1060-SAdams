import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] intArray;
        intArray = new int[100];
        boolean arrLoop = true;
        int count = 0;
        System.out.print("Please enter a number for the array (Enter -1 to stop): ");
        while (arrLoop) {
            intArray[count] = in.nextInt();
            if (intArray[count] == -1) {
                arrLoop = false;
            } else {
                count++;
            }
        }
        count--;
        System.out.println("Your values, reversed: ");
        while (count >= 0) {
            System.out.println(intArray[count]);
            count--;
        }
    }
}