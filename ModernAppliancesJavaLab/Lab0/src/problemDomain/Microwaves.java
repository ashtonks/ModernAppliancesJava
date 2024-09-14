package problemDomain;

import java.util.ArrayList;
import java.util.Scanner;

public class Microwaves extends Appliance{
	double capacity;
	String roomType;
	
	public Microwaves(
			String itemNumber,
			String brand,
			int quantity,
			int wattage,
			String color,
			double price,
			double capacity,
			String roomType) {
		
		super(itemNumber, brand, quantity, wattage, color, price);
		
		this.capacity = capacity;
		this.roomType = roomType;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public static void addMicrowave(String line, ArrayList<Microwaves> list) {
        try (Scanner lineScanner = new Scanner(line)) {
            lineScanner.useDelimiter(";\\s*");
            String itemNumber = lineScanner.next();
            String brand = lineScanner.next();
            int quantity = lineScanner.nextInt();
            int wattage = lineScanner.nextInt();
            String color = lineScanner.next();
            double price = lineScanner.nextDouble();
            double capacity = lineScanner.nextDouble();
            String roomType = lineScanner.next();

            Microwaves m = new Microwaves(itemNumber, brand, quantity, wattage, color, price, capacity, roomType);
            list.add(m);
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
				"\n Capacity: " + capacity +
				"\n Room Type: " + roomType;
	}
}
