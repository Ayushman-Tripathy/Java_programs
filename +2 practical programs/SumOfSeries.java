import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        int num , i= 1 ,sum =0 ;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num = sum ;
        num = Sc.nextInt() ;
        while(i<=num)
        {
            sum=sum+i;
            i++ ;
        }
        System.out.println("Sum of the series is :" +sum);
        Sc.close();
    }
}