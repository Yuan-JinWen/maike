package com.itheima.demo12发红包;

// 父类/用户类
public class User {
    // 姓名
    private String name;
    // 余额
    private double leftMoney;

    public User() {
    }

    public User(String name, double leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    // 显示信息
    public void show() {
        System.out.println(name + "余额为: " + leftMoney);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }
}
