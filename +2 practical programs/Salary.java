//24.Gross salary
import java.util.Scanner;
class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic, ba, gp, da, hra, ta, pf, ns, gs;
        System.out.println("Enter basic amount: ");
        basic= sc.nextDouble();
        System.out.println("Enter the grade pay: ");
        gp = sc.nextDouble();
        ba = basic + gp;
        da = basic* 1.35;
        hra = basic * 0.15;
        ta = basic * 0.1;
        pf = basic * 0.25;
        gs = ba + da + hra + ta + pf;
        ns = gs - pf;
        System.out.println("The gross salary is: "+gs);
        System.out.println("The gross net salary is: "+ns);
    }
}