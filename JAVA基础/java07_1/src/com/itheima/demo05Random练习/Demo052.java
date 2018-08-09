package com.itheima.demo05Random练习;

import java.util.Random;
import java.util.Scanner;

/*
    猜数字小游戏
    游戏开始时，会随机生成一个1-100之间的整数 number 。玩家猜测一个数字 guessNumber ，会与 number 作比
    较，系统提示大了或者小了，直到玩家猜中，游戏结束。

    分析:
        1.创建一个Random对象
        2.使用Random对象去产生一个1-100之间的随机数,number
        3.创建一个Scanner对象
        4.接收到用户猜的数字,guessNumber
        5.让程序产生的数字和用户输入的数字比较
        6.大了,提示大了
        7.小了,提示小了
        8.相等,提示猜中了...


        Random有nextInt,Scanner有nextInt这2个nextInt是不一样的
        人有吃饭,狗有吃饭
 */
public class Demo052 {
    public static void main(String[] args) {
        // 1.创建一个Random对象
        Random ran = new Random();
        // 2.使用Random对象去产生一个1-100之间的随机数,number
           int number = ran.nextInt(100) + 1; //0 ~ 99 + 1 => 1 ~ 100
           System.out.println("num = " + number);
      //  int number = ran.nextInt(100)+1;
        // 3.创建一个Scanner对象
        Scanner sc = new Scanner(System.in);

        // 不确定用户几次能猜中.所以使用while(true), 直到用户猜中了才结束
        while (true) {
            // 注意:
            // 随机不要里面,不然没猜一次,重新生成一个数.这样是很难猜中的
            // int number = ran.nextInt(100) + 1; //0 ~ 99 + 1 => 1 ~ 100
            // System.out.println("num = " + number);

            // 4.接收到用户猜的数字,guessNumber
            System.out.println("请输入您猜的数字[1, 100]:");
            int guessNumber = sc.nextInt();

            // 5.让程序产生的数字和用户输入的数字比较
            if (guessNumber > number) {
                // 6.大了,提示大了
                System.out.println("大了");
            } else if (guessNumber < number) {
                // 7.小了,提示小了
                System.out.println("小了");
            } else {
                // 8.相等,提示猜中了...
                System.out.println("恭喜您猜中了...");
                break; // 猜中了,结束循环
            }
        }

    }
}
