package com.itheima.demo12发红包;

import java.util.ArrayList;

public class QunZhu extends User {
    public QunZhu() {
    }

    public QunZhu(String name, double leftMoney) {
        super(name, leftMoney);
    }

    /* 100 发5个包, 每个包20元 20, 20, 20, 20, 20. 选择数组或集合
        群主发红包功能
            1.明确返回值:因为红包会分成很多份,所以使用ArrayList来保存分好的红包并返回
            2.明确参数列表: 红包金额,份数

         发红包的逻辑
            1.定义一个集合存放分好的钱
            2.从自己的余额中扣除发的钱
            3.计算每份有多少钱
            4.将分好的钱放到集合中
            5.返回集合
     */
    public ArrayList<Double> faHongBao(double money, int count) {
        // 1.定义一个集合存放分好的钱
        ArrayList<Double> list = new ArrayList<>();

        // 2.从自己的余额中扣除发的钱
        // 2.1 取出当前余额
        // 2.2 最新的余额 = 当前余额-发的钱
        double newMoney = getLeftMoney() - money;
        // 2.3 设置当前的余额为最新的余额
        setLeftMoney(newMoney);

        // 3.计算每份有多少钱 = 总金额 / 人数
        double avgMoney = money / count;

        // 4.将分好的钱放到集合中. 分成count分,所以我们就放count次
        for (int i = 0; i < count; i++) {
            list.add(avgMoney);
        }

        // 5.返回集合
        System.out.println("111: " + list);
        return list; // 类名作为返回值,返回的是这个对象的地址
    }
}
