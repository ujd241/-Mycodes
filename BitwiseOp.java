package practicecodes;

import java.util.Scanner;

public class BitwiseOp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" enter two numbers to perform bitwise operator");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(" num1 & num2 result is : " + (num1 & num2));// logic AND operation
        System.out.println(" num1 | num2 result is : " + (num1 | num2));//logic OR operation
        System.out.println(" num1 ^ num2 result is : " + (num1 ^ num2));//gives 1 if they are equal else 0
        System.out.println(" num1 <<  result is : " + (num1 << 2));//two bit left shift
        System.out.println(" num1 >>  result is : " + (num1 >> 2));// two bit right shift
        System.out.println(" num2 <<  result is : " + (num2 << 2));
        System.out.println(" num2 >>  result is : " + (num2 >> 2));
        System.out.println(" num1 ~ result is : " + (~num1));//complemet operator
        System.out.println(" num2 ~ result is : " + (~num2));


    }
}
