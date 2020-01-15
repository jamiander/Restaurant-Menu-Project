package restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private LocalDateTime editDate;

    public Menu(ArrayList<MenuItem> menuItems, LocalDateTime editDate) {
        this.menuItems = menuItems;
        this.editDate = editDate;
    }

    public Object getMenuItem() {
        return menuItems;
    }

    public LocalDateTime getEditDate() {
        return editDate;
    }


    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
    public void removeItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }
}


