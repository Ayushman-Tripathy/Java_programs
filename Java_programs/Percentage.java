import java.util.Scanner;

public class Percentage {
    public static void main(String[] args)
    {
        int m1,m2,m3,m4,m5,sum;
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter the first mark: ");
        m1 = mark.nextInt();
        System.out.println("Enter the second mark: ");
        m2 = mark.nextInt();
        System.out.println("Enter the third mark: ");
        m3 = mark.nextInt();
        System.out.println("Enter the fourth mark: ");
        m4 = mark.nextInt();
        System.out.println("Enter the fifth mark: ");
        m5 = mark.nextInt();
        sum=m1+m2+m3+m4+m5;
        System.out.println("The Percentage mark: "+sum/5);
        mark.close();
    }
}
