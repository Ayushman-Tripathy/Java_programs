import java.util.Scanner;
public class KmToMile {
    public static void main(String[] args) {
        int a;
        float mile;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance in KM: ");
        a = sc.nextInt();
        mile = a*0.621371f;
        System.out.println("Distance in miles = "+ mile);
        sc.close();
    }
}
