package com.itheima.demo05对象的内存图;

public class Demo052 {

    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "小米";
        p1.price = 1999;
        p1.color = "银色";
        System.out.println(p1.brand + " -- " + p1.price + "--" + p1.color);
        p1.call("林青霞");
        p1.sendMessage();

        Phone p2 = new Phone();
        p2.brand = "iPhone 8 Plus";
        p2.price = 7999;
        p2.color = "土豪金";
        System.out.println(p2.brand + " -- " + p2.price + "--" + p2.color);
        p2.call("张曼玉");
        p2.sendMessage();
    }
}
