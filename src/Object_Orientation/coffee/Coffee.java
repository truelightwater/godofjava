package Object_Orientation.coffee;

public class Coffee {
    private String name;
    private int price;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.cost();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
