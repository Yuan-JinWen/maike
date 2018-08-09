package com.itheima.demo17instanceof关键字;

/*

    instanceof: 判断一个变量是否是某个类型
    instanceof格式: boolean 变量名 = 对象名 instanceof 类名;
                    如果对象是对应的类型.返回true,否则返回false

    向下转型很危险:在向下转型之前使用instanceof类型的判断
    instanceof注意:没有继承关系的类不能拿来判断
 */
public class Demo17 {
    public static void main(String[] args) {
        // 向上转型/多态
        // Person p = new Student();
        Person p = new Teacher();
        p.eat();

        System.out.println("-------");
         // boolean b = p instanceof Dog; // 没有继承关系的类不能拿来判断
//         boolean b = p instanceof Teacher;
        // System.out.println(b);

        // 向下转型成学生
        if (p instanceof Student) {
           Student s = (Student)p; // ClassCastException:类型转换异常
           s.eat(); // 学生吃饭
           s.study(); // 学生努力学习...
        } else {
            System.out.println("p 不是学生类型");
        }
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

class Dog {
}