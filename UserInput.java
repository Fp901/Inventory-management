
import java.io.*;
import java.util.Random;
//import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserInput {

    public LocalDateTime now = LocalDateTime.now();
    public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss");

    public Random random = new Random();
    public int random1 = random.nextInt(90000) + 10000;

    public String idString = String.valueOf(random1);

    public String timestamp = now.format(formatter);

    public String description;

    public String cost;
    public double value = Double.parseDouble(cost);

    // public double price1 = Double.parseDouble(cost);

    public String amount;
    public double value2 = Double.parseDouble(amount);

    // public int quantity1 = Integer.parseInt(amount);
    // public int price1 = Integer.parseInt(cost);

    double TotalValue = value * value2;
    String total = Double.toString(TotalValue);

    public void TextFileAdd() {

        String[] AddItem = { idString, timestamp, description, cost, amount, total };

        String Inventory = "items.txt";

        try {
            String heading = "INVENTORY MANAGEMENT SYSTEM";

            FileWriter filewriter = new FileWriter(Inventory, true);
            BufferedWriter writer = new BufferedWriter(filewriter);

            writer.write("");

            writer.write(heading);
            writer.newLine();

            writer.write("----------------------------------");
            writer.newLine();

            writer.write(
                    "Product ID: \t Date | Time \t Discription \t Price \t Quantity \t Total value (GBP)");
            writer.newLine();

            writer.close();

            System.out.println("\n");

            FileWriter filewriter1 = new FileWriter(Inventory, true);
            BufferedWriter writer1 = new BufferedWriter(filewriter1);

            writer1.write(AddItem[0] + "\t\t" + AddItem[1] + "\t\t" + AddItem[2] + "\t\t"
                    + AddItem[3]
                    + "\t\t" + AddItem[4] + "\t\t" + AddItem[5]);
            writer1.newLine();

            writer1.close();
            System.out.println("\nNew Item Added");

        }

        catch (IOException e) {

            System.out.println("An error occured while creating the file: " +
                    e.getMessage());

        }
    }

}
