package com.itheima.demo01继承概述;

public class Demo01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "凤姐";
        System.out.println(s.name);
        s.eat();

        Worker w = new Worker();
        w.name = "王健林";
        System.out.println(w.name);
        w.sleep();
    }
}


/*
    extends: 表示继承
    继承的格式:
        class 子类名 extends 父类名 {

        }

    继承的好处:
        1.提高代码的复用性  ***
        2.为多态提供前提

    is...a: 子类是父类的一种
 */
// 父类
class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

//     学生类  继承     人类
class Student extends Person {
}
//calss Student extends Person{}
//      老师    继承    人类
class Teacher extends Person {
}

//     工人    继承    人类
class Worker extends Person {
}

/*
1. 学生类
    属性:姓名,年龄
    行为:吃饭,睡觉
2. 老师类
    属性:姓名,年龄
    行为:吃饭,睡觉
3. 工人
    属性:姓名,年龄
    行为:吃饭,睡觉
 */
/*class Student {
    // 属性:姓名,年龄
    String name;
    int age;

    // 行为:吃饭,睡觉
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

class Teacher {
    String name;
    int age;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

class Worker {
    String name;
    int age;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}*/

/*
    我们发现以上的3个类使用重复的代码.每次都写一遍和麻烦,如果以后还要写司机,警察,小偷,运动员.又要写重复的
    这是很麻烦的.太重复了.在Java中提供了继承,帮助我们避免写这么多重复的代码
    Java中的继承:在现有类的基础上定义一个新的类,现有类称为父类,新的类称为子类,子类会自动拥有父类的可继承的内容
 */