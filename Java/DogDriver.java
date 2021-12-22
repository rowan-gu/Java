/*
    * Dog.java
    * @description Defines a Dog class
    * @version 1.0, 2021-09-08
*/

public class DogDriver{

    static Dog jimmy;

    public static void main(String[] args) {
        jimmy = new Dog("Black", "Pomeranian", "floppy", "Blue", 3, true, false);

        jimmy.getInfo();

        System.out.println(jimmy.sit()); //before training

        jimmy.trainDog();

        System.out.println(jimmy.sit()); //after training

        jimmy.changeColor("orange")

        System.out.println(jimmy.getColor())
    }
}
