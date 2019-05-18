package practicecodes;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Readnobyuser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  //this is user entry
        System.out.println("Enter any number: "); //for user identification

        int num=scan.nextInt();//read the no provided by the user

        if(num%2==0)  // condition to check the number
        {
            System.out.println("the number entered by the user is : " + num + " and it is Even number");
        }
        else
        {
            System.out.println("the number entered by the user is : " + num + " and it is Odd number");
        }

        scan.close(); // closing the scanner

    }

}
