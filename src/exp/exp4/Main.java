package exp.exp4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double limDown, limUp, step;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter lower and upper limits:");
        limDown = scanner.nextDouble();
        limUp = scanner.nextDouble();
        step = (limDown + limUp) / 1000;
        Rect rect = new Rect();
        Lad lad = new Lad();

        System.out.println("Rect: " + rect.calIntegral(limDown, limUp, step) + ", Lad: " + lad.calIntegral(limDown, limUp, step));
    }
}
