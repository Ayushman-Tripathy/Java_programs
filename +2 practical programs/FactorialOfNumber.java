import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String[] args) {
        int i=1 , num , fact=1;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num= Sc.nextInt();
        while (i<=num)
        {
            fact = fact*i;
            i++;
        }
        System.out.println("The factorial of the number is :" + fact);
        Sc.close();
    }
}
