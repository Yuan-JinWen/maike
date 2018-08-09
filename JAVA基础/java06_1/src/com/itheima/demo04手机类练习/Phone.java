package com.itheima.demo04手机类练习;

/*
    手机事物:
        属性: 品牌, 价格, 颜色
        行为: 打电话, 发短信
 */
public class Phone {
    // 品牌
    String brand;
	// String brand;
    // 价格
    double price;
	//double price;
    // 颜色
    String color;
	// String color 
	
    // 打电话
    public void call(String name) {
		// public void call (String name)
        System.out.println("给 " + name + " 打电话");
    }
    // 发短信
    public void sendMessage() {
        System.out.println("群发短信");
    }
}
