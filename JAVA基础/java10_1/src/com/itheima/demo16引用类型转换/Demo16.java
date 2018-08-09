package com.itheima.demo16引用类型转换;

/*
    基本数据类型转换:
        1.自动转换:范围小的自动转成范围大的
        2.强制转换:范围大的转成范围小的: 目标类型 变量名 = (目标类型)值;

    引用数据类型转换:
        1.向上转型:范围小的赋值范围大的
            子类转成父类
            多态就是向上转型
            Person p = new Student();

        2.向下转型:范围大的赋值给范围小的
            父类转成子类
            目标类型 变量名 = (目标类型)值;
            子类类型 变量名 = (子类类型)变量;

    向下转型好处:可以使用子类的特有功能

    注意:
        向下转型不能随便乱转,只有变量new的时候是什么类型,才能转成什么类型
 */
public class Demo16 {
    public static void main(String[] args) {
        // 向上转型/多态
        Person p = new Student();
        // Person p = new Teacher();
        p.eat();

        System.out.println("-------");
        // 向下转型成学生
        Student s = (Student)p; // ClassCastException:类型转换异常
        s.eat(); // 学生吃饭
        s.study(); // 学生努力学习...
    }
}

class Person {
    public void eat() {
        System.out.println("人吃饭");
    }
}

class Student extends Person {
    public void eat() {
        System.out.println("学生吃饭");
    }

    public void study() {
        System.out.println("学生努力学习...");
    }
}

class Teacher extends Person {
    public void eat() {
        System.out.println("老师吃饭");
    }

    public void study() {
        System.out.println("学生努力备课...");
    }
}