import java.util.Scanner;

public class AreaOfaCircleProgram {
    public static void main(String[] args) {
        int r;
        double pi = 3.143, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        r = sc.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle :" + area);

        sc.close();
    }
}