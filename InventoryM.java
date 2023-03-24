/* UNIVERSITY OF SUFFOLK - INTRODUCTION TO PROGRAMMING 
 * Module assignment
 * 
 * Module Lead: Dr. Kakia Chatsiou
 * Last updated 2022-02-25
 * 
 * The assignment starter code consists of 3 files:
 * 
 * a) store.java: this file contains starting code for the inventory
 * management control system. See assignment brief document for 
 * more information on how to build the rest of the application.
 * 
 * b) items.txt: this file contains a list of all items in the inventory
 * with information about their quantities and total price in stock. See 
 * assignment text for more information.
 * 
 * c) transactions.txt: this file contains a list of all the transactions
 * for the day. You will be using it to print out the report of transactions
 * Each time a transaction happens i.e. an item is added or removed, 
 * a record should be stored in transactions.txt
 *  
 *
 * You are asked to work on expanding the starter code so that your Java app can do the following:
 * 
 *  - read and output to the 2 files (transactions.txt, items.txt) as appropriate
 *  - autogenerate a (5-digit) item id ie. 00001 for each new item
 *  - add a new item to the inventory (by appending a line to items.txt) 
 *  - update the quantity of an item already in store (in items.txt)
 *  - remove an item from the inventory (by removing relevant entry in items.txt)
 *  - search for an item in the inventory (items.txt)
 *  - generate and print a daily transaction report (using transactions.txt)
 * 
 * Check out the full assignment brief for more information about the report.
 */

//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.lang.*;

public class InventoryM {

	// The main menu is defined as a function to call throughout the use of the
	// applicaton.

	public static void OptionsMenu() {
		System.out.println("I N V E N T O R Y    M A N A G E M E N T    S Y S T E M");
		System.out.println("-----------------------------------------------");
		System.out.println("1. ADD NEW ITEM");
		System.out.println("2. UPDATE QUANTITY OF EXISTING ITEM");
		System.out.println("3. REMOVE ITEM");
		System.out.println("4. VIEW DAILY TRANSACTION REPORT");
		System.out.println("---------------------------------");
		System.out.println("5. Exit");
	}

	public static void main(String args[]) {

		// Below is the function for the main menu which is called to prompt an input
		// from the user.

		OptionsMenu();

		// An integer variable called choice is created to sort the different code
		// variations for the users options.

		int choice;

		// A while loop is created and given a boolean value of true to iterate through
		// the different scanner options.

		while (true) {

			// User is prompted to enter an integer from 1 to 5.

			System.out.print("\nEnter a choice and Press ENTER to continue[1-5]: ");

			// A try / catch statement is used for handling errors.

			try {
				Scanner scan = new Scanner(System.in);
				choice = scan.nextInt();

				// A switch statement is used to seperate the menu options and to keep the code
				// tidy.

				switch (choice) {

					case 1:
						Scanner scanAdd = new Scanner(System.in);

						UserInput newEntry = new UserInput();

						System.out.println("\nPlease provide the following information. ");

						System.out.println("\nProduct Description: ");
						newEntry.description = scanAdd.next();
						System.out.println(newEntry.description);

						System.out.println("\nProduct price: ");
						newEntry.value = scanAdd.nextDouble();
						System.out.println(newEntry.cost);

						System.out.println("\nQuantity to be added: ");
						newEntry.value2 = scanAdd.nextDouble();
						System.out.println(newEntry.amount);

						// Double TotalValue = newEntry.quantity1 * newEntry.price1;

						newEntry.TextFileAdd();

						// System.out.println(newEntry.quantity);
						System.out.println(newEntry.TotalValue);

						scanAdd.close();

						break;

					case 2:
						// Prompt user to input the item ID

						// System.out.println("Please enter the item ID number: ");
						// int updateItem = scan.nextInt();

						// Prompt the user to enter the new ID quantity

						// System.out.println("\n Please enter the new quantity of the item: ");
						// int newQuant = scan.nextInt();

						System.out.println("\n Item quantity updated");
						break;

					case 3:
						System.out.println("\n Item Removed");
						break;

					case 4:
						System.out.print("\n Report printed");
						break;

					case 5:
						System.out.println("Exiting...");
						scan.close();
						return;

					default:
						scan.close();
						OptionsMenu();
						break;

				}
			}

			catch (InputMismatchException ex) {
				System.out.println("This doesn't appear to be a valid option...!");
			}

		}

	}
}
