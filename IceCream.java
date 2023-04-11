import java.util.ArrayList;

public class IceCream {
    private String flavor;
    private int numScoops;
    private double pricePerScoop;
    private boolean isDeluxeBrand;
    private ArrayList<Topping> toppings;
    public double totalPrice;
    public String isEmpty;
    public double finalTotal = 0.00;
    public String type;

    public IceCream() {
        isDeluxeBrand = false;
        toppings = new ArrayList<Topping>();
    }
    
    public boolean validateFlavor(String flavor) {
        return flavor.equalsIgnoreCase("Vanilla") || 
            flavor.equalsIgnoreCase("Chocolate") || 
            flavor.equalsIgnoreCase("Strawberry");
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
        switch (flavor) {
                case "vanilla":
                case "Vanilla": 
                    pricePerScoop = 1.05;
                break;

                case "chocolate":
                case "Chocolate":
                    pricePerScoop = 1.12;
                break;

                case "strawberry":
                case "Strawberry":
                    pricePerScoop = 1.32;
                break;
            }
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void setDeluxeBrand(boolean isDeluxeBrand) {
        this.isDeluxeBrand = isDeluxeBrand;
    }

    public boolean getDeluxeBrand() {
        return this.isDeluxeBrand;
    }

    public void setNumScoops(int numScoops) {
        this.numScoops = numScoops;
    }

    public int getNumScoops() {
        return this.numScoops;
    }

    public double calcTotal() {
        if (isDeluxeBrand == true) {
            totalPrice = this.numScoops * pricePerScoop * 1.42;
        }
        else {
            totalPrice = this.numScoops * pricePerScoop;
        }

        for (Topping price : toppings) {
            totalPrice += price.getCost();
        }

        return totalPrice;
    }

    public double finalPrice() {
        finalTotal += calcTotal();
        return finalTotal;
    }

    public void setToppings(ArrayList<Topping> topTemp) {
        for (Topping item : topTemp) {
            toppings.add(item);
        }
    }

    public void iceCreamInfo() {
        System.out.println("Flavor: " + flavor);
        System.out.println("Scoops: " + numScoops);
        System.out.println("Deluxe: " + isDeluxeBrand);
        System.out.print("Toppings:");

        if (toppings.isEmpty()) {
            System.out.print(" NONE");
        }
        else {
            for (Topping item : toppings) {
                System.out.print(" " + item.getType());
            }
        }
        
        System.out.println();
        System.out.printf("Total: $%.2f\n", calcTotal());
        System.out.println();
    }
    
}
