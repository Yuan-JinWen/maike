package com.itheima.demo09this关键字;

/*
    什么是this:谁调用这个方法,方法中的this就是谁
    this关键字的作用:用于区分局部变量和成员变量
        this.变量名找的成员变量


 */
public class Demo09 {
    public static void main(String[] args) {
        Person p = new Person();
        // 直接设置属性, 为了安全,将成员变量封装起来.不让他直接使用
        // p.name = "老王吧";
        // p.age = -88;
        System.out.println("p = " + p);
        p.setName("老王吧");
        p.setAge(88);

        // 获取名称和年龄
        //p.name
        // p.age
        System.out.println(p.getName() + " , " +  p.getAge());
    }
}
