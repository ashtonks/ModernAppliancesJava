package problemDomain;

import java.util.ArrayList;
import java.util.Scanner;

public class Dishwashers extends Appliance{
	String feature;
	String soundRating;
	
	public Dishwashers(
			String itemNumber,
			String brand,
			int quantity,
			int wattage,
			String color,
			double price,
			String feature,
			String soundRating) {
		
		super(itemNumber, brand, quantity, wattage, color, price);
		
		this.feature = feature;
		this.soundRating = soundRating;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getSoundRating() {
		return soundRating;
	}

	public void setSoundRating(String soundRating) {
		this.soundRating = soundRating;
	}
	
	public static void addDishwasher(String line, ArrayList<Dishwashers> list) {
        try (Scanner lineScanner = new Scanner(line)) {
            lineScanner.useDelimiter(";\\s*");
            String itemNumber = lineScanner.next();
            String brand = lineScanner.next();
            int quantity = lineScanner.nextInt();
            int wattage = lineScanner.nextInt();
            String color = lineScanner.next();
            double price = lineScanner.nextDouble();
            String feature = lineScanner.next();
            String soundRating = lineScanner.next();

            Dishwashers d = new Dishwashers(itemNumber, brand, quantity, wattage, color, price, feature, soundRating);
            list.add(d);
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
				"\n Feature: " + feature +
				"\n Sound Rating: " + soundRating;
	}
}
