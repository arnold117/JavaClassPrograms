package classExample.chapter5.e5_15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntSum {
    private int intA, intB, sum;

    public void calSum(){
        this.sum = this.intA + this.intB;
    }

    public int getSum() {
        return sum;
    }

    public IntSum(int intA, int intB) {
        this.intA = intA;
        this.intB = intB;
        this.calSum();
    }
}

class Main {
    public static void main(String[] args) {
        int intA = 0, intB = 0;

        try{
            System.out.println("Please enter 2 integers:");
            Scanner scanner = new Scanner(System.in);
            intA = scanner.nextInt();
            intB = scanner.nextInt();
        }catch (InputMismatchException e){
            String msg = "NON-INTEGER DETECTED!";
            System.out.println(msg);
            System.exit(1);
        }

        IntSum intSum = new IntSum(intA, intB);
        System.out.println(intSum.getSum());
    }
}
