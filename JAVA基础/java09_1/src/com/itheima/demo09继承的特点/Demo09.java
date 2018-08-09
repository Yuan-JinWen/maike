package com.itheima.demo09继承的特点;

// 一个类没有写父类其实是继承Object类.所有的类直接或间接的继承Object类
// Object是所有类的超类
class A1 extends Object {}
class A2 {}

class B extends A1 {}
// Java类只支持单继承(一个类只能有一个父类)
// class C1 extends A1, A2 {}

// 一个类可以有多个子类
class C2 extends A1 {}
class C3 extends A1 {}

// Java支持多层继承(父类和子类是相对的概念)
class D extends B {}

public class Demo09 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.toString();
    }
}
