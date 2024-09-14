package problemDomain;
import java.util.ArrayList;
import java.util.Scanner;

public class Refrigerators extends Appliance {
    private int numberOfDoors;
    private int height;
    private int width;

    public Refrigerators(
        String itemNumber,
        String brand,
        int quantity,
        int wattage,
        String color,
        double price,
        int numberOfDoors,
        int height,
        int width) {
        
        super(itemNumber, brand, quantity, wattage, color, price);

        this.numberOfDoors = numberOfDoors;
        this.height = height;
        this.width = width;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    

    
    public static void addRefrigerator(String line, ArrayList<Refrigerators> list) {
        try (Scanner lineScanner = new Scanner(line)) {
            lineScanner.useDelimiter(";\\s*");
            String itemNumber = lineScanner.next();
            String brand = lineScanner.next();
            int quantity = lineScanner.nextInt();
            int wattage = lineScanner.nextInt();
            String color = lineScanner.next();
            double price = lineScanner.nextDouble();
            int numberOfDoors = lineScanner.nextInt();
            int height = lineScanner.nextInt();
            int width = lineScanner.nextInt();

            Refrigerators r = new Refrigerators(itemNumber, brand, quantity, wattage, color, price, numberOfDoors, height, width);
            list.add(r);
        }
    }
    
    @Override
	public String toString() {
		return "\n Item Number: " + itemNumber + 
				"\n Brand: " + brand +
				"\n Quantity: " + quantity +
				"\n Wattage: " + wattage +
				"\n Color: " + color +
				"\n Price: " + price +
				"\n Number of Doors: " + numberOfDoors +
				"\n Height: " + height +
				"\n Width: " + width;
	}
}

