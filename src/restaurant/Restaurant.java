package restaurant;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        MenuItem pizza = new MenuItem("Pizza", 10, "cheesy", "Main Course");
        MenuItem salad = new MenuItem("Salad", 15, "fresh and green", "appetizer");
        MenuItem cheesecake = new MenuItem("Cheesecake", 10.00, "also cheesy", "dessert");
        Menu menu = new Menu();
        menu.addItem(pizza);
        menu.addItem(salad);
        menu.addItem(cheesecake);
        System.out.println(menu.toString());
        System.out.println(now);

        do {

            System.out.println("Type Add or Remove to change the menu, List to list an item, or q to quit:  ");
            String editMenu = input.nextLine();
            if (editMenu.equals("Add")) {
                System.out.println("Item name: ");
                String name = input.nextLine();

                System.out.println("Item price: ");
                double price = input.nextDouble();

                System.out.println("Item description: ");
                input.nextLine();
                String description = input.nextLine();

                System.out.println("Item category: ");
                String category = input.nextLine();

                MenuItem newItem = new MenuItem(name, price, description, category);
                menu.addItem(newItem);
                System.out.println(menu.toString());
                System.out.println(now);
            } else if (editMenu.equals("Remove")) {
                System.out.println("Name the item to remove: ");
                String remove = input.nextLine();
                menu.removeItem(remove);
                System.out.println(menu.toString());
                System.out.println(now);
            } else if (editMenu.equals("List")){
                System.out.println("Choose a menu item:  ");
                String choice = input.nextLine();
                MenuItem printChoice = menu.customerChoice(choice);
                System.out.println("\n**********\n" + printChoice.getName() + "\n" + printChoice.getPrice() + "\n" + printChoice.getDescription() + "\n" + printChoice.getCategory() + "\n");
            } else {
                break;
            }

        } while (!input.nextLine().equals("q"));
    }
}
