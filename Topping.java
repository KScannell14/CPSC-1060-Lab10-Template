public class Topping {
    private String type;
    private double cost;

    public boolean validateTopping(String type) {
        return type.equalsIgnoreCase("Sprinkles") || 
            type.equalsIgnoreCase("GummyBears") || 
            type.equalsIgnoreCase("Oreos") || 
            type.equalsIgnoreCase("Done");
    }

}
