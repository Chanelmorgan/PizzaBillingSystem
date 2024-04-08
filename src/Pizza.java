public class Pizza {

    // Variables
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingAdded = 150;
    private int backPack = 20;



    // Constructor
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
    }


    public void addExtraCheese(){
        System.out.println("Extra cheese added.");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        System.out.println("Extra toppings added");
        this.price += extraToppingAdded;
    }

    public void takeAway(){
        System.out.println("Take away opted.");
        this.price += backPack;

    }

    public void getBill(){
        System.out.println(this.price);

    }


}
