import java.util.Scanner;
public class SingleInheritance {
    public static void main(String[] args) {
        int num1, num2, num3, result ;
        System.out.println("Enter any three integer");
        Scanner Sc = new Scanner(System.in);
        num1= Sc.nextInt();
        num2= Sc.nextInt();
        num3= Sc.nextInt();
        result=num1+num2+num3;
        System.out.println("the result after addition is :"+ result);
        Sc.close() ;
    }
}
