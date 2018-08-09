package com.itheima.demo08this和super;

import java.io.FileOutputStream;

/*
    this.成员变量名(this.color)     使用本类的成员变量
    super.成员变量名(super.color)   使用父类的成员变量

    this.成员方法()(this.eat())     访问本类成员方法
    super.成员方法()(super.eat())   访问父类类成员方法

    super(): 表示调用父类的构造方法
    this(); 表示调用本类其他构造方法

    this()和super()都只能放在构造方法第一行.
    当构造方法第一行写了this(); 默认的super()就没有了
    this()和super()但是保证至少有一个构造方法能去suer()调用父类的构造方法

 */
public class Demo08 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.test();

        // FileOutputStream fos = new FileOutputStream("");
    }
}

class Animal {
    String color = "黄色";

    public void eat() {
        System.out.println("动物吃饭");
    }

    public Animal() {
    }

    public Animal(String color) {
        this.color = color;
    }
}

class Cat extends Animal {
    String color = "绿色";

    public Cat() {
        this("蓝色");
    }

    public Cat(String color) {
        // this();
        super(color);
    }

    public void eat() {
//         this();
        System.out.println("猫吃鱼");
    }

    public void test() {
        eat();      // 猫吃鱼 访问本类成员方法
        this.eat();// 猫吃鱼 访问本类成员方法
        super.eat();// 动物吃饭 访问父类类成员方法

        System.out.println(this.color); // 本类的成员变量
        System.out.println(super.color); // 父类的成员变量

    }
}