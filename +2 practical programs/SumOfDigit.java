import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, t, rem, sum;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        sum = 0;
        t = num;
        while (t > 0) {
            rem = t % 10;
            sum += rem;
            t /= 10;
        }

        System.out.println("The digit sum of the number "+num+" is: "+sum);
    }
}