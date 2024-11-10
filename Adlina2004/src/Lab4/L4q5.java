package Lab4;
import javax.swing.JOptionPane;
public class L4q5 {
    public static void main(String[] args) {
       String input = JOptionPane.showInputDialog("Please enter distance in meter: ");
       double distanceInMeter = Double.parseDouble(input);
       
      input = JOptionPane.showInputDialog("Please enter time in hours: ");
       double timeInHours = Double.parseDouble(input);
       
      input = JOptionPane.showInputDialog("Please enter time in minutes: ");
      double timeInMinutes = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Please enter time in seconds: ");
      double timeInSeconds = Double.parseDouble(input);
      
      double speedInMeterPerSecond = distanceInMeter / timeInSeconds;
      double speedInKilometerPerHour = (speedInMeterPerSecond * 3600) /1000 ;
      double speedInMilesPerHour = (speedInMeterPerSecond * 3600) / 1609;
      
      String message = String.format("Speed in meters per second is %.2f\nSpeed in kilometers per hour is %.2f\nSpeed in miles per hour is %.2f",
                       speedInMeterPerSecond, speedInKilometerPerHour, speedInMilesPerHour);

      JOptionPane.showMessageDialog(null, message);
              
    }
    
}


