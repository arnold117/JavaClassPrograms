package classExample.chapter2;

import java.util.Scanner;

/**
 * 从键盘输入两个整数，求两数的和并输出。
 */
public class Example2_3 {
    public static void main(String[] args) {
        int sum;

        System.out.println("请从键盘输入两个整数：");
        Scanner scan=new Scanner(System.in);

        int x=scan.nextInt();
        int y=scan.nextInt();
        scan.close();

        sum=x+y;
        System.out.println("两数之和："+sum);
    }
}
