package utility;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import problemDomain.Dishwashers;
import problemDomain.Microwaves;
import problemDomain.Refrigerators;
import problemDomain.Vacuums;

public abstract class SaveToFile {
	
	public static void saveAppliancesToFile(
            ArrayList<Refrigerators> rList,
            ArrayList<Vacuums> vList,
            ArrayList<Microwaves> mList,
            ArrayList<Dishwashers> dList,
            String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Refrigerators r : rList) {
                writer.write(r.getItemNumber() + "; " +
                             r.getBrand() + "; " +
                             r.getQuantity() + "; " +
                             r.getWattage() + "; " +
                             r.getColor() + "; " +
                             r.getPrice() + "; " +
                             r.getNumberOfDoors() + "; " + 
                             r.getHeight() + "; " + 
                             r.getWidth() + "\n"); 
            }
            for (Vacuums v : vList) {
                writer.write(v.getItemNumber() + "; " +
                             v.getBrand() + "; " +
                             v.getQuantity() + "; " +
                             v.getWattage() + "; " +
                             v.getColor() + "; " +
                             v.getPrice() + "; " +
                             v.getGrade() + "; " + 
                             v.getBatteryVoltage() + "\n"); 
            }
            for (Microwaves m : mList) {
                writer.write(m.getItemNumber() + "; " +
                             m.getBrand() + "; " +
                             m.getQuantity() + "; " +
                             m.getWattage() + "; " +
                             m.getColor() + "; " +
                             m.getPrice() + "; " +
                             m.getCapacity() + "; " + 
                             m.getRoomType() + "\n"); 
            }
            for (Dishwashers d : dList) {
                writer.write(d.getItemNumber() + "; " +
                             d.getBrand() + "; " +
                             d.getQuantity() + "; " +
                             d.getWattage() + "; " +
                             d.getColor() + "; " +
                             d.getPrice() + "; " +
                             d.getFeature() + "; " + 
                             d.getSoundRating() + "\n"); 
            }
            writer.flush(); 
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving to file.");
        }
    }
}
