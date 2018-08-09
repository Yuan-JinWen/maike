package com.itheima.demo03接口_抽象方法;
// 1.定义类实现接口
// Student称为实现类(子类)
//             学生类   实现      接口
public class Student implements Swimmable {
    // 2.重写抽象方法
    @Override
    public void swimming() {
        System.out.println("学生蛙泳...");
    }
}
