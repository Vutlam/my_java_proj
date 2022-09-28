import java.util.Scanner;

public class CalcOfSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        String name;
        double monthlySalary,annualSalary;

        System.out.println("Enter the employee no :");
         no = sc.nextInt();
        System.out.println("Enter the employee name :");
         name = sc.next();
        System.out.println("Enter the employee monthly salary :");
        monthlySalary = sc.nextDouble();
        annualSalary = monthlySalary * 12; //12 months in a year//
        System.out.println("Annual salary of an Employee"+ " = " +monthlySalary+ " * " +12+ " = "+annualSalary);



    }
}
