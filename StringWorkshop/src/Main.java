import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text for the string: ");
        String text = in.nextLine();
        boolean loop = true;
        while(loop){
            boolean choiceLoop = true;
            System.out.println("Current string: " + text);
            System.out.println("What would you like to do?");
            System.out.println("1. Add Content\n2. Check for Substrings\n3. Output Length\n4. Output substring after prefix");
            System.out.println("5. Output substring before prefix\n6. Output substring between prefix and suffix\n7. Exit");
            while(choiceLoop){
                int choice = in.nextInt();
                in.nextLine();
                if(choice==1){
                    text = addContent(text);
                    choiceLoop = false;
                } else if(choice==7){
                    loop = false;
                    choiceLoop = false;
                }else{
                    System.out.println("Please choose one of the options above.");
                }
            }
        }
    }

    public static String addContent(String text){
        Scanner in = new Scanner(System.in);
        System.out.print("What would you like to add? ");
        text = text + in.nextLine();
        return text;
    }

    public static void subCheck (String text){
        Scanner in = new Scanner(System.in);
        System.out.print("What substring would you like to check for? ");
        String check = in.nextLine();

    }
}