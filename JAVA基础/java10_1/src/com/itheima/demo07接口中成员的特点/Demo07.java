package com.itheima.demo07接口中成员的特点;

public class Demo07 {
}

// 接口中的方法默认添加public abstract
// pubic static final
// 接口中没有构造方法.因为没有成员变量需要赋值
interface Somkeable {
    // num2称为常量
    public static final int num2 = 10;
    // 接口中的变量默认添加pubic static final
    // int num = 20; -> pubic static final int num = 20;
    int num = 20;


    public abstract void show1();

    // 接口中的方法默认添加public abstract
    // void show2(); -> 添加成 public abstract void show2();
    void show2();
}
