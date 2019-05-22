package practicecodes;

import java.util.Scanner;

public class WhileFact {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter any number to find factorial ");
        int number = scan.nextInt();

        int fact = 1, i = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        System.out.println(" The factorial of " + number + " is : " + fact);

    }
}
