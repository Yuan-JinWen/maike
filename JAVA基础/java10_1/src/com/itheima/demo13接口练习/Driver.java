package com.itheima.demo13接口练习;

public class Driver extends Person implements Swimmable {

    public Driver() {
    }

    public Driver(String name, int age) {
        super(name, age);
    }

    public void drive() {
        System.out.println("一边游泳一边开车...");
    }

    public void swimming() {
        System.out.println("老司机一边开车一边游泳...");
    }
}
