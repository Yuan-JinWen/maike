package com.itheima.demo10抽象类;

/*
    抽象类的使用:
        1.定义一个类继承抽象类
        2.重写/实现抽象方法
        3.创建子类对象
 */
public class Demo10 {
    public static void main(String[] args) {
        // 抽象类不能实例化(不能创建对象)
        // 即使让我们创建抽象类对象,抽象的方法还是没法执行.所以不能创建对象
        // Employee e = new Employee();

        // 3.创建子类对象
        Manager m = new Manager();
        m.work();

        Cook c = new Cook("a001","库克", 55);
        c.work();
    }
}
