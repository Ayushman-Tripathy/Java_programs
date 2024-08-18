//19.Display Your Name Program
import java.util.Scanner;
class DisplayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = sc.next();
        String ser = sc.next();
        System.out.println("Hello " + name +" "+ ser);
    }
}   