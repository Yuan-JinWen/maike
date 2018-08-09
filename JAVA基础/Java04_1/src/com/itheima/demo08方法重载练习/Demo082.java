package com.itheima.demo08方法重载练习;

// ctrl + r: 表示要替换
public class Demo082 {

    public static void open(){}
    public static void open(int a){}
    static void open(int a,int b){}
    public static void open(double a,int b){}
    public static void open(int a,double b){}
//    public void open(int i,double d){} // 不是重载,参数列表和上一个相同了都是int, double
//    public static void OPEN(){} // 不是重载,方法名不一样
//    public static void open(int i,int j){} // 不是重载,参数列表和上面相同了都是int, int
}
