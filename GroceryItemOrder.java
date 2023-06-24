// This class stores information about a single grocery item being ordered.

public class GroceryItemOrder {
    //makes these valuse accuseable to any method within the class
    private String nameC;
    private int quantityC;
    private double priceC;

    //inputs the valuses of each one and sets them to the class valuse
    public GroceryItemOrder(String name, int quality, double price){
        nameC = name;
        quantityC = quality;
        priceC = price;
    }

    //allosws you to change the about of a product that you want
    public void setQuantity(int quality){
        quantityC = quality;
    }

    //allows you to find the cost of each product acording to how much you want
    public double getCost(){
        return quantityC*priceC;
    }

    //makes it so when you print it has the right format.
    public String toString(){
        return quantityC + " of " + nameC;
    }
}
