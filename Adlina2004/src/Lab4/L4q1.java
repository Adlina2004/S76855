
package Lab4;
import java.util.Scanner;
public class L4q1 {
   public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        
        System.out.print("ENTER INTEGER NUMBER 1:");
        int num1 = input.nextInt();
        
        System.out.print("ENTER INTEGER NUMBER 2:");
        int num2 = input.nextInt();
        
        int square1 = num1*num1;
        int square2 = num2*num2;
        int sumSquare = square1 + square2;
        int differenceSquare = square1 - square2;
        
        System.out.println("the square of number 1 is : " + square1 );
        System.out.println("the square of number 2 is : " + square2 );
        System.out.println("the sum of the square is : " + sumSquare);
        System.out.println("the difference of the square is : " + differenceSquare);
                
                
    }
    
}

