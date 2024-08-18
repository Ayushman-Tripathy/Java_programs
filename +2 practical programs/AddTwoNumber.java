//20.Add two numbers 
import java.util.Scanner;
public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;  
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        c = a + b;
        System.out.println("The summation of two given number is: "+c );//OR
        System.out.println("The summation of "+a+" and "+b+" is: "+c );
    }
}