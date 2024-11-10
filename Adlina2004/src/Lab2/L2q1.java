
package Lab2;
import java.util.Scanner;

public class L2q1 {
    public static void main(String[] args) {
      
       //initialiazation
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("input total working hour:");
       
        int working_hour= scanner.nextInt();    //10 hour
        
       System.out.println("Input rate per hour");
        double rate_per_hour = scanner.nextDouble();   //rm5.50
       
        double gross_pay=0;
       
        //process
        gross_pay= working_hour*rate_per_hour;
        
        //output
        System.out.println("total gross pay is " + gross_pay);
    } 
    
}

