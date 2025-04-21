package Financetool;

import java.util.Scanner;
import java.util.ArrayList;

/*
This is the main program
*/
public class Finances {

    //Maybe include hashmap, but thats a later problem to implement

    //lets try and be anal about the introduction and commenting in this

    /*
        Main is used for testing the functions, after we are sure about the functions, we will move onto creating
        basic UI and further experimentation

        Testing:
            Add
            Delete
            Reset
            Quit
    */

    //For testing, just shoving the items into an arrayList, this should later be put into a Subteam class
    private static ArrayList<Items> itemsArrayList = new ArrayList<Items>();

//-------------------------------------Helper functions-------------------------------------

    /**
     * Checks if the name given exists within the ArrayList (ignores the case)
     * @param name the given name of the item
     * @return the location of the item that the name matches in the ArrayList
     */
    public static int nameLocation (String name) {
        //to fix, we need to make sure that it goes through the entire string
        //also weird thing where we add 2 for some reason

        String[] searchWord = name.split("[, ]+");

        boolean match = false;
        for (int i = 0; i < itemsArrayList.size(); i++) {

            Items item = itemsArrayList.get(i);

            String nameItem = item.getNameItem();

            String[] wordSearchItem = nameItem.split("[, ]+");

            match = false;

            for (int j = 0; j < searchWord.length; j++) {
                for (int k = 0; k < wordSearchItem.length; k++) {
                    if (wordSearchItem[j].equalsIgnoreCase(searchWord[k])) {
                        match = true;
                        break;
                    }
                }
                if (match) {
                    return i;
                }
            }

        }

        return -1;

    }

//-------------------------------------------------------------------------------------------

    /**
     * Checks the name of the item, and if it exists, add to it, otherwise create a new item and apply the parameters to it
     * @param name
     * @param buyer
     * @param price
     * @param quantity
     * @param shipping
     * @param importance
     * @param description
     * @param link
     * @param invoice
     */
    public static void addItem(String name, String buyer, double price, int quantity, double shipping, int importance, String description, String link, String invoice) {

        Items item = new Items (name, buyer, price, quantity, shipping, importance, description, link, invoice);

        int location = nameLocation(name);

        if (location != -1) {
            Items existingItem = itemsArrayList.get(location);

            existingItem.setQuantityItem(existingItem.getQuantityItem() + quantity);

            int newQuantity = existingItem.getQuantityItem();

            System.out.println("Adjusted existing item.");
            System.out.println("The new quantity is: " + newQuantity);

        } else {
            itemsArrayList.add(item);

            System.out.println("Added new item.");
        }

        itemsArrayList.add(item);
    }

    /**
     * Prints out the ArrayList
     */
    public static void printItems() {
        int counter = 0;
        for (Items item : itemsArrayList) {
            System.out.println(item.toString());
            counter++;
        }
        System.out.println("Counter: " + counter);
    }



//
//    /**
//     * Removes the item from the ArrayList
//     * @param name
//     */
//    public static void removeItem (String name) {
//
//        int location = nameCheck(name);
//
//        if (location != -1) {
//
//        }
//
//
//    }





    public static void main (String[] args) {
        Scanner keyboard = new Scanner (System.in);

        String optionChoice = "";

        do {
            System.out.println("Options: Add, Delete, Print, Quit");

            optionChoice = keyboard.nextLine().trim().toLowerCase();


            switch (optionChoice) {
                case "add":
                    String name = "";
                    String buyer = "";
                    double price = 0.0;
                    int quantity = 0;
                    double shipping = 0.0;
                    int importance = 0;
                    String description = ""; //
                    String link = "";
                    String invoice = "";

                    System.out.println("Enter the name of the item you would like to add");
                    name = keyboard.nextLine();

                    System.out.println("Enter the buyer of the item you would like to add");
                    buyer = keyboard.nextLine();

                    System.out.println("Enter the price of the item you would like to add");
                    price = keyboard.nextDouble();
                    keyboard.nextLine();

                    System.out.println("Enter the quantity of the item you would like to add");
                    quantity = keyboard.nextInt();
                    keyboard.nextLine();

                    System.out.println("Enter the shipping of the item you would like to add");
                    shipping = keyboard.nextDouble();
                    keyboard.nextLine();

                    System.out.println("Enter the importance of the item you would like to add");
                    importance = keyboard.nextInt();
                    keyboard.nextLine();

                    System.out.println("Enter the description of the item you would like to add");
                    description = keyboard.nextLine();

                    System.out.println("Enter the link of the item you would like to add");
                    link = keyboard.nextLine();

                    System.out.println("Enter the invoice of the item you would like to add");
                    invoice = keyboard.nextLine();

                    addItem(name, buyer, price, quantity, shipping, importance, description, link, invoice);

                    break;

                case "delete":

                    break;

                case "print":
                    printItems();
                    break;

                case "quit":
                    System.out.println("Exiting Program");
                    System.exit(0);
                    break;
            }



        } while (true);


    }


}
