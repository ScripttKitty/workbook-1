package com.pluralsight;

import java.util.Scanner;

public class MathApp {

    public static void main(String[ ] args) {

        //STEP 1 question 1:
        int bobSalary = 65000;
        int garySalary = 78500;
        int highestSalary;
        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //Question 2:
        int carPrice = 10000;
        int truckPrice = 9500;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice );

        //Question 3
        double radius = 7.25;
        double area;
        area = Math.PI  * Math.pow(radius, radius);
        System.out.println("The area of a circle with a radius of " + radius + " is " + area );

        //Question 4
        double distance = 0.0;
        distance = Math.sqrt( Math.pow(85, -5.0)) + Math.pow( 50, -10.);
        System.out.println("Distance between two points" + distance);

        //Question 5
        int num = 42;
        double pi = 3.14159;
        String name = "Alice";
        char grade = 'A';
        String formatted = String.format("Number: %d, Pi: %f, Name: %s, Grade: %c", num, pi, name, grade);
        System.out.println(formatted);

        Scanner scanner = new Scanner(System.in);
        double inputValue = promptAndReturnDouble("Please enter a floating point number: ");
        System.out.println(inputValue);

        System.out.println("Please enter your name:");
        String inputString = scanner.nextLine();
        System.out.println(inputString);

        return;

        public static double promptAndReturnDouble(String prompt){
            double value;
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt + " : ");
            value = scanner.nextDouble();

            scanner.nextLine();
            rerutn value;
        }

        /*
        Math.Pi
        double answer = 5. / 3.;
        double answer2 = 3. / 5.;
        System.out.printf("%8.2e 8.2f" ,answer ,answer2);
         */


        /*
        double pricePerPound;
        pricePerPound = 1.5;
        int poundOfPotatoes;
        poundOfPotatoes = 10;
        double price = pricePerPound + poundOfPotatoes;

        System.out.printf("%8.2f" ,price);
        System.out.println();
        System.out.printf("%9.3f" ,price);

         */
    }
}
