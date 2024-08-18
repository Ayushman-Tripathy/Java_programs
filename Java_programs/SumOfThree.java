import java.util.Scanner;
public class SumOfThree {
    public static void main(String[] args) {
        int a,b,c,sum;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = num.nextInt();
        System.out.println("Enter the first number: ");
        b = num.nextInt();
        System.out.println("Enter the first number: ");
        c = num.nextInt();
        sum = a+b+c;
        System.out.println("The summation is: "+ sum);
        num.close();
    }
}
