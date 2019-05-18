package practicecodes;

import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//input from user

        System.out.println(" enter any two numbers(+ or -) number");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        num2 = (num1 > 0) ? 100 : 200;// expression of ternary operator if the condition is true
        // 100 will assign to num2 else 200 will assign to num2
        System.out.println(" num2 is " + num2);

        num2 = (num1 < 0) ? 100 : 200;// expression of ternary operator if the condition is true
        // 100 will assign to num2 else 200 will assign to num2
        System.out.println(" num2 is " + num2);


    }
}
