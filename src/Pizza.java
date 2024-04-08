public class Pizza {

    // Variables
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingAdded = 150;
    private int deliveryFee = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedTakeAway = false;



    // Constructor
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }

        basePizzaPrice = this.price;
    }

    /*                              Class Methods                             */

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        //System.out.println("Extra cheese added.");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        //System.out.println("Extra toppings added");
        this.price += extraToppingAdded;
    }

    public void takeAway(){
        isOptedTakeAway= true;
        //System.out.println("Take away opted.");
        this.price += deliveryFee;

    }

    public void getBill(){
        String bill = "";
        System.out.println("Base pizza: " + basePizzaPrice);
        if(isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded) {
            bill += "Extra toppings added: " + extraToppingAdded + "\n";
        }

        if(isOptedTakeAway) {
            bill += "Opted for take away:  " + deliveryFee + "\n";
        }

        bill += "Bill: " + this.price;
        System.out.println(bill);


    }


}
