package exp.exp2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleDiv {
    private double aDouble, bDouble, div;

    public double getDiv() {
        return div;
    }

    public void calDiv() {
        try{
            if (this.bDouble == 0.0) {
                throw new ArithmeticException("ArithmeticException detected: divided by zero!");
            }
            this.div = this.aDouble/this.bDouble;
        } catch (ArithmeticException arithmeticException) {
//            String msg = "ArithmeticException detected: divided by zero!";
//            System.out.println(msg);
            System.out.println(arithmeticException);
            System.exit(1);
        }
    }

    public DoubleDiv(double aDouble, double bDouble) {
        this.aDouble = aDouble;
        this.bDouble = bDouble;
        this.calDiv();
    }
}

class Main {
    public static void main(String[] args) {
        double aDouble = 0.0, bDouble = 0.0;

        try{
            System.out.println("Please enter 2 doubles for division:");
            Scanner scanner = new Scanner(System.in);
            aDouble = scanner.nextDouble();
            bDouble = scanner.nextDouble();
        }catch (InputMismatchException e){
            String msg = "InputMismatchException detected: you are not entering doubles!";
            System.out.println(msg);
            System.exit(1);
        }

        DoubleDiv doubleDiv = new DoubleDiv(aDouble, bDouble);
        System.out.println(doubleDiv.getDiv());
    }
}
