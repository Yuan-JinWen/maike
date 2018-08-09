package com.itheima.demo11ArrayList练习;

import java.util.ArrayList;

/*
    自定义4个学生对象,添加到集合,并遍历

    分析:
        1.定义学生类
        2.创建一个ArrayList集合保存学生对象
        3.创建4个学生
        4.将学生放到集合中
        5.遍历集合
 */
public class Demo112 {
    public static void main(String[] args) {
        // 2.创建一个ArrayList集合保存学生对象
        ArrayList<Student> list = new ArrayList<>();
        // 3.创建4个学生
        Student s1 = new Student("张三", 23); // 0x11a
        Student s2 = new Student("李四", 33); // 0x12a
        Student s3 = new Student("王五", 44); // 0x13a
        Student s4 = new Student("赵六", 55); // 0x14a

        // 4.将学生放到集合中
        list.add(s1); // 0x11a
        list.add(s2); // 0x12a
        list.add(s3); // 0x13a
        list.add(s4); // 0x14a

        // 5.遍历集合
        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
            // i = 1 Student s = 0x11a
            // i = 2 Student s = 0x12a
            // i = 3 Student s = 0x13a
            // i = 4 Student s = 0x14a
            Student s = list.get(i);
            System.out.println(s.getName() + " , " + s.getAge());
        }
    }
}

// 工作中不建议一个文件写多个类
// 1.定义学生类
class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}