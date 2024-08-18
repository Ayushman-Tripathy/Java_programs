import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num1, rev = 0, rem;
        System.out.println("Enter a number");
        int num = Sc.nextInt();
        num1 = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == num1) {
            System.out.println("The number is a pallindrome");
        } else {
            System.out.println("The number is not pallindrome");
        }
        Sc.close();
    }
}
