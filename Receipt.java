import java.util.ArrayList;

public class Receipt {
    private String name;
    private ArrayList<IceCream> iceCreams;
    public double finalTotal;
    public double cost;

    public Receipt() {
        iceCreams = new ArrayList<IceCream>();
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void add(IceCream iceCream) {
        iceCreams.add(iceCream);
    }

    public void printReceipt() {
        System.out.println("Adkins' Scoop City Receipt");
        System.out.println("Customer Name: " + this.name);
        System.out.println();
        
        finalTotal = 0.00;
        for (IceCream order : iceCreams) {
            order.iceCreamInfo();
            finalTotal += order.calcTotal();
        }
        System.out.printf("Final Total: $%.2f\n", finalTotal);
    }
}
