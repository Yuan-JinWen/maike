package com.itheima.demo03Scanner练习;

import java.util.Scanner;

/*
    键盘录入三个数据并获取最大值 代码如下：

    分析:
        1.创建Scanner对象,用于键盘录入
        2.调用nextInt拿到输入的3个数
        3.使用三元运算符求前面2个数的较大值
        4.拿到前面2个数的较大值和第3个数比较拿到最大的值
 */
public class Demo032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第1个数:");
        int i1 = sc.nextInt();

        System.out.println("请输入第2个数:");
        int i2 = sc.nextInt();

        System.out.println("请i输入第3个数:");
        int i3 = sc.nextInt();

        // 3.使用三元运算符求前面2个数的较大值
        int temp = i1 > i2 ? i1 : i2;

        // 4.拿到前面2个数的较大值和第3个数比较拿到最大的值
        int max = temp > i3 ? temp : i3;

        System.out.println("最大值: " + max);
    }
}
