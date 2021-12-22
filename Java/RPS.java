/*
    * RPS.java
    * @description The methods for the game Rock Paper Scissors
    * @author Rowan Guduru
    * @version 1.0, 2021-09-13
*/
import java.util.Scanner;
import java.util.Random;

public class RPS{

    //attributes
    private Scanner input; //allows us to take info from user
    private Random rand;
    private int win, loss, tie; // abt user
    private int user, comp; // 0 = rock, 1 = paper; 2 = scissors

    //methods

    //-----------------------------------------
    // Constructor
    //-----------------------------------------
    public RPS(){
        win = 0;
        loss = 0;
        tie = 0;

        input = new Scanner(System.in);
        rand = new Random();
    }

    //-----------------------------------------
    // Ask user their hand
    //-----------------------------------------
    public void choice(){
        System.out.println("Enter 0 for rock, 1 for paper," +
                            " 2 for scissors: ");
        user = input.nextInt();
        // TODO: Check the user's input
    }

    //-----------------------------------------
    // Generate user their hand
    //-----------------------------------------
    public void response(){
        comp = rand.nextInt(3); // gives 0, 1, 2
        // TODO: Check the user's input
    }

    //-----------------------------------------
    // Determine winner
    //-----------------------------------------
    public String winner(){

        // user | comp | attribute
        //  0   |   0   |   tie
        //  0   |   1   |   loss
        //  0   |   2   |   win
        //  1   |   0   |   win
        //  1   |   1   |   tie
        //  1   |   2   |   loss
        //  2   |   0   |   loss
        //  2   |   1   |   win
        //  2   |   2   |   tie

        if (user == comp){
            tie++; //increase by 1
            return "tie";
        }
        else if((user == 1 && comp == 0) ||
                (user == 2 && comp == 1) ||
                (user == 0 && comp == 2) ){
            win++;
            return "User";
        }
        else{
            loss++;
            return "Computer";
        }

    }

    //-----------------------------------------
    // Communicate to user
    //-----------------------------------------
    public void communication(){

        //what this is
        System.out.println("Let's play rock, paper, scissors!");
        //allow the user to play
        choice();
        //get a comp hand
        response();

        // communicate what the hands are (user and computer)
        if (user == 0){
            System.out.println("You have played rock.");
        } else if(user == 1){
            System.out.println("You have played paper.");
        } else{
            System.out.println("You have played scissors.");
        }

        if (comp == 0){
            System.out.println("The computer  played rock.");
        } else if(comp == 1){
            System.out.println("The computer played paper.");
        } else{
            System.out.println("The computer played scissors.");
        }
        System.out.println("You have played " + user);
        System.out.println("The computer has played " + comp);

        // state who won
        String winner = winner();

        if (winner.equals("tie")){
            System.out.println("You have tied with the computer.");
        } else{
            System.out.println( winner + " is the winner.");
        }

        // ask to play again
        System.out.println("Would you like to play again?" +
                            "Type 'Y' to continue, and" +
                            "anything else to quit.");
        String playAgain = input.nextLine();
        if (playAgain.equals('Y') || playAgain.equals('y')){
            communication();
        }else {
            System.out.println("Thank you for playing!");
        }
    }

    public static void main(String[] args) {
        RPS game = new RPS();

        game.communication();
    }


} //end of class
