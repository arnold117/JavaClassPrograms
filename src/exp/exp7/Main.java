package exp.exp7;

public class Main {
    public static void main(String[] args) {
        RandThread randThread = new RandThread();
        WeiguanThread weiguanThread = new WeiguanThread();

        randThread.start();
        weiguanThread.start();
    }
}
