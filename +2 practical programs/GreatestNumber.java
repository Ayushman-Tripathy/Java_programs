//25.Greatest amount of three number
import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        System.out.println("Enter another number: ");
        b = sc.nextInt();
        System.out.println("Enter third number: ");
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("the greatest number is: " + a);
            } else {
                System.out.println("the greatest number is: " + c);
            }
        }  if (b > c) {
            System.out.println("the greatest number is: " + b);
        } else {
            System.out.println("the greatest number is: " + c);
        }
    }
}