package com.itheima.demo05Random练习;

import java.util.Random;

/*
    获取1-n之间的随机数，包含n

    分析:
        1.创建一个Random对象
        2.使用nextInt(n),产生一个随机数[0, n) : 0 ~ n-1
        3.在生成的这个随机数基础上加1,nextInt(n) + 1, 当nextInt(n)随机到0会+1会变成 1
                                                      当nextInt(n)随机到n-1 + 1, 会变成n
 */
public class Demo051 {
    public static void main(String[] args) {
        Random ran = new Random();   // Random ran = new Random;
        int n = 10;
        // int i = ran.nextInt(n + 1); // 0 ~ 10
        // 0 ~ 9 + 1
        for (int j = 0; j < 20; j++) {
            int i = ran.nextInt(10) + 1;
            System.out.println("随机数: " + i);
        }
    }
}
