package classExample.chapter2;

/**
 * Java可以使用非ASCII字符作为变量名
 */
public class Example2_0 {
    public static void main(String[] args) {
        char 大哥大 = '我';
        int 小弟 = 26;

        System.out.printf("大哥是:%c,今年：%d", 大哥大,小弟);
    }
}
