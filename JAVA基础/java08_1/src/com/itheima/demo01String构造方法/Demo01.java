package com.itheima.demo01String构造方法;

/*
    API中查出的类都是Java提供好的.直接拿来用.都是引用数据类型

    String类:软件包  java.lang (java.lang 可以不用导包)
    String类代表字符串。 Java程序中的所有字符串文字（例如"abc" ）都被实现为此类的实例,字符串不变; 它们的值在创建后不能被更改

    String类的构造方法:
        1.String() 创建一个空的字符串对象
        2.String(String original) 根据字符串来创建一个字符串对象
        3.String(char[] value) 通过字符数组来创建字符串对象
        4.String(byte[] bytes) 通过字节数组来构造新的字符串对象
        5.String(byte[] bytes, int offset, int length) 通过字节数组一部分来构造新的字符串对象
 */
public class Demo01 {
    public static void main(String[] args) {
        // 1.String() 创建一个空的字符串对象
        String str1 = new String();
        System.out.println("str1: " + str1); // str1:  相当于你买了一个水杯.水杯中没有装水(空水杯),空字符串

        // 2.String(String original) 根据字符串来创建一个字符串对象
        String str2 = new String("abc");
        System.out.println("str2: " + str2); // str2: abc

        // 3.String(char[] value) 通过字符数组来创建字符串对象
        char[] value = {'h', 'e', 'l', 'l', 'o'};
        // char[] value = {'H','e','l','l','o'};
        String str3 = new String(value);
       // String ste3 = new String(value);
        System.out.println("str3: " + str3); // str3: hello

        // 4.String(byte[] bytes) 通过字节数组来构造新的字符串对象
        byte[] bytes = {97, 98, 99, 100, 101, 102};
        String str4 = new String(bytes); // 将数字取ASCII码表中找到对应的字符,再拼成一个串
        System.out.println("str4: " + str4); // str4: abcdef

        // 这个构造方法可能用的多一点.IO流读取文件的时候
        // 5.String(byte[] bytes, int offset, int length) 通过字节数组一部分来构造新的字符串对象
        // offset:偏移值, 从哪里开始
        // int length:长度
        String str5 = new String(bytes, 2, 3); // 99, 100, 101
        System.out.println("str5: " + str5);

        // 最常用的,直接赋值字符串
        String str6 = "hello";
        System.out.println("str6: " + str6);
    }
}
