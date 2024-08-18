//13. Factorial Program
import java.util.Scanner;
public class FactorialProgram {
    public static void main(String[] args) {
        int fact =1 , i , num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        for(i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println("The factorial of the given number is :"+ fact);
        sc.close();
    }
}
