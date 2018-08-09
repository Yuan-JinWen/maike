package com.itheima.demo11抽象类的特点;
/*
    抽象类的特点(理解即可)

    1. 抽象类不能创建对象.因为抽象方法无法执行
    2. 抽象类中可以有构造方法,因为抽象类中可能有成员变量需要使用构造方法来赋值
    3. 抽象方法必须在抽象类中, 抽象类中可以没有抽象方法.强制让我们使用子类(极少情况)
    4. 子类必须重写抽象父类中所有的抽象方法，否则还是一个抽象类
 */

abstract class B {
    public abstract void test1();
    public abstract void test2();
}

abstract class C extends B {
    public void test1() {

    }

}

abstract class A {
    public void test2() {
        System.out.println("xx");
    }
}

public class Demo11 {
    public static void main(String[] args) {
        // Component
    }
}
