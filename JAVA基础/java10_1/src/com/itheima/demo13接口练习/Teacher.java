package com.itheima.demo13接口练习;

public class Teacher extends Person implements Swimmable {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("老师唾沫横飞的上课...");
    }

    public void swimming() {
        System.out.println("老师狗刨式游泳");
    }
}
