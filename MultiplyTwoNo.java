package practicecodes;

import java.util.Scanner;

public class MultiplyTwoNo {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // scanning of user entry

        System.out.println(" Enter any two numbers"); // user notification

        int num1=scan.nextInt(); //first no
        int num2=scan.nextInt();// second no


        scan.close();// closing scan

        int product = num1*num2;// multiplication

        System.out.println(" product of entered numbers is " + product );//printing line

    }
}
