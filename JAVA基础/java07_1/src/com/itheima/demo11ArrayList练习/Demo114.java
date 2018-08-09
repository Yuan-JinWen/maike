package com.itheima.demo11ArrayList练习;

import java.util.ArrayList;
import java.util.Random;

/*
    定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)
    分析:
        1.定义一个集合,存储一些数据(奇数和偶数都有)
        2.定义一个方法用于获取集合中的偶数
            2.1. 方法参数(集合)
            2.2. 方法返回值(一个保存的全是偶数的集合)

    数组和集合的特点:
        数组的特点:长度固定.可以放基本数据类型也可以放引用数据类型
        ArrayList集合的特点:长度是变化的.只能放引用数据类型

        哪个用的多呢?基本上集合用的多,因为集合长度可变.可以增加,删除修改...元素
 */
public class Demo114 {
    public static void main(String[] args) {
        //  1.定义一个集合,存储一些数据(奇数和偶数都有)
        ArrayList<Integer> list = new ArrayList<>();
        /*list.add(110);
        list.add(112);
        list.add(113);
        list.add(115);
        list.add(116);
        list.add(117);
        list.add(118);
        list.add(119);*/
        Random ran = new Random();
        for (int i = 0; i < 100; i++) {
            int i1 = ran.nextInt(3000);
            list.add(i1);
        }

        ArrayList<Integer> ouShuArrayList = getOuShuArrayList(list);
        System.out.println(ouShuArrayList);
    }

    /*
        2.定义一个方法用于获取集合中的偶数
            2.1. 方法参数(集合)
            2.2. 方法返回值(一个保存的全是偶数的集合)
            2.3. 定义一个集合用于存放拿到的偶数
            2.4. 遍历传入的集合
            2.5. 如果是偶数则添加到偶数的集合中
            2.6. 返回偶数集合
     */
    public static ArrayList<Integer> getOuShuArrayList(ArrayList<Integer> list) {
        // 2.3. 定义一个集合用于存放拿到的偶数
        ArrayList<Integer> newList = new ArrayList<>();

        // 2.4. 遍历传入的集合
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            // 2.5. 如果是偶数则添加到偶数的集合中
            if (a % 2 == 0) {
                newList.add(a);
            }
        }

        // 2.6. 返回偶数集合
        return newList;
    }
}
