/*
*/

public class DataTypeTest{

    // attributes
    int five;
    double e;
    float pi;
    long astronomical;
    byte small;
    char letter;
    short shortNumber;
    boolean sampleBoolean;

    public DataTypeTest(){
        five = 5;
        int seven = 7; //declaration and assignment are
        e = 2.71;
        pi = 3.14F;
        astronomical = 50000000000000L;
        small = 2;
        letter = 'A';
        shortNumber = 32767;
        sampleBoolean = five < seven;
    }

    public void printStuff(){
        System.out.println(five);
        System.out.println(e);
        System.out.println(pi);
        System.out.println(astronomical);
        System.out.println(small);
        System.out.println(letter);
        System.out.println(shortNumber);
        System.out.println(sampleBoolean);
    }
}
