package com.itheima.demo08方法重载练习;

/*
    模拟输出语句中的 println 方法效果，传递什么类型的数据就输出什么类型的数据，只允许定义一个方法名
myPrintln 。
 */
public class Demo083 {
    public static void main(String[] args) {
        // ctrl + 点击鼠标左键,就可以进入Java写的源代码
        // System.out.println(1);
        // System.out.println('a');
        // System.out.println("sss");
        // System.out.println(3.14);
		System.out.println();

        byte b = 20;
        myPrintln(b);

        int i = 30;
        myPrintln(i);

        double d = 3.14;
        myPrintln(d);
    }

    public static void myPrintln(byte b) {
        System.out.println(b);
    }

    public static void myPrintln(short s) {
        System.out.println(s);
    }

    public static void myPrintln(int i) {
        System.out.println(i);
    }

    public static void myPrintln(long l) {
        System.out.println(l);
    }

    public static void myPrintln(double d) {
        System.out.println(d);
    }
}
