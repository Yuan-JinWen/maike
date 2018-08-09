package com.itheima.demo10接口多实现_静态方法;
/*
    接口多实现_静态方法:
        使用接口名调用静态方法
        静态方法名相同也没事,都用接口名调用
 */
public class Demo10 {
    public static void main(String[] args) {
//        D d = new D();
//        d

        A.showA();
        A.showB();
        B.showC();
        B.showB();
    }
}

interface A {
    public static void showA() {
        System.out.println("A showA");
    }

    public static void showB() {
        System.out.println("A showB");
    }
}

interface B {
    public static void showC() {
        System.out.println("B showC");
    }

    public static void showB() {
        System.out.println("A showB");
    }
}

class D implements A, B {

}