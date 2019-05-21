package practicecodes;

import java.util.Scanner;

public class ForFact {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter the number within 25 to find factorial");

        int num = scan.nextInt();
        long fact = 1;

        scan.close();


        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(" the factorial value of " + num + " is " + fact);

    }
}
