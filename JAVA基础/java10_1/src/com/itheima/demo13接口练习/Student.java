package com.itheima.demo13接口练习;

public class Student extends Person implements Smokeable{

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("学生努力学习...");
    }

    public void smoking() {
        System.out.println("学生下课躲在厕所,瑟瑟发抖的抽烟...");
    }
}
