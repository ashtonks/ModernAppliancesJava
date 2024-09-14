package problemDomain;

import java.util.ArrayList;
import java.util.Scanner;

public class Vacuums extends Appliance{
	String grade;
	int batteryVoltage;
	
	public Vacuums(
			String itemNumber,
			String brand,
			int quantity,
			int wattage,
			String color,
			double price,
			String grade,
			int batteryVoltage) {
		
		super(itemNumber, brand, quantity, wattage, color, price);
		
		this.grade = grade;
		this.batteryVoltage = batteryVoltage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getBatteryVoltage() {
		return batteryVoltage;
	}

	public void setBatteryVoltage(int batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}
	
	public static void addVacuum(String line, ArrayList<Vacuums> list) {
        try (Scanner lineScanner = new Scanner(line)) {
            lineScanner.useDelimiter(";\\s*");
            String itemNumber = lineScanner.next();
            String brand = lineScanner.next();
            int quantity = lineScanner.nextInt();
            int wattage = lineScanner.nextInt();
            String color = lineScanner.next();
            double price = lineScanner.nextDouble();
            String grade = lineScanner.next();
            int batteryVoltage = lineScanner.nextInt();

            Vacuums v = new Vacuums(itemNumber, brand, quantity, wattage, color, price, grade, batteryVoltage);
            list.add(v);
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
				"\n Grade: " + grade +
				"\n Battery Voltage: " + batteryVoltage;
	}
}
