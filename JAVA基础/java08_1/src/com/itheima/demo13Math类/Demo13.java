package com.itheima.demo13Math类;
/*
Math类的作用:
    Math包含执行基本数字运算的方法，如基本指数，对数，平方根和三角函数。

没有构造方法.方法全是静态的

使用类型去调用静态方法
 */
public class Demo13 {
    public static void main(String[] args) {
        // static int abs​(int a) 返回一个 int绝对值
        System.out.println(Math.abs(5)); // 5
        System.out.println(Math.abs(-5)); // 5

        System.out.println("-------------");
        // static double ceil​(double a) 向上取整(天花板)
        System.out.println(Math.ceil(5.1)); // 6.0
        System.out.println(Math.ceil(5.9)); // 6.0
        System.out.println(Math.ceil(-5.1)); // -5.0
        System.out.println(Math.ceil(-5.9)); // -5.0

        System.out.println("-------------");
        // static double floor​(double a) 向下取整(地板)
        System.out.println(Math.floor(5.1)); // 5.0
        System.out.println(Math.floor(5.9)); // 5.0
        System.out.println(Math.floor(-5.1)); // -6.0
        System.out.println(Math.floor(-5.9)); // -6.0

        // static double pow​(double a, double b) a的b次幂
        //
        //                      byte(8): -128~127
        System.out.println(Math.pow(2, 7));
        // static long round​(double a) 返回最接近 long的参数，其中 long四舍五入为正无穷大。
        // 四舍五入和符号美观
        System.out.println(Math.round(5.4)); // 5
        System.out.println(Math.round(5.6)); // 6
        System.out.println(Math.round(-5.4)); // -5
        System.out.println(Math.round(-5.6)); // -6
    }
}
