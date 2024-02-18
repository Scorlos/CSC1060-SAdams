import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int selection;
        System.out.println("(1) Water, (2) Coke, (3) Coffee");
        System.out.print("Enter a number to select a beverage: ");
        selection = in.nextInt();
        if (selection == 1) {
            System.out.println("You chose Water!");
        } else if (selection == 2) {
            System.out.println("You chose Coke!");
        } else if (selection == 3) {
            System.out.println("You chose Coffee!");
        }
    }
}
