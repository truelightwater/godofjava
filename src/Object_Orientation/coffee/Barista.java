package Object_Orientation.coffee;

public class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);

        return coffee;

    }
}
