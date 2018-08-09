package com.itheima.demo11ArrayList练习;

import java.util.ArrayList;
import java.util.Random;

/*
    生成6个1~33之间的随机整数,添加到集合,并遍历

    分析:
        1.创建一个Random用于产生随机数
        2.创建ArrayList集合
        3.使用for循环生成6个随机数
        4.将创建好的随机数放到集合中.add
        5.遍历集合
 */
public class Demo111 {
    public static void main(String[] args) {
        // 1.创建一个Random用于产生随机数
        Random ran = new Random(); // 买了一个打火机,通过for循环使用了6次
        // 2.创建ArrayList集合
        ArrayList<Integer> list = new ArrayList<>();

        // 3.使用for循环生成6个随机数
        for (int i = 0; i < 6; i++) {
            // Random的创建放在for循环里面会被创建6次.相当于买个打火机点一次火就扔了.下次再买一个打火机
            // Random ran = new Random();
            // 创建随机数
            int i1 = ran.nextInt(33) + 1;
            // 4.将创建好的随机数放到集合中.add
            list.add(i1);
        }
        // 5.遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
