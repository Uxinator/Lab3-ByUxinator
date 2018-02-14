import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scnr = new Scanner (System.in);
        double milesPerGallon;
        double tankCapacity;
        double percentageGas;
        double rawRange;

        System.out.print("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        milesPerGallon = scnr.nextDouble();
        System.out.println();

        if (milesPerGallon < 1) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
        }

        else {
            System.out.print("Enter your car's tank capacity (gallons) as a positive decimal number: ");
            tankCapacity = scnr.nextDouble();
            System.out.println();

            if (tankCapacity <= 0) {
                System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            }

            else{
                System.out.print("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
                percentageGas = scnr.nextDouble();
                System.out.println();

                if (percentageGas < 0 || percentageGas > 100) {
                    System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!"); //For Lab 5
                }

                else {
                    rawRange = milesPerGallon * tankCapacity * (percentageGas * 0.01);

                    if (rawRange <= 25) {
                        System.out.print("Attention! Your current estimated range is running low: " + (int) rawRange + " miles left!!!");
                    }
                    else {
                        System.out.print("Keep driving! Your current estimated range is: " + (int) rawRange + " miles!");
                    }
                }

            }


        }

    }
}
