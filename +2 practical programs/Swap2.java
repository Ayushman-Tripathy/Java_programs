import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        a=sc.nextInt();
        System.out.print("Enter the second number:");
        b=sc.nextInt();
        System.out.println("Value of a: "+a+" and b: "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping");
        System.out.println("Value of a: "+a+" and b: "+b);

    }
}
