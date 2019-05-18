package practicecodes;

import java.util.Scanner;

public class ArithmeticOp {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter any two numbers to operate all arithmetic operations ");

        double num1=scan.nextInt();// because of fractional value we used double
        double num2=scan.nextInt();

        System.out.println(" num1 + num2 " + (num1+num2) );
        System.out.println(" num1 - num2 " + (num1-num2) );
        System.out.println(" num1 * num2 " + (num1*num2) );
        System.out.println(" num1 / num2 " + (num1/num2) );
        System.out.println(" num1 % num2 " + (num1%num2) ); // modules gives you the reminder value

    }
}