package com.itheima.demo10ArrayList存储基本数据类型;

import java.util.ArrayList;

/*
        ArrayList:称为集合,里面只能存储引用数据类型

        基本数据类型不能直接存入ArrayList中,要写对应引用数据类型

        基本数据类型      引用数据类型
        byte                Byte
        short               Short
        int                 Integer     ***
        long                Long
        float               Float
        double              Double
        char                Character   ***
        boolean             Boolean

       基本数据类型对应的引用数据类型是首字母大写,2个特别的
       int                 Integer     ***
       char                Character   ***
 */
public class Demo10 {
    public static void main(String[] args) {
        // int[]
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);

        // 打印集合仅仅只能让我们看到里面有什么元素
        System.out.println(list);
        // 遍历集合,可以拿到每个元素再进一步的操作
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(14.3);
        System.out.println(list2);
    }
}
