package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        int length = scnr.nextInt();

        System.out.println("What is the width of the room in feet?");
        int width = scnr.nextInt();

        System.out.format("You entered dimensions of %d feet by %d feet\n", length, width);

        int area = length * width;

        System.out.format("The are is:\n%d square feet\n", area);

        double meterSq = area * 0.09290304;

        System.out.format("%.3f square meters", meterSq);




    }
}
