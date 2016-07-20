package berpankim;

import java.util.*;

/**
 * This program displays the future investment value using investment amount,
 * annual interest rate and number of years.
 *
 * @author Thapana Berpan
 * @author Juhee Kim
 * @version 1.0.2 07/16/2016
 */
public class Lab2 {

    /**
     * Outputs future investment using inputs.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // common value that use for conversion in this calcution
        final double CONVERSION_HUNDRED = 100.0;
        final double YEAR_TO_MONTH = 12.0;
         
        
        // The loopback create new object everytime user doesn't put numerical value
        while (true) {

            Scanner scanIn = new Scanner(System.in);

            try {
                // Ask for user input for investment amount, interest rate (annuelly), years

                System.out.print("Enter investment amount: ");
                double investmentAmount = scanIn.nextDouble();

                System.out.print("Enter annual interest rate in percentage: ");
                double InterestRate = scanIn.nextDouble();
                InterestRate = (InterestRate / CONVERSION_HUNDRED) / YEAR_TO_MONTH; //reuse Interest rate and convert it to monthly

                System.out.print("Enter number of years: ");
                double years = scanIn.nextDouble();

                // Calulate the final amount and gives output to console(future investment value)
                double futureInvestmentValue
                        = investmentAmount
                        * Math.pow(1 + InterestRate, years * YEAR_TO_MONTH);
                System.out.println(
                        "Accumulated value is $"
                        + Math.round(futureInvestmentValue * CONVERSION_HUNDRED)
                        / CONVERSION_HUNDRED
                );

                break;
            
            // if user put non-numerical value, this part will be run instead.
            } catch (Exception e) {
                System.out.println("Please enter numerical value.");

            }

        }
    }
}
