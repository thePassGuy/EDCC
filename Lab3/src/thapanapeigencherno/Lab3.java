package thapanapeigencherno;

import java.util.Random;
import java.util.Scanner;

/**
 * Game that randomize value
 * 
 * @author Thapana Berpan
 * @author Peigen Tang
 * @author cherno camara
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int money = 500;

        System.out.println("Welcome to SPIN - a game of chance!");
        System.out.println("You are given $500 to start the game.");
        System.out.println("Every time you spin the wheel you have a chance of:");
        System.out.println("S - Splitting your money in half.");
        System.out.println("P - Plunging to zero. (You loose.)");
        System.out.println("I - Increasing your money to double.");
        System.out.println("N - Never needing money again! (You win!)");
        System.out.println("You may quit at any time and go home with your current winnings.");

        System.out.println(
                "Current winnings = $"
                + money
                + " - SPIN again? (Y/N) "
        );

        while (money != 0) {

            System.out.println();

            Scanner input = new Scanner(System.in);

            String userin = input.nextLine();
            // 
            if (userin.equals("Y")) {
                Random rn = new Random();
                int random = rn.nextInt(4) + 1;
                switch (random) {
                    case 1:
                        money = money / 2;
                        break;
                    case 2:
                        money = 0;
                        break;
                    case 3:
                        money = money * 2;
                        break;
                    case 4:
                        money = 1000000000;
                        break;

                }

                System.out.println(
                        "Current winnings = $"
                        + money
                        + " - SPIN again? (Y/N) "
                );
              
            } else if (userin.equals("N")) {

                System.out.println(
                        "Current winnings = $"
                        + money + "thanks for playing!"
                );
                break;
            } else {
                System.out.println("please print Y or N");
            }
        }
    }

    /**
     * maybe build some method lol
     */
}
