package com.itheima.demo10抽象类;

// 1.定义一个类继承抽象类
public class Manager extends Employee {
    // 2.重写/实现抽象方法
    public void work() {
        System.out.println("经理管理其他人...");
    }
}
