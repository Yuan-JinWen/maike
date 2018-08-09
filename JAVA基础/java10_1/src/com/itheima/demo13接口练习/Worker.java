package com.itheima.demo13接口练习;

public class Worker extends Person implements Smokeable {
    public Worker() {
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    public void moveZhuan() {
        System.out.println("一边抽烟一边搬砖");
    }

    public void smoking() {
        System.out.println("一边搬砖一边抽烟");
    }
}
