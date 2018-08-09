package com.itheima.demo18接口多态的综合案例;

public class Demo18 {
    public static void main(String[] args) {
        // 创建出笔记本
        Laptop lap = new Laptop();
        // 笔记本运行
        lap.run();
        // 创建USB鼠标
        Mouse m = new Mouse();
        // 创建USB键盘
        Keyboard k = new Keyboard();

        // 笔记本使用Usb设置
        // 参数要接口.传入实现类对象
        lap.useUsb(m);
        lap.useUsb(k);


        // 笔记本关机
        lap.shutDown();
    }
}
