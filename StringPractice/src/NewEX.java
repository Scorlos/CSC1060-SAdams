import java.util.Scanner;
public class NewEX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String example = "idk some shit";
        System.out.print("Enter a guess: ");
        String possibleEnd = in.nextLine();
        boolean yn = endCheck(example, possibleEnd);
        if (yn){
            System.out.println("The string ends with the substring!");
        } else {
            System.out.println("The string does not end with the substring...");
        }
    }

    public static boolean endCheck(String example, String possibleEnd) {
        return example.endsWith(possibleEnd);


    }
}
