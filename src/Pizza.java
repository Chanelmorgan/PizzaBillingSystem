public class Pizza {

    // Variables
    private int price;
    private Boolean veg;


    // Constructor
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    // Getter
    public void getPrice() {
        System.out.println(this.price);
    }


}
