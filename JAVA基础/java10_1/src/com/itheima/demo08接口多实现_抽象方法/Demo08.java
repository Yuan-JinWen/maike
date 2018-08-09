package com.itheima.demo08接口多实现_抽象方法;

/*
    类只能单继承

    一个类可以实现多个接口
        实现类需要实现接口中的所有抽象方法
        抽象方法重名,实现一次即可
 */
public class Demo08 {
    public static void main(String[] args) {
        D d = new D();
        d.showA();
        d.showC();
        d.showD();
    }
}

interface A {
    public abstract void showA();
    public abstract void showD();
}

interface B {
    public abstract void showC();
    public abstract void showD();
}
// 一个类同时实现2个接口,实现类需要实现接口中的所有抽象方法
class D implements A, B {
    public void showA() {
        System.out.println("showA");
    }

    public void showC() {
        System.out.println("showC");
    }
    // 抽象方法重名,实现一次即可
    public void showD() {
        System.out.println("showD");
    }
}