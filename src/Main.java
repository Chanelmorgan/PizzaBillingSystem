public class Main {

    public static void main(String[] args) {
        // Testing
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        basePizza.getBill();
    }
}
