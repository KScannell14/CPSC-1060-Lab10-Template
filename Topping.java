public class Topping {
    private String type;
    private double cost = 0.00;
    public boolean hasToppings;

    public Topping() {
        type = "NONE";
    }

    public boolean validateTopping(String type) {
        return type.equalsIgnoreCase("Sprinkles") || 
            type.equalsIgnoreCase("GummyBears") || 
            type.equalsIgnoreCase("Oreos") || 
            type.equalsIgnoreCase("Done");
    }

    //create a boolean value if first topping is "done"; where and how to implement?

    public void setType(String toppingType) {
        type = toppingType;
        switch (type) {
                case "Sprinkles":
                case "sprinkles": 
                    cost += 0.15;
                break;

                case "GummyBears":
                case "Gummybears":
                case "gummyBears":
                case "gummybears": 
                    cost += 0.45;
                break;

                case "oreos":
                case "Oreos":
                    cost += 0.38;
                break;
                
                case "Done":
                case "done":
                    cost += 0.00;
                break;
            }
    }

    public String getType() {
        return type;
    }


    /*public void setCost() {
        for (Topping topping: topTemp) {
            if (type.equalsIgnoreCase("Sprinkles")) {
                cost += 0.15;
            }
            if (type.equalsIgnoreCase("GummyBears")) {
                cost += 0.45;
            }
            if (type.equalsIgnoreCase("Oreos")) {
                cost += 0.38;
            }
            else {
                cost += 0.00;
            }
        }
    }

    public boolean yesToppings() {
        if (cost == 0) {
            hasToppings = false;
        }
        else {
            hasToppings = true;
        }
        return hasToppings;
    }
    */
    public double getCost() {
        return cost;
    }
}
