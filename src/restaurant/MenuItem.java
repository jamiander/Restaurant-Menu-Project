package restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;

    }

    public void setName(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
}



