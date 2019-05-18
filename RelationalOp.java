package practicecodes;

import java.util.Scanner;

public class RelationalOp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter two numbers to do relational operation");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println(" numbers are equal ");
        } else {
            System.out.println(" numbers are not equal ");

        }
        if (num1 != num2) {
            System.out.println(" numbers are not equal ");
        } else {
            System.out.println(" numbers are equal ");
        }
        if (num1 > num2) {
            System.out.println(" num1 greater ");
        } else {
            System.out.println(" num2 is greater ");

        }
        if (num1 < num2) {
            System.out.println(" num1 is lessor ");
        } else {
            System.out.println(" num2 is lessor ");
        }


        if (num1 >= num2) {
            System.out.println(" num1 is greater than or equal to num2 ");
        } else {
            System.out.println(" num2 is greater");
        }

        if (num1 <= num2) {
            System.out.println(" num1 is lessor than or equal to num2 ");
        } else {
            System.out.println(" num2 is lessor");
        }
    }

}

