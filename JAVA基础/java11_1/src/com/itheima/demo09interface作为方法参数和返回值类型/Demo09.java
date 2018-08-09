package com.itheima.demo09interface作为方法参数和返回值类型;

import com.itheima.demo08class作为成员变量.Weapon;

// 抽烟接口
/*
    类和接口作为参数和返回值.传递的都是对象
 */
interface Smokeable {
    public abstract void smoking();
}

class Teacher implements Smokeable {
    public void smoking() {
        // 红梅4.5/红塔山7.5,赣州桥(1.5/2)
        System.out.println("老师抽赣州桥...");
    }
}

class Student implements Smokeable {
    public void smoking() {
        System.out.println("学生抽九五之尊");
    }
}

class Worker implements Smokeable {
    public void smoking() {
        System.out.println("工人抽天安门...");
    }
}

public class Demo09 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();

        goSmoking(t);
        goSmoking(s);

        System.out.println("------------");
        System.out.println(getSmokeObject());
    }

    // 模拟获取会抽烟的人
    // 方法的返回值是接口类型,返回的是接口的实现类对象
    public static Smokeable getSmokeObject() {
        // Smokeable ss = new Smokeable();
        // Student s = new Student(); // 接口的实现类对象
        Worker s = new Worker(); // 接口的实现类对象
        return s;
    }

    // 模拟请人去抽烟             // 方法参数是接口需要给实现类对象
    //                            Smokeable s = t; Smokeable s = new Teacher();
    public static void goSmoking(Smokeable s) {
        s.smoking();
    }
}
