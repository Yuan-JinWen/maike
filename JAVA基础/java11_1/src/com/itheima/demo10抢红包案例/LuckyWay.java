package com.itheima.demo10抢红包案例;

import com.itheima.known.OpenMode;

import java.util.ArrayList;
import java.util.Random;

// 随机分配红包
public class LuckyWay implements OpenMode {
    // 随机分钱.需要使用到随机数
    // 分钱随机数不能大:.0.01~平均数的2倍
    // 最后一个人不用随机.总额-已经发的就是最后一个人剩下的
    public ArrayList<Integer> divide(int totalMoney, int count) {
        // 创建一个ArrayList集合用于存放随机分好的钱
        ArrayList<Integer> list = new ArrayList<>();

        Random ran = new Random();
        // 定义好一个变量:表示循环次数
        int time = count - 1;
        // count = 5.随机分4次
        // 随机分钱
        for (int i = 0; i < time; i++) {
            System.out.println("time: " + time);
            System.out.println("i: " + i);
            // 算出平均金额
            int avg = totalMoney / count;

            // 随机一个金额
            int money = ran.nextInt(avg * 2) + 1;
            // 将随机到的钱添加到集合中
            list.add(money);

            // 总金额 = 总金额 - 随机的钱
            totalMoney -= money;
            count--; // 分钱的人数减少一个
        }

        // 最后一份,不用随机
        list.add(totalMoney); // totalMoney总金额-所有随机的金额.剩下的最后一份

        return list;
    }
}
