import java.util.Scanner;

public class SwabOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before swab num1 is :");
        int num1 = sc.nextInt();
        System.out.println("Before swab num2 is :");
        int num2 = sc.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swab num1" +"= "+num1+ ","+ "num2" + " = " +num2);





    }
}
