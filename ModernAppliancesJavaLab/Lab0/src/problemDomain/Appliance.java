package problemDomain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import utility.SaveToFile;

public abstract class Appliance {
	static Scanner s = new Scanner(System.in);
	String itemNumber;
	String brand;
	int quantity;
	int wattage;
	String color;
	double price;
	
	public Appliance(
			String itemNumber,
			String brand,
			int quantity,
			int wattage,
			String color,
			double price) {
		
		this.itemNumber = itemNumber;
		this.brand = brand;
		this.quantity = quantity;
		this.wattage = wattage;
		this.color = color;
		this.price = price;
		
	}
	
	
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getWattage() {
		return wattage;
	}
	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
    public static void checkOutAppliance(
    		String itemNumber, 
    		ArrayList<Refrigerators> rList,
    		ArrayList<Vacuums> vList,
    		ArrayList<Microwaves> mList,
    		ArrayList<Dishwashers> dList,
    		String filePath) {
    	
        boolean found = false; 
        
        if (itemNumber.charAt(0) == '1') {
        	for (Refrigerators r : rList) {
	            if (r.getItemNumber().equals(itemNumber)) { 
	            	if(r.getQuantity() == 0) {
	            		System.out.println("Appliance is not available to be checked out");
	            		found = true;
	            	}
	            	else {
	                r.setQuantity(r.getQuantity() - 1);
	                System.out.println("\nAppliance: \"" + r.itemNumber + "\" has been checked out!");

	                found = true;  
	            	}
	            }
	        }
	
	        if (!found) {
	            System.out.println("No appliances found with that number");
	        }
        }
        if (itemNumber.charAt(0) == '2') {
        	for (Vacuums v : vList) {
	            if (v.getItemNumber().equals(itemNumber)) { 
	            	if(v.getQuantity() == 0) {
	            		System.out.println("Appliance is not available to be checked out");
	            		found = true;
	            	}
	            	else {
	                v.setQuantity(v.getQuantity() - 1);
	                System.out.println("\nAppliance: \"" + v.itemNumber + "\" has been checked out!");

	                found = true;  
	            	}
	            }
	        }
	
	        if (!found) {
	            System.out.println("No appliances found with that number");
	        }
        }
        if (itemNumber.charAt(0) == '3') {
        	for (Microwaves m : mList) {
	            if (m.getItemNumber().equals(itemNumber)) { 
	            	if(m.getQuantity() == 0) {
	            		System.out.println("Appliance is not available to be checked out");
	            		found = true;
	            	}
	            	else {
	                m.setQuantity(m.getQuantity() - 1);
	                System.out.println("\nAppliance: \"" + m.itemNumber + "\" has been checked out!");
	                found = true;  
	            	}
	            }
	        }
	
	        if (!found) {
	            System.out.println("No appliances found with that number");
	        }
        }
        if (itemNumber.charAt(0) == '4' || itemNumber.charAt(0) == '5') {
        	for (Dishwashers d : dList) {
	            if (d.getItemNumber().equals(itemNumber)) { 
	            	if(d.getQuantity() == 0) {
	            		System.out.println("Appliance is not available to be checked out");
	            		found = true;
	            	}
	            	else {
	                d.setQuantity(d.getQuantity() - 1);
	                System.out.println("\nAppliance: \"" + d.itemNumber + "\" has been checked out!");
	                found = true;  
	            	}
	            }
	        }
	
	        if (!found) {
	            System.out.println("No appliances found with that number");
	        }
        }
        
        SaveToFile.saveAppliancesToFile(rList, vList, mList, dList, filePath);
	        
    }
    
    public static void findAppliancesByBrand(
    		String brand,
    		ArrayList<Refrigerators> rList,
    		ArrayList<Vacuums> vList,
    		ArrayList<Microwaves> mList,
    		ArrayList<Dishwashers> dList,
    		String filePath) {
    	
    	for (Refrigerators r : rList) {
    		if (r.brand.toLowerCase().equals(brand.toLowerCase())) {
    			System.out.println(r);
    		}
    	}
    	
    	for (Vacuums v : vList) {
    		if (v.brand.toLowerCase().equals(brand.toLowerCase())) {
    			System.out.println(v);
    		}
    	}
    	
    	for (Microwaves m : mList) {
    		if (m.brand.toLowerCase().equals(brand.toLowerCase())) {
    			System.out.println(m);
    		}
    	}
    	
    	for (Dishwashers d : dList) {
    		if (d.brand.toLowerCase().equals(brand.toLowerCase())) {
    			System.out.println(d);
    		}
    	}
    	
    }
    
    public static void displayApplianceByType(
    		String userInput,
    		ArrayList<Refrigerators> rList,
    		ArrayList<Vacuums> vList,
    		ArrayList<Microwaves> mList,
    		ArrayList<Dishwashers> dList,
    		String filePath) {
    	
    	switch(userInput) {
    	case "1":
    		System.out.println("Enter number of doors: (2,3, or 4)");
    		int numDoors = s.nextInt();
    		for (Refrigerators r : rList) {
    			if (r.getNumberOfDoors() == numDoors) {
    				System.out.println(r);
    			}

    		}break;
    		
    	case "2":
    		System.out.println("Enter battery voltage value. 18 V (low) or 24 V (high");
    		int voltage = s.nextInt();
    		for (Vacuums v : vList) {
    			if (v.getBatteryVoltage() == voltage) {
    				System.out.println(v);
    			}
    		}break;
    	
    	case "3":
    		System.out.println("Room where microwave will be installed: K (kitchen) or W (work site)");
    		String room = s.nextLine().toLowerCase();
    		for (Microwaves m : mList) {
    			if (room.equals(m.roomType.toLowerCase())) {
    				System.out.println(m);
    			}
    		}break;
    	
    	case "4":
    		System.out.println(""
    				+ "Enter the sound rating of the dishwasher: Qt (Quietest), Qr (Quieter)"
    				+ "\n Qu (Quiet) or M (Moderate)");
    		String sound = s.nextLine().toLowerCase();
    		for (Dishwashers d : dList) {
    			if (sound.equals(d.soundRating.toLowerCase())) {
    				System.out.println(d);
    			}
    		}break;
    	}
    }
    
    public static void produceRandomApplianceList(
            int numAppliances,
            ArrayList<Refrigerators> rList,
            ArrayList<Vacuums> vList,
            ArrayList<Microwaves> mList,
            ArrayList<Dishwashers> dList) {
        	ArrayList<Object> allAppliances = new ArrayList<>();

        allAppliances.addAll(rList);
        allAppliances.addAll(vList);
        allAppliances.addAll(mList);
        allAppliances.addAll(dList);

        Collections.shuffle(allAppliances);

        if (numAppliances > allAppliances.size()) {
            System.out.println("Not enough appliances available. Showing all available appliances:");
            numAppliances = allAppliances.size();
        }

        System.out.println("Random appliances: ");
        for (int i = 0; i < numAppliances; i++) {
            System.out.println(allAppliances.get(i));
        }
    }
    
    public static void saveAndExit(
    		ArrayList<Refrigerators> rList,
            ArrayList<Vacuums> vList,
            ArrayList<Microwaves> mList,
            ArrayList<Dishwashers> dList,
            String filePath) {
    	SaveToFile.saveAppliancesToFile(rList, vList, mList, dList, filePath);
    	System.exit(0);
    }
	
	@Override
	public String toString() {
		return "\nItem Number: " + itemNumber +
				" Brand: " + brand +
				" Quantity: " + quantity +
				" Wattage: " + wattage +
				" Color: " + color +
				" Price: " + price;
	}
	
}
