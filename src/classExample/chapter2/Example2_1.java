package classExample.chapter2;

/**
 * 显示一些字符在Unicode表中的位置，以及某些位置上的字符。
 */
public class Example2_1 {
    public static void main(String[] args) {
        char c='α';

        System.out.println("字母"+c+"在unicode表中的顺序位置:" +(int)c);
        System.out.println("字母表：");
        for(int i=(int)c; i<c+25; i++){
            System.out.print(" "+(char)i);
        }
    }
}
