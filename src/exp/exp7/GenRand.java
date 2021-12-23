package exp.exp7;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenRand {
    private int randNum;
    private int countLoop;
    private boolean isConsecutive;
    private boolean isSame;

    private void genRand() {
        Random random = new Random();
        randNum = random.nextInt(100,1000);
    }

    private void isConsecutive(int randNum) {
        Pattern pattern = Pattern.compile("(0(?=1)|1(?=2)|2(?=3)|3(?=4)|4(?=5)|5(?=6)|6(?=7)|7(?=8)|8(?=9)){2}\\d");
        Matcher matcher = pattern.matcher(Integer.toString(randNum));
        this.isConsecutive = matcher.matches();
    }

    private void isSame(int randNum) {
        Pattern pattern = Pattern.compile("([\\d])\\1{2}");
        Matcher matcher = pattern.matcher(Integer.toString(randNum));
        this.isSame = matcher.matches();
    }

    public GenRand() {
        countLoop = -1;
        init();
    }

    public void init() {
        genRand();
        isConsecutive(randNum);
        isSame(randNum);
        countLoop++;
    }

    public int getRandNum() {
        return randNum;
    }

    public int getCountLoop() {
        return countLoop;
    }

    public void setCountLoop(int countLoop) {
        this.countLoop = countLoop;
    }

    public boolean isConsecutive() {
        return isConsecutive;
    }

    public boolean isSame() {
        return isSame;
    }
}
