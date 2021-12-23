package exp.exp6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter pass word:");
        String pw = scanner.nextLine();
        Pass pass = new Pass(pw);
        String str = "This is a " + pass.getDegree() + " password.";
        System.out.println(str);
    }
}
