
package Lab3;
import javax.swing.JOptionPane;
public class L3q1 {
    
    
    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog("Input total working hour:");
        int working_hour = Integer.parseInt(input);
        
        input= JOptionPane.showInputDialog("Input total pay rate per hour:");
        double rate_per_hour = Double.parseDouble(input);
        
        double gross_pay = working_hour* rate_per_hour;
        
        JOptionPane.showMessageDialog(null,"total gross pay is " + gross_pay);
        
        //to set answer in two decimal point
        //String message = String.format( "total gross pay is %.2f", gross_pay);
        //JOptionPane.showMessageDialog(null,message);


    }