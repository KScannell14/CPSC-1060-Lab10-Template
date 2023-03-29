import java.util.ArrayList;

public class IceCream {
    private String flavor;
    private int numScoops;
    private double pricePerScoop;
    private boolean isDeluxeBrand;
    private ArrayList<Topping> toppings;
    public double totalPrice;

    public boolean validateFlavor(String flavor) {
        return flavor.equalsIgnoreCase("Vanilla") || 
            flavor.equalsIgnoreCase("Chocolate") || 
            flavor.equalsIgnoreCase("Strawberry");
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
        switch flavor {
                case flavor.equalsIgnoreCase("Vanilla"):
                    pricePerScoop = 1.05;
                break;

                case flavor.equalsIgnoreCase("Chocolate"):
                    pricePerScoop = 1.12;
                break;

                case flavor.equalsIgnoreCase("Strawberry");
                    pricePerScoop = 1.32;
                break;
            }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setDeluxeBrand(boolean isDeluxeBrand) {
        this.isDeluxeBrand = isDeluxeBrand;
    }

    public boolean getDeluxeBrand() {
        return isDeluxeBrand;
    }

    public void setNumScoops(int numScoops) {
        this.numScoops = numScoops;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void calcTotal() {
        if (isDeluxeBrand == true) {
            totalPrice = numScoops * pricePerScoop * 1.42;
        }
        else {
            totalPrice = numScoops * pricePerScoop;
        }
    }

}
