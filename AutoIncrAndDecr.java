package practicecodes;

import java.util.Scanner;

public class AutoIncrAndDecr {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println(" Enter any two number to do increment and decrement respectively ");

        int num1=scan.nextInt();
        int num2=scan.nextInt();

        num1++;
        num2--;

        System.out.println(" num1 increment " + num1);// value to num2
        System.out.println(" num2 decrement " + num2);

    }

}
