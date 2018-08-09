package com.itheima.demo07String类的练习;

import java.util.Scanner;

/*
    键盘录入一个字符串，统计字符串中大小写字母及数字字符个数
    "fdGJDRW743hgYJ"
    分析:
        1.使用Scanner录入一个字符串
        2.定义3个变量,分别用于保存大写字母,小写字母,数字字符的个数
        3.遍历字符串获取到每个字符进行判断
        4.如果是小写字母,小写字母数量+1
        5.如果是大写字母,大写字母数量+1
        6.如果是数字字符,数字字符数量+1
 */
public class Demo07 {
    public static void main(String[] args) {
        // 1.使用Scanner录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        // 2.定义3个变量,分别用于保存大写字母,小写字母,数字字符的个数
        int bigCount = 0; // 大写字母个数
        int smallCount = 0; // 小写字母个数
        int numberCount = 0; // 数字字符个数

        // 3.遍历字符串获取到每个字符进行判断
        for (int i = 0; i < str.length(); i++) {
            // 取出每个字符
            char c = str.charAt(i);

            // 4.如果是小写字母,小写字母数量+1
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                // 5.如果是大写字母,大写字母数量+1
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                // 6.如果是数字字符,数字字符数量+1
                numberCount++;
            }
        }

        System.out.println("小写字母: " + smallCount);
        System.out.println("大写字母: " + bigCount);
        System.out.println("数字字符: " + numberCount);
    }
}
