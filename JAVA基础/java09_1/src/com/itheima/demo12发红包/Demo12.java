package com.itheima.demo12发红包;

/*
    next() nextLine()
    static
 */
import java.util.ArrayList;

/*
    能够写出类的继承格式
        class 子类 extends 父类 {
        }

    能够说出继承的特点
        1.Java只支持单继承
        2.一个类可以有多个子类
        3.可以多层继承

    能够说出子类调用父类的成员特点
        就近原则: 局部变量 -> 成员变量 -> 父类成员变量

    够说出方法重写的概念
        子类中定义了一个和父类"一模一样"的方法

        子类的权限大于等于父类的权限


    能够说出this可以解决的问题
        this表示本类:
            this.成员变量名 找本类成员变量
            this.成员方法() 找本类成员方法
            this()          调用本类构造方法


    能够说出super可以解决的问题
        super表示父类:
            super.成员变量名 找父类成员变量
            super.成员方法() 找父类成员方法
            super()          调用父类构造方法

    描述抽象方法的概念
        说不清楚的方法定义为抽象方法

    写出抽象类的格式
        abstract class 类名 {
        }

    写出抽象方法的格式
        public abstract 返回值类型 方法名();

    能够说出父类抽象方法的存在意义
        保证一类一定要重写这个抽象方法

    能够完成发红包案例的代码逻辑
 */
public class Demo12 {
    public static void main(String[] args) {
        // 测试
        // 创建群主
        QunZhu qz = new QunZhu("老王吧", 100);
        qz.show();

        // 创建3个成员
        Member m1 = new Member("小王吧", 10);
        Member m2 = new Member("二王吧", 10);
        Member m3 = new Member("大王吧", 10);
        m1.show();
        m2.show();
        m3.show();

        System.out.println("------------发红包后------------");
        // 群主发红包
        ArrayList<Double> hongBao = qz.faHongBao(30, 3);
        System.out.println("222: " + hongBao);
        qz.show();

        // 成员收红包
        m1.shouHongBao(hongBao);
        m2.shouHongBao(hongBao);
        m3.shouHongBao(hongBao);

        m1.show();
        m2.show();
        m3.show();
    }
}
