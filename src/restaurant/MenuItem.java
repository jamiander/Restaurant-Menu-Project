package restaurant;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Boolean newChange;


    public MenuItem(double price, String description, String category, Boolean newChange) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newChange = newChange;
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

    public void setNewChange(Boolean newChange) {
        this.newChange = newChange;
    }

    public Boolean getNewChange() {
        return newChange;
    }
}



