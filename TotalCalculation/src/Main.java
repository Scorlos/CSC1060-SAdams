import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader readData = new BufferedReader(new FileReader("items.txt"));
        List<String> data = new ArrayList<>();
        String entry = readData.readLine();
        data.add(entry);
        while ((entry = readData.readLine()) != null) {
            data.add(entry);
        }
        List<Double> dataFormatted = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            dataFormatted.add(Double.parseDouble(data.get(i)));
        }
        double subTotal = 0;
        for (int i = 0; i < dataFormatted.size(); i++) {
            subTotal = subTotal + dataFormatted.get(i);
        }
        double tax = (subTotal * (5.3 / 100));
        double total = tax + subTotal;

        final DecimalFormat dfZero = new DecimalFormat("0.00");
        BufferedWriter createTotals = new BufferedWriter(new FileWriter("totals.txt"));
        createTotals.write("The sub-total is $" + subTotal + "\nThe tax is $" + dfZero.format(tax) + "\nThe total is $" + dfZero.format(total));
        createTotals.close();
    }
}

