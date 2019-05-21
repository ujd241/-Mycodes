package practicecodes;

import java.util.Scanner;

public class ForSumNatural {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter the values ");

        int n = scan.nextInt();
        scan.close();
        int total = 0;

        for (int count = 1; count <= n; count++) {
            total = total + count;
        }
        System.out.println(" sum of " + n + " natural number is " + total);


    }
}
