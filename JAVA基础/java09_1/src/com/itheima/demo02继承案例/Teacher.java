package com.itheima.demo02继承案例;

public class Teacher extends Person {
    // 子类特有的内容
    public void teach() {
        System.out.println(name + "在上课");
    }
}
