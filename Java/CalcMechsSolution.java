/**
  * CalcMechSolution.java
  *
  * @version 1 2021-01-23
  * @authorship CS212
  * @description The mechanics behind the calculator
*/

import javax.swing.*;

public class CalcMechsSolution{

  // Attributes (memory)
  private Integer memory, afterEquals;
  private String operation;

  //------------------------------------------------------------------
  // Constructor method: creates an MiniCalcMechs object
  //------------------------------------------------------------------
  public CalcMechsSolution(){

      memory = 0;
      operation = "+";
  }

  //------------------------------------------------------------------
  // clears memory
  //------------------------------------------------------------------
  public void clear(){

        operation = "+";
        memory = 0;
  }

  //------------------------------------------------------------------
  // sums the two numbers and resets memory
  //------------------------------------------------------------------
  public String equalResult(String enteredValue){

        if (enteredValue.equals("")){
          return Integer.toString(memory);
        }

        //sum
        if (operation.equals("+"))
          afterEquals = memory + Integer.valueOf(enteredValue);

        //difference
        else if(operation.equals("\u2212"))
            afterEquals = memory - Integer.valueOf(enteredValue);

        //multiply
        else if(operation.equals("\u00D7"))
            afterEquals = memory * Integer.valueOf(enteredValue);

        //divide
        else if(operation.equals("\u00F7"))
            afterEquals = memory / Integer.valueOf(enteredValue);

        operation = "+";
        memory = 0;

    return Integer.toString(afterEquals);

  }

  //------------------------------------------------------------------
  // sums two numbers and maintains memory
  //------------------------------------------------------------------
  public String computation(String number, String symbol){

    //sum
    if (number.equals("")){

        return Integer.toString(memory);

    }else{

      switch(operation){
          case "+":
              memory += Integer.valueOf(number);
              break;
          case "\u2212":
              //multipleOperations = true;
              memory -= Integer.valueOf(number);
              break;
          case "\u00D7":
              //multipleOperations = true;
              memory *= Integer.valueOf(number);
              break;
          default:
              //multipleOperations = true;
              memory /= Integer.valueOf(number);
              break;
        }
    }

    //get operation
    operation = symbol;


    return Integer.toString(memory);

  }

}
