package com.itheima.demo03类的定义和使用;

import java.util.ArrayList;

/*
重要的概念:
    类:java中的类就是用来描述现实生活中的一类事物(抽象的描述)(iPhone图纸)
    对象:对象是类产生的一个具体事物(具体的)(32G的土豪金价值6666元)(张三,18岁,身高1.66,体重120KG,黑黝黝,女)


    是事物的抽象描述(相当于图纸)
    根据类来创建一个对象,只有对象才能帮我们干活
    怎么根据一个类创建一个对象呢?
    创建对象的格式(一定要记住):
        类名 对象名 = new 类名();
        使用成员变量:
            获取值: 对象名.成员变量 (s.name)
            设置值: 对象名.成员变量名 = 值; (s.name = "张三")将"张三"赋值给s对象的name成员变量

        使用成员方法:
            对象名.方法名(参数);

    面向对象的使用步骤:
        1.使用类去描述一个事物
        2.根据类创建对象
        3.访问对象的成员变量
        4.访问对象的成员方法

        面向对象.谁的.
 */
public class Demo03 {

    public static void main(String[] args) {
        // 类名 对象名 = new 类名();
        Student s = new Student(); // new 出来的就是一个具体的对象
        // 使用成员变量
        System.out.println(s.name + " " + s.age);
		// 为成员变量赋值
        s.name = "张三";
        s.age = 18;
		//输出成员变量
        System.out.println(s.name + " " + s.age);

        // 使用成员方法
        s.eat();
        s.sleep();
        ArrayList arr = new ArrayList();
        arr.contains("aaa");

    }
}
