package com.itheima.demo08static修饰成员变量;

// 中国人
public class Chinese {
    String name;
    int age;
    static String country;

    public Chinese(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age + "," + country);
    }
}
