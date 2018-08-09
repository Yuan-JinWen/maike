package com.itheima.demo01final修饰类和方法;

/*
    final: 表示最终的,不可变的
    final可以修饰:
        1.类
        2.方法
        3.变量
 */
// 1.final修饰的类不能被继承.不能有子类(太监)
final class Fu {}
// class Zi extends Fu {}

// 2.final修饰方法,方法不能被重写(子类可以用)
class Fu2 {
    public void show1() {
        System.out.println("Fu2 show1");
    }

    public final void show2() {
        System.out.println("Fu2 show2");
    }
}

class Zi2 extends Fu2 {
    // final修饰方法,方法不能被重写
    // public void show2() {
    //     System.out.println("Zi2 show2");
    // }
}


public class Demo01 {
    public static void main(String[] args) {
        // String
        Zi2 z = new Zi2();
        z.show2();
    }
}
