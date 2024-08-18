import java.util.Scanner ;
public class Armstrong
{
    public static void main(String[] args)
 {         
    Scanner Sc= new Scanner (System.in);
    int  num1 ,rev=0 , rem ;
    System.out.println ("Enter a Number");
    int num = Sc.nextInt() ;
    num1 = num ;
    while (num > 0)
    { 
        rem= num % 10 ;
        rev= rev + (rem*rem*rem);
        num= num/10 ;
    }
    if (num1 == rev)
       {
        System.out.println("The number is armstrong");
    }
    else 
    {
        System.out.println("The number is not armstrong");
    }
Sc.close();
 }
}