package com.pluralsight;

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
