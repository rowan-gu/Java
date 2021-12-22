/*
    * CoinstarGuduru.java
    * @description inputs cash to output prizes
    * @version 1.0, 9/15/2021
    * @author Rowan Guduru
*/
import java.util.Scanner;
import java.lang.Math;

public class CoinstarGuduru{
    //attributes
    private int totalQuarters, totalDimes,
    totalNickels, totalPennies, totalHundreds, totalFifties,
    totalTwenties, totalTens, totalOnes;
    private Scanner input;
    public int totalValue;

    //methods

    //---------------------------
    // Constructor
    //---------------------------
    public CoinstarGuduru() {
        input = new Scanner(System.in);
        totalQuarters = 0;
        totalDimes = 0;
        totalNickels = 0;
        totalPennies = 0;
        totalHundreds = 0;
        totalFifties = 0;
        totalTwenties = 0;
        totalTens = 0;
        totalOnes = 0;

    }

    //---------------------------
    // prompts user to give total coinage
    //---------------------------
    public void intake(){
        System.out.println("Enter the total number of quarters: ");
        totalQuarters = input.nextInt();
        System.out.println("You entered " + totalQuarters + " quarters.");
        System.out.println("Enter the total number of dimes: ");
        totalDimes = input.nextInt();
        System.out.println("You entered " + totalDimes + " dimes.");
        System.out.println("Enter the total number of nickels: ");
        totalNickels = input.nextInt();
        System.out.println("You entered " + totalNickels + " nickels.");
        System.out.println("Enter the total number of pennies: ");
        totalPennies = input.nextInt();
        System.out.println("You entered " + totalPennies + " pennies.");

    }

    public void totalValue(){
        totalValue = (totalQuarters * 25) + (totalDimes * 10) + (totalNickels * 5)
        + totalPennies;
        System.out.println("Your total value is $" + totalValue/100.0);
    }

    public void cash(){
        double actualValue = totalValue / 100.0;

        System.out.println("You have $" + actualValue);
        // deduct 10% from totalValue
        double deducted = Math.round(actualValue* 10.0) /100.0;
        System.out.println("A 10% fee will be deducted, for $" + Math.round(deducted * 100.0) / 100.0);
        actualValue = Math.round((actualValue - deducted) * 100.0) / 100.0i;
        // print message
        System.out.println("You will get: $" + actualValue);

    }

    public void giftCard(){
        System.out.println("You will now be issued a gift card in the amount of $" + totalValue/100.0);
    }

    public void bitcoin(){
        double bitcoin = totalValue/ (100.0 * 45735.10);
        System.out.println("You will be issued " + bitcoin + " bitcoin");
    }

    public void cashOut(){
        System.out.println("Enter 1 for cash, 2 gift card, and 3 for bitcoin: ");
        int answer = input.nextInt();

        while (answer > 3 || answer < 1){
            System.out.println("Invalid input");
            answer = input.nextInt();
        }

        if (answer == 1){
            cash();
        }
        else if (answer == 2){
            giftCard();
        }
        else if (answer == 3){
            bitcoin();
        }


    }
} //end of class
