package com.itheima.demo10static修饰方法;

/*
    public static 返回值类型 方法名(参数列表) {
        // 方法体;
        return 结果;
    }
 */
public class Person {
    int num1 = 10;
    static int num2 = 20;

    /*
        同一个类中
        静态方法:可以使用静态成员变量,静态方法
        静态可以使用静态
     */
    public static void test01() {
        // System.out.println(num1); // 不能使用非静态的成员变量
        System.out.println(num2); // 能使用静态的成员变量
        // test04(); // 不能使用非静态方法
        test02(); // 能使用静态方法
    }

    public static void test02() {

    }

    /*
        同一个类中
        非静态方法:能静态成员变量,静态方法,还能使用非静态成员变量和非静态成员方法
     */
    public void test03() {
        System.out.println(num1); // 能使用非静态的成员变量
        System.out.println(num2); // 能使用静态的成员变量
        test04(); // 能使用非静态方法
        test02(); // 能使用静态方法
    }

    public void test04() {

    }
}
