package com.itheima.demo11方法优先级;
/*
    当父类中方法和接口中默认方法重名使用父类的(就近原则)
 */
public class Demo11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}

class Person {
    public void show() {
        System.out.println("我秀我自豪...");
    }
}

interface Swimmable {
    public default void show() {
        System.out.println("接口中 秀一秀");
    }
}

class Student extends Person implements  Swimmable {

}