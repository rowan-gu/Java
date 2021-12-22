/*
    * CandyDriver.java
    * @description driver for the CandyStash Class
    * @version 1.0, 2021-09-08
    * @author Prof. Zelenberg
*/

public class CandyDriver{

    static Dog jimmy;

    public static void main(String[] args) {

        jimmy = new CandyStash(true, true);

        jimmy.setTotalCandies(100);
        jimmy.setTotalChocolates(77);
        jimmy.setSourCandies(10);

        jimmy.eatAChocolate();
        jimmy.eatASourCandy();

    }
}
