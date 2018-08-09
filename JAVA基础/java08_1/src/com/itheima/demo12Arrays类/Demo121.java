package com.itheima.demo12Arrays类;

import java.util.Arrays;

/*
    "ysKUreaytWTRHsgFdSAoidq"
    请使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。

    分析:
        1.通过查询API没有对字符串进行排序的.
        2.但是有对char[]进行排序的
        3.将字符串转成char[].再用char[]排序
 */
public class Demo121 {
    public static void main(String[] args) {
        String str = "ysKUreaytWTRHsgFdSAoidq";

        // 1.将字符串转成char[]
        char[] chs = str.toCharArray();

        // 2.再用char[]排序
        Arrays.sort(chs); // 按ASCII码值排序的
        // Arrays.sort()

        // 正向打印: A F H K R S T U W a d d e g i o q r s s t y y
        for (int i = 0; i < chs.length; i++) {
            char ch = chs[i];
            System.out.print(ch + " ");
        }

        System.out.println();

        // 3.倒序打印char[]: y y t s s r q o i g e d d a W U T S R K H F A
        for (int i = chs.length - 1; i >= 0; i--) {
            char ch = chs[i];
            System.out.print(ch + " ");
        }
    }
}
