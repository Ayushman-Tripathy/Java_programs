//26.Calculate Mark,persentage,Grade of a Student
import java.util.Scanner;

class StudentMarkPercentageGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, d, e, total, per ;
        String grade = "";
        total = 0;

        System.out.print("enter the 1ST Language mark: ");
        a = sc.nextFloat();
        System.out.print("enter the Physics mark: ");
        b = sc.nextFloat();
        System.out.print("enter the Chemistry mark: ");
        c = sc.nextFloat();
        System.out.print("enter the IT mark: ");
        d = sc.nextFloat();
        System.out.print("enter the Math mark: ");
        e = sc.nextFloat();
        total = a + b + c + d + e;
        per = total / 5;
        
        if(per >= 90) grade = "A";
        else if(per >= 80) grade = "B";
        else if(per >= 70) grade = "C";
        else if(per >= 60) grade = "D";
        else if(per >= 50) grade = "E";
        else grade = "Fail";

        System.out.println("Total marks obtained: "+total);
        System.out.println("Percentage: "+per);
        System.out.println("Grade: "+grade);
    }
}