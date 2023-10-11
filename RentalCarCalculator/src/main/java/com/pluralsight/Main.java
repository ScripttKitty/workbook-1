package com.pluralsight;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double cost;

        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the pickup date in MM/DD/YY format: ");
        String date = scnr.nextLine();

        System.out.println("Please enter the number of days you would like to rent for:");
        int days = scnr.nextInt();

        System.out.println("Would you like an electronic toll tag for $3.95/day (Y/N):");
        char tag = scnr.next().charAt(0);
        boolean isYesForTag = tag == 'Y' ;

        System.out.println("Would you like a GPS for $2.95/day (Y/N): ");
        char gps = scnr.next().charAt(0);
        boolean isYesForGps = tag == 'Y' ;

        System.out.println("Would you like roadside assistance for $3.95/day (Y/N): ");
        char roadAssistance = scnr.next().charAt(0);
        boolean isYesForRA = tag == 'Y' ;

        System.out.println("What is your current age? ");
        int age = scnr.nextInt();

        doCalculation(days, age, isYesForTag, isYesForGps, isYesForRA);
    }

    public static void doCalculation( int days, int age, boolean isYesForTag, boolean isYesForGps, boolean isYesForRA) {
        double tagCharge = 3.95;
        double gpsCharge = 2.95;
        double raCharge = 3.95;
        double basicRental = 29.99;
        double underageCharge = 0.3 * basicRental;
        double cost = days * basicRental;

        if (isYesForTag)
        {
            cost += tagCharge * days;

        }
        if (isYesForGps)
        {
            cost += gpsCharge * days;
        }
        if(isYesForRA)
        {
            cost += raCharge * days;
        }
        if(age < 25)
        {
            cost += underageCharge * days;
        }

        System.out.println("Your total cost is: " + "%2f" + cost);

        }


    }



