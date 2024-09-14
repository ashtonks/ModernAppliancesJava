package utility;

import java.util.Scanner;
import problemDomain.*;

public class UserInterface {

    public static void runApplication() {
        Scanner s = new Scanner(System.in);
        ReadFile.readFromFile();
        
        boolean continueRunning = true;
        
        while (continueRunning) {
            System.out.println("Welcome to modern Appliances!");
            System.out.println("How May we Assist You?\n");
            
            System.out.println("1 - Check out appliance");
            System.out.println("2 - Find appliances by brand");
            System.out.println("3 - Display appliances by type");
            System.out.println("4 - Produce random appliance list");
            System.out.println("5 - Save & exit");
            
            System.out.println("\nEnter option:\n");
            
            String userInput = s.nextLine();
            
            try {
                int userIntput = Integer.parseInt(userInput);
                
                switch(userIntput) {
                    case 1:
                        System.out.println("Enter item number of an Appliance: ");
                        String inputCase1 = s.nextLine();
                        Appliance.checkOutAppliance(
                            inputCase1,
                            ReadFile.refrigeratorsList,
                            ReadFile.vacuumsList,
                            ReadFile.microwavesList,
                            ReadFile.dishwashersList,
                            ReadFile.filePath);
                        break;
                    case 2:
                        System.out.println("Enter brand to search for:");
                        String inputCase2 = s.nextLine();
                        Appliance.findAppliancesByBrand(
                            inputCase2, 
                            ReadFile.refrigeratorsList,
                            ReadFile.vacuumsList,
                            ReadFile.microwavesList,
                            ReadFile.dishwashersList,
                            ReadFile.filePath);
                        break;
                    case 3:
                        System.out.println(""
                            + "Appliance Types\n"
                            + "1 - Refrigerators"
                            + "\n2 - Vacuums"
                            + "\n3 - Microwaves"
                            + "\n4 - Dishwashers");
                        String inputCase3 = s.nextLine();
                        Appliance.displayApplianceByType(
                            inputCase3,
                            ReadFile.refrigeratorsList,
                            ReadFile.vacuumsList,
                            ReadFile.microwavesList,
                            ReadFile.dishwashersList,
                            ReadFile.filePath);
                        break;
                    case 4:
                        System.out.println("Enter number of appliances: ");
                        int inputCase4 = s.nextInt();
                        s.nextLine(); 
                        Appliance.produceRandomApplianceList(
                            inputCase4,
                            ReadFile.refrigeratorsList,
                            ReadFile.vacuumsList,
                            ReadFile.microwavesList,
                            ReadFile.dishwashersList);
                        break;
                    case 5:
                        Appliance.saveAndExit(
                            ReadFile.refrigeratorsList,
                            ReadFile.vacuumsList,
                            ReadFile.microwavesList,
                            ReadFile.dishwashersList,
                            ReadFile.filePath);
                        continueRunning = false;
                        break;
                    default:
                        System.out.println("Invalid option, please try again.");
                }
                
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid number.");
            } catch (Exception ex) {
                System.out.println("An error occurred: " + ex.getMessage());
            }

            if (continueRunning) {
                System.out.println("\nWould you like to perform another action? (yes/no)");
                String continueInput = s.nextLine();
                if (continueInput.equalsIgnoreCase("no")) {
                    continueRunning = false;
                    System.out.println("Exiting the application. Thank you for using modern Appliances!");
                }
            }
        }
    }
}
