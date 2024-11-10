
package Lab4;
import javax.swing.JOptionPane;
public class L4q3 {
     public static void main(String[] args) {
        int  currentYear = 2024;
        String input =  JOptionPane.showInputDialog("Enter 12 digit of your IC number");
        
        String dayPart = input.substring(4, 6);
        String monthPart = input.substring(2, 4);
        String yearPart = input.substring(0, 2);
       
        int birthYear = Integer.parseInt(yearPart);
        int month = Integer.parseInt(monthPart);
        int day = Integer.parseInt(dayPart);
        birthYear = birthYear + 2000;
   
        int age = (currentYear - birthYear);
        String message = String.format("Birth Date: %02d-%02d-%d\nAge: %d years", day, month, birthYear, age);
        JOptionPane.showMessageDialog(null,message);
     }
}
