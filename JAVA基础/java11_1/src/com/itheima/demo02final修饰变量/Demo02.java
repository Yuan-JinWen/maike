package com.itheima.demo02final修饰变量;

/*
    final修饰的变量只能使用一次=赋值(常量)
 */
public class Demo02 {
    public static void main(String[] args) {
        int a = 10;
        a = 20; // 可以重新赋值

        // final修饰变量,只能使用一次=赋值(常量)
        final int b = 10;
        // b = 10;
        final int c;
        c = 20;
        // c = 30;

        // final修饰引用数据类型的变量.只能使用一次赋值.里面的成员变量可以改变
        final Person p = new Person(); // 0x666
        // p = new Person(); // 0x999
        p.age = 20;
        p.age = 21;
    }
}

class Person {
    String name;
    int age;
}