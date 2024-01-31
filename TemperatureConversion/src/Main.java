import java.util.Scanner; //Importing Scanner

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Making a new Scanner for input
        //Defining variables for three different types for temperature
        double tempF;
        double tempC;
        double tempK;
        System.out.print("Enter a Temperature in Fahrenheit: ");
        tempF = in.nextInt(); //Prompting user input for temperature
        tempC = (tempF - 32.0) * (5.0 / 9.0); //Conversion from Fahrenheit to Celsius
        tempK = tempC + 273.15; //Conversion from Celsius to Kelvin
        System.out.println("Celsius: " + tempC);
        System.out.println("Kelvin: " + tempK);
    }
}