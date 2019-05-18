package practicecodes;

import java.util.Scanner;

public class LargestnumberTernary {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);//input from user

        System.out.println(" enter three numbers");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int temp, result;

        temp = (num1 > num2) ? num1 : num2;
        result = (num3 > temp) ? num3 : temp;

        System.out.println("the largest number is " + result);


    }
}
