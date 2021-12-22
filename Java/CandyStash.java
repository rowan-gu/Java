/*
    * CandyStash.java
    * @description Class to represent a candy stash
    * @author Rowan Guduru
    *@version 1.0, 2021-09-10
*/
import java.util.Scanner;

public class CandyStash{
    //attributes
    private Scanner input;
    private int totalCandies, totalChocolates,
    totalSourCandies;
    private String notCandy;
    private boolean lollipops, fullSizeCandy;

    //methods

    //-----------------------------------
    // Constructor for CandyStash
    // Constructors return objects
    //-----------------------------------
    public CandyStash(boolean lollipops, boolean fullSizeCandy){


        //parameter provided values
        this.lollipops = lollipops;
        this.fullSizeCandy = fullSizeCandy;

        // default values
        this.totalCandies = 10;
        this.totalSourCandies = 5;
        totalChocolates = 5; // <-- is this ok?

        // provided by prompting the user
        input = new Scanner(System.in);
        System.out.println("What non-candy items did you get?");
        notCandy = input.nextLine();
}
        //-----------------------------------
        // set total number of candies
        //-----------------------------------
        public void setTotalCandies(int newTotal){
            totalSourCandies = newTotal;
    }
        //-----------------------------------
        // set total number of chocolates
        //-----------------------------------
        public void setTotalChocolates(int newTotal){
            totalChocolates = newTotal;
        }
        //-----------------------------------
        // represents eating 1 chocolate
        //-----------------------------------
        public void eatAChocolate(){
            totalChocolates -= 1; //short hand for decreasing by 1
            totalCandies -= 1;
        }
        //-----------------------------------
        // represents eating 1 sour candy
        //-----------------------------------
        public void eatASourCandy(){
            totalSourCandies -= 1; //short hand for decreasing by 1
            totalCandies -= 1;
        }
        //-----------------------------------
        // gets not candy items
        //-----------------------------------
        public String getNotCandy(){
            return notCandy;
        }

}
