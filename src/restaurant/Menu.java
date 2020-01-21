package restaurant;

import java.time.LocalDate;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private LocalDate editDate;

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.editDate = LocalDate.now();
    }

    public Object getMenuItems() {
        return menuItems;
    }

    public LocalDate getEditDate() {
        return editDate;
    }


    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
    public void removeItem(String menuItem) {
        menuItems.removeIf(item -> item.getName().equals(menuItem));

    }
    public MenuItem customerChoice (String choice) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(choice)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder printMenu = new StringBuilder();
        for(MenuItem item : menuItems) {
            printMenu.append("\n*********\n").append(item.getName()).append("\n").append(item.getPrice()).append("\n").append(item.getDescription()).append("\n").append(item.getCategory()).append("\n");
        }
        return printMenu.toString();
    }
}


