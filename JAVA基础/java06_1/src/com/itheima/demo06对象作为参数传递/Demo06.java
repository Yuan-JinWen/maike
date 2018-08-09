package com.itheima.demo06对象作为参数传递;


import com.itheima.demo05对象的内存图.Phone;

/*

 */
public class Demo06 {
    public static void main(String[] args) {
        Phone p = new Phone(); // 0x675
        System.out.println(p);
        p.brand = "华为";
        p.price = 2999;
        p.color = "奶奶灰";

        showPhone(p); // 0x675
    }

    //                             Phone p2 = p; // 0x675
    public static void showPhone(Phone p2) { // p2只能在本方法中使用,也是局部变量
        System.out.println(p2);
        System.out.println(p2.brand + " -- " + p2.price + " -- " + p2.color);
    }
}
