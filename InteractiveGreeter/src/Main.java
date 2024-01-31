import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Defining variables needed to hold answers
        String name;
        String origin;
        int age;
        String favAct;
        double donation;
        //Prompting User input for name, place of origin, and age in years.
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("Where are you from? ");
        origin = in.nextLine();
        System.out.print("How old are you in years? ");
        age = in.nextInt();
        //User Feedback based on inputs.
        System.out.println("Hello " + name + " from " + origin + ". You are " + age + " years old.");
        //Asking user for input on favorite activity and outputting a response based on input.
        System.out.print("What do you like to do? ");
        in.nextLine(); //Using Scanner to clear inputs, common logic error.
        favAct = in.nextLine();
        System.out.println("Have fun the next time you " + favAct + "!");
        //Prompting user for an input in dollars for a donation amount and returning a response.
        System.out.print("How much would you like to donate in dollars today? $");
        donation = in.nextDouble();
        System.out.println("You will donate $" + donation + " today! Thank you!");
    }
}