package com.itheima.demo03Scanner练习;

import java.util.Scanner;

/*
    键盘录入两个数据并求和(int)

    分析:
        1.创建Scanner对象
        2.使用nextInt拿到2个数据
        3.对2个数据求和
 */
public class Demo031 {
    public static void main(String[] args) {
        // 1.创建Scanner对象
        Scanner sc = new Scanner(System.in);

        // 2.使用nextInt拿到2个数据
        System.out.println("请输入第1个数:");
        int i = sc.nextInt(); // 等待输入,一直等待

        System.out.println("请输入第2个数:");
        int i1 = sc.nextInt();

        // 3.对2个数据求和
        int i2 = i + i1;
        System.out.println("总和: " + i2);
    }
}
