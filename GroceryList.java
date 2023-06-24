// This class keeps track of a grocery list of items

public class GroceryList {
    //private GroceryItemOrder[] items;
    //private int numItems;
    private int leangthOfArray = 5;
    private GroceryItemOrder[] a;

    //creates the array
    public GroceryList(){
        a = new GroceryItemOrder[leangthOfArray];
    }

    //checks to see if there is an empty spot and adds a new groecry item (a different object) to the array
    public boolean add(GroceryItemOrder item){
        int index = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] == null && index == -1) {
                index = i;
            }
        }
        if(index == -1){
            return false;
        }else{
            a[index] = item;
            return true;
        }
    }

    //gets the total cost of everything in the list
    public double getTotalCost(){
        double total = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != null){
                total = total + a[i].getCost();
            }
        }
        return total;
    }

    //makes sure that the list prints out the right way
    public String toString(){
        String total  = "";
        for(int i = 0; i < a.length; i++){
            if(a[i] != null){
                total =total + a[i].toString() + " \n";
            }
        }
        return total;
    }
}
