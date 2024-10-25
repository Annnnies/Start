package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        var scanner = new Scanner(System.in);

        //GitHub Test

        System.out.println("What is the fuel cost of the car per 100 km?");
        var fuel = scanner.nextDouble();
        System.out.println("Fuel cost is " + fuel);

        while (true) {
            System.out.println("How many kilometers?");
            var distance = scanner.nextDouble();

            if (distance == 0)
                break;

            var result = fuel * distance / 100;
            System.out.println("Result = " + result);
        }
    }
}