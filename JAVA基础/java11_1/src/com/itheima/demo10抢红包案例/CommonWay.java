package com.itheima.demo10抢红包案例;

import com.itheima.known.OpenMode;

import java.util.ArrayList;


// 普通方式.平均分配
public class CommonWay implements OpenMode {
    // 分钱的方法.平均分配
    // totalMoney: 1000
    // count: 2
    // int totalMoney: 会将我们的钱乘以100
    // int count: 分成多少分
    public ArrayList<Integer> divide(int totalMoney, int count) {
        // 测试一下参数
        // System.out.println("totalMoney: " + totalMoney);
        // System.out.println("count: " + count);
        // 1.定义一个集合,用于存放分好的钱
        ArrayList<Integer> list = new ArrayList<>(); // 10*100 / 5
        // 2.计算平均的钱
        int avg = totalMoney / count; // 200

        // 3.将分好的钱添加到集合中 // [200, 200, 200, 200, 200]
        for (int i = 0; i < count; i++) {
            list.add(avg);
        }

        System.out.println(list);
        return list;
    }
}
