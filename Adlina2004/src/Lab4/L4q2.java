
package Lab4;
import javax.swing.JOptionPane;
public class L4q2 {
    
    public static void main(String[] args) {
       
        String input =  JOptionPane.showInputDialog("Enter the radius of circle");
        double radius = Double.parseDouble(input.substring(0));
        
        double pi = 3.14159;
        
        double diameter = 2*radius;
        double circumference =  2*pi*radius;
        double area = pi *(Math.pow(radius,radius));
        String message = String.format("circumference of the circle is %.2f ",circumference)+String.format("area of the circle is %.2f ",area) ;
       
        JOptionPane.showMessageDialog(null,"diameter of the circle is " + diameter);
        JOptionPane.showMessageDialog(null,message);
    }
    
}


