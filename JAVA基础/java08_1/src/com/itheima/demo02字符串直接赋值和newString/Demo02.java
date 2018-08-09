package com.itheima.demo02字符串直接赋值和newString;

/*
    ==:
        1.基本数据类型,判断的是这2个值是否相等
        2.引用数据类型,判断的是对象的地址
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(1 == 3);

        // 直接赋值字符串
        String str1 = "abc";// 字符串
        String str2 = "abc";
        // 构造方法创建字符串
        String str3 = new String("abc");
        // 创建对象 new 的是地址值

        System.out.println("str1 == str2: " + (str1 == str2)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str2 == str3: " + (str2 == str3)); // false

        String str4 = str1 + "def";

    }
}
