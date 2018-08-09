package com.itheima.demo03访问修饰符01;

public class Other {
    public void test03() {
        // 对象调用方法
        Fu f = new Fu();
        f.publicMethod();
        f.protectedMethod();
        f.defaultMethod();
        // f.privateMethod();
    }
}
