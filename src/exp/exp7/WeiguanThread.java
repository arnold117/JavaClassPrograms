package exp.exp7;

public class WeiguanThread extends Thread{
    private int count = 0;
    @Override
    public void run() {
        while (!Global.flag){
            System.out.println("围观");
            count++;
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("共围观"+count+"次");
    }
}
