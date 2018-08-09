package com.itheima.demo02final修饰变量;

public class Student {
    // final修饰成员变量: 1.立马赋值 2.在构造方法中赋值一次
    final int age = 20;

    final int age2;

    public Student() {
        age2 = 20;
        // age2 = 20;
    }
}
