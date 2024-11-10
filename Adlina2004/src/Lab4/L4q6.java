
package Lab4;
import java.util.Scanner;
public class L4q6 {
     public static void main(String[] args) {
        
         Scanner input = new Scanner (System.in);
         
        System.out.print("Please enter the first number : ");
        double num1 = input.nextDouble();
        
        System.out.print("Please enter the second number : ");
        double num2 = input.nextDouble();
        
        System.out.print("Please enter the third number : ");
        double num3 = input.nextDouble();
        
        double mean = (num1 + num2 + num3) /3;
        double variance = ((Math.pow(num1-mean,2)) +  (Math.pow(num2-mean,2)) + (Math.pow (num3-mean,2))) /3;
        double standardDeviation = Math.sqrt(variance);
        
        System.out.println("Mean : " + mean);
        System.out.println("Variance : " + variance);
        System.out.println("Standard Deviation : " + standardDeviation);
    }
    
}
    

