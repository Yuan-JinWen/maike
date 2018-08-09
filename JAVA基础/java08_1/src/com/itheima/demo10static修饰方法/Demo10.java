package com.itheima.demo10static修饰方法;

/*
    静态修饰方法
    public static 返回值类型 方法名(参数列表) {
        // 方法体;
        return 结果;
    }

    静态的好处
        被静态修饰的内容可以使用类名调用
           静态成员变量称为类变量
           静态成员方法称为类方法

    什么时候适合将方法定义成静态方法?
        因为静态只能访问静态.所以方法中如果没有用到非静态的内容就可以考虑定义成静态的
 */
public class Demo10 {
    public static void main(String[] args) {
        test();

        // new对象后.只要对象调用方法即可
        Person p = new Person();
        p.test04();
        p.test02();

        // 被静态修饰的内容可以使用类名调用(推荐使用类名调用)
        Person.test02();
        System.out.println(Person.num2);
    }

    public static void test() {

    }
}
