package exp.exp5;

public class Main {
    public static void main(String[] args) {
        GenRand consecutive = new GenRand();

        while (!consecutive.isConsecutive()) {
            consecutive.init();
        }
        System.out.println("To get " + consecutive.getRandNum() + ", the loop goes " + consecutive.getCountLoop() + " times.");

        GenRand same = new GenRand();

        while (!same.isSame()) {
            same.init();
        }
        System.out.println("To get " + same.getRandNum() + ", the loop goes " + same.getCountLoop() + " times.");
    }
}
