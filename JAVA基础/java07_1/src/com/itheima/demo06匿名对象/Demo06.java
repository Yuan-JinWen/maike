package com.itheima.demo06匿名对象;

import java.util.Random;

/*
    什么是匿名对象: 没有名字的对象

    有名对象: 类名 对象名 = new 类名();
    匿名对象: new 类名();

    区别:
        代码多少问题:
            有名对象: 代码多一点 类名 对象名 = new 类名();
            匿名对象: 代码少一点 new 类名();

        调用问题:
            有名对象可以多次调用方法
            匿名对象只能调用一次方法

    匿名对象可以减少一些代码
        1.通常使用在只调用一次方法的时候
        2.匿名对象作为参数传递
        3.匿名对象作为返回值
 */
public class Demo06 {
    public static void main(String[] args) {
        // 有名对象: 类名 对象名 = new 类名();
        Student s = new Student("凤姐", 10);
        s.study();
        s.study();

        // 匿名对象: new 类名();
        new Student("如花", 8).study();
        new Student("如花", 8).study();
        // 是2个对象

        // 1.通常使用在只调用一次方法的时候
        // 就只想产生一个随机数
        // Random ran = new Random();
        // int i = ran.nextInt();
        int i = new Random().nextInt();

        Student s2 = new Student("芙蓉姐姐", 6);
        showStudent(s2);

        //  2.匿名对象作为参数传递
        showStudent(new Student("翠花", 5));
    }

    // 3.匿名对象作为返回值
    public static Student createStudent() {
        // Student s = new Student("小红", 20);
        // return s;
        return new Student("小兰", 21);
    }

    // //  2.匿名对象作为参数传递
    public static void showStudent(Student s) {
        System.out.println("name " + s.getName());
    }
}
