package com.itheima.demo02继承案例;

public class Demo02 {
    public static void main(String[] args) {
        // 创建程序员
        Coder c = new Coder();
        c.name = "马化腾";
        c.age = 45;
        c.eat();
        c.sleep();
        c.coding();

        // 创建老师
        Teacher t = new Teacher();
        t.name = "苍老师";
        t.age = 28;
        t.eat();
        t.sleep();
        t.teach();
    }
}
