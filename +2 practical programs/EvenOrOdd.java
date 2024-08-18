import java.util.Scanner; 
public class EvenOrOdd {
    public static void main(String[] args) {
        int n ;
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n= Sc.nextInt() ;
        if(n % 2 == 0)
        {
            System.out.println("It is a EVEN number");
        }
        else
        {
            System.out.println("It is a ODD number");
        }
        Sc.close();
    }
}   