import java.util.ArrayList;

public class IceCream {
    private String flavor;
    private int numScoops;
    private double pricePerScoop;
    private boolean isDeluxeBrand;
    private ArrayList<Topping> toppings;

    public boolean validateFlavor(String flavor) {
        return flavor.equalsIgnoreCase("Vanilla") || 
            flavor.equalsIgnoreCase("Chocolate") || 
            flavor.equalsIgnoreCase("Strawberry");
    }


}
