/*
//------------------------------------------------------#Sum Calculator Implementation#---------------------------------------------------//

Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double. Write the following methods (instance methods):
1. Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
2. Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
3. Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
4. Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
5. Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and      secondNumber.
6. Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
7. Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
8. Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.

 */

package Section_7;

public class P05_Coding_Challenge30 {
    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    public double getAdditionResult () {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult () {
        return firstNumber - secondNumber;
    }
    
    public double getMultiplicationResult () {
        return firstNumber * secondNumber;
    }
    
    public double getDivisionResult () {
        if (secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    
    }
}
