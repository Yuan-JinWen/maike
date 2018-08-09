package com.itheima.demo05对象的内存图;

public class Demo053 {

    public static void main(String[] args) {
        Phone p1 = new Phone();
        System.out.println("p1: " + p1);
        p1.brand = "OPPO";
        p1.price = 1999;
        p1.color = "白色";
        p1.call("林青霞");
        p1.sendMessage();

        Phone p2 = p1;
        System.out.println("p2: " + p2);
        p2.brand = "魅族";
        p2.price = 999;
        p2.color = "蓝色";
        p2.call("欧巴马");
        p2.sendMessage();
        System.out.println(p1.brand + " -- " + p1.price + "--" + p1.color);
        System.out.println(p2.brand + " -- " + p2.price + "--" + p2.color);
    }
}
