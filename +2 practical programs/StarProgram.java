import java.util.Scanner;
public class StarProgram 
{
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        int i , j , n ;
        System.out.println("Enter a Range");
        n= Sc.nextInt();
        for(i=1; i<=n; i++)
        {
            for(j=1 ;j<=1 ;j++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }    
}