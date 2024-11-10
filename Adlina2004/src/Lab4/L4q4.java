
package Lab4;
import javax.swing.JOptionPane;
public class L4q4 {
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter a string");
        
        if (input != null){
             StringBuilder newString = new StringBuilder();
        for (char ch : input.toCharArray()) {
        if (Character.isLowerCase(ch)) {
             newString.append(Character.toUpperCase(ch));  // Convert to uppercase
    }   else if (Character.isUpperCase(ch)) {
             newString.append(Character.toLowerCase(ch));  // Convert to lowercase
    }   else {
             newString.append(ch);  // Keep non-alphabetic characters unchanged such as space and other character 
    }
}
     JOptionPane.showMessageDialog(null, "the new converted string is : " + newString.toString());
        

         }
    }
    
}
