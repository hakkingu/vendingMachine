import java.util.Scanner;

	public class Main {
    	public static void main(String[] args) {
        
        //Pick user's input
        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO THE JAVA MACHINE!            ");
        System.out.println("\t************************************************");

       //Make a 2D array of the items that you want
        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Dolly", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Mountain Dew", 1.99, 2) , new Item("Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };

        //Call the machine from Machine.java, and then make a new one with the 'items' in the parenthesis for copying. 
        //After that, print that out.
        Machine machine = new Machine(items);

        System.out.println(machine);

        //Make a loop that will run unless it returns false. Scan user's input after that.
        while (true) {
            System.out.print("Pick a row: ");
            int row = scan.nextInt();
            System.out.print("Pick a spot in the row: ");
            int spot = scan.nextInt();

            boolean sold = machine.dispense(row, spot);
            System.out.println("\n" + machine);
      
          //Make a if statement for checking the items. 
            if (sold == true) {
                System.out.print("\nHave a nice day! Press 1 to purchase another item: ");
            } else {
                System.out.print("Sorry, we don't have this item anymore. Press 1 to purchase another one: ");
            }
            if (scan.nextInt() != 1) {
                break;
            }
        }
        scan.close();
        }
}
