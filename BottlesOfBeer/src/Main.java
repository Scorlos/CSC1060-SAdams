import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int initBottles;
        int bottles;
        int n;
        System.out.print("Enter the number of bottles to start with: ");
        initBottles = in.nextInt();
        bottles = initBottles;
        n = bottles;
        while (n > 1) {
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
            bottles = bottles - 1;
            if (bottles == 1) {
                System.out.println("Take one down and pass it around, " + bottles + " bottle of beer on the wall.\n");
            } else {
                System.out.println("Take one down and pass it around, " + bottles + " bottles of beer on the wall.\n");
            }
            n = n - 1;
        }
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
        System.out.println("Take one down and pass it around, 0 bottles of beer on the wall.\n");
        System.out.println("0 bottles of beer on the wall, 0 bottles of beer.");
        System.out.println("Go to the store and buy some more, " + initBottles + " bottles of beer on the wall.");
    }
}