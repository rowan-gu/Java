public class Converter{

  //attributes
  static int fTemp;
  static double cTemp;


  // calculates celsius from fahrenheit
  public static void main(String[] args){

    fTemp = 73;

    cTemp = (fTemp - 32) * 5 / 9.0;

    System.out.println("The temperature in Celsius is:");
    System.out.print(cTemp + "\n");
  }
}
