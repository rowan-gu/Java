/*
    * Dog.java
    * @description Defines a Dog class
    * @version 1.0, 2021-09-08
*/

public class Dog{
    //attributes
    private String color, breed, ear, eyeColor;
    private int legs;
    private boolean coat, tail, trained;
    //true = fur or long, false = hair or short

    //methods

    //-----------------------------------------------------------------------
    // Constructor: constructs a Dog object
    //-----------------------------------------------------------------------
    public Dog(String color, String breed, String ear, String eyeColor, int legs,
        boolean coat, boolean tail){

        this.color = color;
        this.breed = breed;
        this.ear = ear;
        this.eyeColor = eyeColor;
        this.legs = legs;
        this.coat = coat;
        this.tail = tail;
        trained = false;

        System.out.println("You just made a " + breed + "!");
    }

    //-----------------------------------------------------------------------
    // prints statement describing attributes of dog
    //-----------------------------------------------------------------------
    public void getInfo(){
        String info = "This is " + color + " " + breed +
        " with " + legs + " legs. It has " + eyeColor + " eyes and " +
        ear + " ears.";

        if (coat){
            info = info + " This dog has a fur coat.";
        }else{
            info = info + " This dog has hair.";
        }

        //System.out.println(info);
        return info;
    }

    //-----------------------------------------------------------------------
    // trains dog
    //-----------------------------------------------------------------------
    public void trainDog(){
        trained = true;
    }

    //-----------------------------------------------------------------------
    // asks dog to sit
    //-----------------------------------------------------------------------
    public boolean sit(){
        if (trained){
            return true;
        }
        return false;
    }

    //-----------------------------------------------------------------------
    // asks dog to sit
    //-----------------------------------------------------------------------

    public String getColor(){
        return color;
    }

    public void changeColor(String newColor){
        this.color = newColor;
    }



}
