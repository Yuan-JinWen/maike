package com.itheima.demo03访问修饰符02;

import com.itheima.demo03访问修饰符01.Fu;

public class Other2 {
    public void test05() {
        Fu f = new Fu();

        f.publicMethod();
        // f.protectedMethod();
        // f.defaultMethod();
        // f.privateMethod();
    }
}
