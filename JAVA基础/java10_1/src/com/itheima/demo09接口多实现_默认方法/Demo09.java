package com.itheima.demo09接口多实现_默认方法;
/*
    接口多实现,接口中是默认方法:
        1.直接使用默认方法
        2.实现类重写默认方法
        3.不同接口中默认方法重名,必须重写
 */
public class Demo09 {
    public static void main(String[] args) {
        D d = new D();
        d.showA();
        d.showC();
        d.showD();
    }
}

interface A {
    public default void showA() {
        System.out.println("A showA");
    }

    public default void showD() {
        System.out.println("A showD");
    }
}

interface B {
    public default void showC() {
        System.out.println("B showC");
    }

    public default void showD() {
        System.out.println("B showD");
    }
}

class D implements A, B {
    public void showA() {
        System.out.println("D showA");
    }

    // 接口中默认方法重名了.实现类重写
    public void showD() {
        System.out.println("D类 showD");
    }
}