package homeWork.class1;

import java.util.Random;

/**
 * 随机生成三位数，
 * 如果三位都不相等，则继续
 * 如果都相等，则记录运行次数
 */
public class CalRandom {
    int a, b, c;

    public CalRandom(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class Main {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;

        Random random = new Random();


        CalRandom calRandom = new CalRandom(a, b, c);
    }
}