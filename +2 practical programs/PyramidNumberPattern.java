//14. Pyramid number Pattern
import java.util.Scanner;
public class PyramidNumberPattern {
    public static void main(String[] args) {
        int i,j,k,len ;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Length of the pyramid :");
        len=sc.nextInt();
        for(i=1; i<=len; i++)
        {
            for(j=len; j>i; j--)
            {
                System.out.println(" ");
            }
            for(k=1; k<=j; k++)
            {
                System.out.print(k+ " ");
            }
        }
    }
}