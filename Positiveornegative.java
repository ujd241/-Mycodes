package practicecodes;

import java.util.Scanner;

public class Positiveornegative {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int num1=scan.nextInt();
      // int num2=scan.nextInt();

        if (num1>0)
        {
            System.out.println( num1 +  " is positive ");
        }
        else
        {
            System.out.println( num1 +  " is negative ");
        }



    }
}
