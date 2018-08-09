package com.itheima.demo05对象的内存图;

public class Demo051 {

    public static void main(String[] args) {
        // 创建手机对象
        Phone p = new Phone();
        System.out.println(p.brand + " , " + p.price + " , " + p.color);
        p.brand = "锤子";
        p.price = 2999;
        p.color = "棕色";
        System.out.println(p.brand + " , " + p.price + " , " + p.color);

        p.call("林青霞");
        p.sendMessage();
    }
}
