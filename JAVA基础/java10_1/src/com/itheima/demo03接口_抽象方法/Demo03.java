package com.itheima.demo03接口_抽象方法;

/*
    类和接口实现关系(implements),相当于类的继承关系(extends)
    class 类名 extends 父类{}

           类    实现了    接口
    class 类名 implements 接口 {

    }

    接口的使用:
        1.定义类实现接口
        2.重写抽象方法
        3.创建实现类对象
 */
public class Demo03 {
    public static void main(String[] args) {
        // 接口不能创建对象
        // Swimmable s = new Swimmable();

        // 3.创建实现类对象
        Student s = new Student();
        s.swimming();
    }
}
