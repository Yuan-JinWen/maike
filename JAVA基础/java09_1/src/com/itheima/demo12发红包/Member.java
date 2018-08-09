package com.itheima.demo12发红包;

import java.util.ArrayList;
import java.util.Random;

// 群成员
public class Member extends User {
    public Member() {
    }

    public Member(String name, double leftMoney) {
        super(name, leftMoney);
    }

    /*
        收红包:
            1.明确返回值类型: 不需要返回 void
            2.明确参数列表: 红包集合ArrayList集合
             0    1   2  3    4
            [20, 20, 20, 20, 20]  size() = 5

        收红包逻辑:
            1.随机从集合冲取一个红包出来
            2.自己的余额增加取到的钱

            类名作为参数拿到的是对象的地址
     */
    public void shouHongBao(ArrayList<Double> list) {
        System.out.println("333: " + list);
        // 1.1 创建Rranom对象
        Random ran = new Random();
        // 1.2 搞一个随机数作为索引去集合中取出一个红包
        int index = ran.nextInt(list.size());

        // 1.3 从红包集合中取一个红包出来
      double money = list.remove(index);

        // 2.自己的余额增加取到的钱
        // 2.1 取出当前余额
        // 2.2 最新余额 = 当前余额+收到的红包金额
        double newMoney = getLeftMoney() + money;
        // 2.3 将最新余额保存成员变量中
        setLeftMoney(newMoney);
    }

}
