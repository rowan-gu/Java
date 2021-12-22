/*
  * ScannerExperiments.java
  * @description Some tinkering with the scanner class
  * @version 1.0, 2021-09-06
  * @author Prof. Zelenberg
*/

import java.util.Scanner;

public class ScannerExperiments{
  //attributes
  static Scanner scan; // this takes in inputs
  static String answer1;
  static int answerInt;
  static double answerDouble;

  //methods
  public static void main(String[] args){

    scan = new Scanner(System.in); //instantiates an object

    System.out.println("Enter a string:");
    answer1 = scan.nextLine();
    System.out.println("You entered: " + answer1);

    System.out.println("Enter an integer:");
    answerInt = scan.nextInt();
    System.out.println("You entered: " + answerInt);

    System.out.println("Enter a double:");
    answerDouble = scan.nextDouble();
    System.out.println("You entered: " + answerDouble);

    System.out.println("Guess the number I'm thinking:")
    answerInt = scan.nextInt();
    while(answerInt != 5){
      System.out.println("Wrong. Guess again:");
      answerInt = scan.nextInt();
    }
    System.out.println("Correct! The answer is 5!");

  }//end of the main method
}//end of the class
