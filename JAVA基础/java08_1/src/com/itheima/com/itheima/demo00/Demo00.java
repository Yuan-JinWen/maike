package com.itheima.com.itheima.demo00;

import java.util.ArrayList;
import java.util.Scanner;

/*
    2.1． 训练描述：【综合：Scanner类、方法、ArrayList类综合】
    一、	需求说明：程序启动后可以接收三个学员信息，然后可以打印所有学员信息，并找出身高最高的学员，并打印他们的详细信息
    2.2． 操作步骤描述
    1.	定义MainApp类，包含main()方法；
    2.	在main()方法中，创建一个可以存储Student对象的集合对象；
    3.	从控制台接收以下几个Student对象：
    学号	姓名	性别	年龄	身高
    it001	黄渤	男		20		1.72
    it002	孙红雷	男		22		1.78
    it003	章子怡	女		18		1.64
    将每个对象添加到集合中(集合中学员学号唯一)；
    4.	在MainApp中创建方法，可以打印所有学员信息：
    public static void printAll(ArrayList<Student>stuList){}
    5.	在MainApp中创建方法，可以找出身高最高的学员，并打印：
    public static void findMaxHeight(ArrayList<Student>stuList){}
    6.	在main()方法中，分别调用三个方法：打印所有学员，找出身高最高的学员；

    分析:
        1.定义一个类
        2.for循环键盘录入3个学生信息
        3.每当录入一个学生的信息时,创建一个学生对象.将录入的信息保存包学生对象
        4.3个学生就保存集合中
        5.printAll定义方法打印集合中的学生信息
        6.定义方法findMaxHeight找出最高身高
 */
public class Demo00 {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 创建键盘录入对象Scanner

        // 多个相同的数据,存储到数组或集合中
        ArrayList<Student> list = new ArrayList<>();
        // 创建集合 list
        // ArrayList <Student>list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的学号: ");
            String id = sc.next();
            // String id = sc.next();   数据类型 对象名 = sc.next();
            System.out.println("请输入第" + (i + 1) + "个学生的姓名: ");
            String name = sc.next();
            // String name = sc.next();
            System.out.println("请输入第" + (i + 1) + "个学生的性别: ");
            String sex = sc.next();
            //String sex = sc.next();
            System.out.println("请输入第" + (i + 1) + "个学生的年龄: ");
            int age = sc.nextInt();
            // int age = sc.nextInt();
            System.out.println("请输入第" + (i + 1) + "个学生的身高: ");
            double height = sc.nextDouble();
            //double height = sc. nextDouble();

            // 创建一个学生对象
            Student s = new Student(id, name, sex, age, height);
            list.add(s);
        }

        printStudent(list);
        findMaxHeight(list);
    }

    // 找出身高最高的学生
    public static void findMaxHeight(ArrayList<Student> students) {
        // 定义一个变量记录最高的身高的学生
        Student maxHeightStudent = students.get(0); // 假设索引为0的学生是身高最高的学生
        // for循环遍历.和其他学生比身高
        for (int i = 1; i < students.size(); i++) {
            Student s = students.get(i);
            // 比较身高
            if (maxHeightStudent.getHeight() < s.getHeight()) {
                maxHeightStudent = s;
            }
        }

        System.out.println(maxHeightStudent.getId() + "," + maxHeightStudent.getName() + "," + maxHeightStudent.getAge());
    }

    // 打印所有的学生信息
    public static void printStudent(ArrayList<Student> students) {
        // 遍历集合.
        for (int i = 0; i < students.size(); i++) {
            // 取出一个学生
            Student s = students.get(i);
            System.out.println(s.getId() + "," + s.getName() + "," + s.getSex() + "," + s.getAge() + "," + s.getHeight());
        }
    }
}
