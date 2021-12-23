package exp.exp7;

import exp.exp5.GenRand;

public class RandThread extends Thread{

    @Override
    public void run() {
        GenRand genRand = new GenRand();

        while ((!genRand.isConsecutive()) && (!genRand.isSame())) {
            genRand.init();
             System.out.println(genRand.getRandNum());
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Global.flag = true;
        int count = genRand.getCountLoop();
        int randNum = genRand.getRandNum();

        System.out.println("To get " + randNum + ", the loop goes " + count + " times.");
    }
}
