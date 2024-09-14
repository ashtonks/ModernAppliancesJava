package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import problemDomain.*;

public class ReadFile {
	public static String filePath = "res/appliances.txt"; 
    public static ArrayList<Refrigerators> refrigeratorsList = new ArrayList<>(); 
    public static ArrayList<Vacuums> vacuumsList = new ArrayList<>(); 
    public static ArrayList<Microwaves> microwavesList = new ArrayList<>();
    public static ArrayList<Dishwashers> dishwashersList = new ArrayList<>();
    
	public static void readFromFile() {
	    {
	    
		try (Scanner scanner = new Scanner(new File(filePath))) {
	        scanner.useDelimiter(";\\s*");

	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine(); 

	            try (Scanner lineScanner = new Scanner(line)) {
	                lineScanner.useDelimiter(";\\s*");
	                
	                String itemNumber = lineScanner.next();
	                // Place each appliance into their respective list
	                	// Refrigerators
	                    if (itemNumber.charAt(0) == '1') {
	                        Refrigerators.addRefrigerator(line, refrigeratorsList);
	                    }
	                    // Vacuums
	                    if (itemNumber.charAt(0) == '2') {
	                    	Vacuums.addVacuum(line, vacuumsList);
	                    }
	                    // Microwaves
	                    if (itemNumber.charAt(0) == '3') {
	                    	Microwaves.addMicrowave(line, microwavesList);
	                    }
	                    // Dishwashers
	                    if (itemNumber.charAt(0) == '4' || itemNumber.charAt(0) == '5') {
	                    	Dishwashers.addDishwasher(line, dishwashersList);
	                   	}
	            	}
	        	}
	    	} 	catch (FileNotFoundException e) {
	        	e.printStackTrace();
	    	}
		}
	}
}
