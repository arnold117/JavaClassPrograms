package classExample.chapter2;

public class Example2_2 {
    public static void main(String[] args) {
        byte a=120;
        short b=130;
        int c=2200;
        long d=8000;
        float f;
        double g=0.1234567812345678;

        a=(byte)b;    //导致精度的损失
        c=(int)d;     //未导致精度的损失
        f=(float)g;   //导致精度的损失

        System.out.println("a="+a);
        System.out.println("c="+c);
        System.out.println("f="+f);
        System.out.println("g="+g);
    }
}
