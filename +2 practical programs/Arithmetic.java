//18.Arithmetic Program
import java.util.Scanner;
class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum, sub, mul, mod;
        float div;

        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b= sc.nextInt();

        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = (float) a / b;
        mod = a % b;

        System.out.println("Summation of two numebrs: "+sum);
        System.out.println("substration of two numebrs: "+sub);
        System.out.println("Multiplication of two numebrs: "+mul);
        System.out.println("Division of two numebrs: "+div);
        System.out.println("Modular Division of two numebrs: "+mod);
    }    
}