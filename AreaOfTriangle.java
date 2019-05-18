package practicecodes;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter the width of triangle ");

        int Width=scan.nextInt();

        System.out.println(" Enter the height of triangle ");

        int Height=scan.nextInt();

        double Area = (Width*Height)/2;

        System.out.println(" Area of the triangle is " + Area );


    }

}
