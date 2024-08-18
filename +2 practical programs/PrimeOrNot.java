import java.util.Scanner;
public class PrimeOrNot 
{    public static void main(String[] args) {
        int num , i = 1 , c=0 ;
        Scanner Sc=new Scanner (System.in) ;
        System.out.println("Enter any number");
        num = Sc.nextInt() ;
        while (num >= i) 
        {
            if (num% i==0)
            {
                c++ ;
            }   
            i++ ; 
        }
        if (c==2)
        {
            System.out.println("The number is prime");
        }
        else 
        {
            System.out.println("The numebr is not prime");
        }  Sc.close(); 
        if (c==1)
        {
            System.out.println("It is a special number");
        }
    }
}