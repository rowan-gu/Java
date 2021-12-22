/*
    * MathClass.java
    * @description Tinkering with the Math class in java
    * @author Rowan Guduru
    * @version 1.0, 9/20/2021
*/
import static java.lang.Math.*;

public class MathClass{
    //attributes

    //methods

    //-------------------------------
    // Constructor
    //-------------------------------
    public MathClass(){

    }

    //-------------------------------
    // Determine if three sides form a right triangle
    //-------------------------------
    public boolean rightTriangleTest(double side1, double side2, double side3){

        double longest, leg1, leg2;

        //assign the longest leg to the variable longest
        if (side1 < side2){
            if(side3<side2){
                //side2 is the biggest
                longest = side2;
                leg1 = side1;
                leg2 = side3;
            }else{
                longest = side3;
                leg1 = side1;
                leg2 = side2;
            }
        }else{
            if(side3<side1){
                longest = side1;
                leg1 = side3;
                leg2 = side2;
            }else{
                longest = side3;
                leg1 = side1;
                leg2 = side2;
            }

        }



        // evaluating if this is a right triangle
        if (side1 > side2 && side1 > side3){
            double hypo = Math.pow(side1, 2);
            hypo = Math.round(hypo * 100.0) / 100.0;

            double legs = Math.pow(leg1, 2) + Math.pow(leg2, 2);
            legs = Math.round(legs * 100.0) / 100.0;

            if (Math.pow(longest, 2) == Math.pow(leg1, 2) + Math.pow(leg2, 2)){
                return true;
            }else{
                return false;
            }

            //Thoughts:
            // Math.round() rounds to an integer
            // doubles are precise to some number of significant figures...
            // how will we resolve this issue?



        } //end of if statement
        return true;
    }//end of boolean method

}
