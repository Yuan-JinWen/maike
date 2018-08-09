package com.itheima.demo18接口多态的综合案例;
// 放在膝盖上的电脑
public class Laptop {
    public void run() {
        System.out.println("笔记本运行中...");
    }

    public void shutDown() {
        System.out.println("关机了");
    }

    // 使用Usb设备,参数写接口.可以传入任意的实现类
    // lap.useUsb(m);   Usb u = m; Usb u = new Mouse(); // 接口 变量名 = new 实现类(); 多态
    // lap.useUsb(k);   Usb u = k; Usb u = new Keyboard(); // 接口 变量名 = new 实现类(); 多态
    public void useUsb(Usb u) {
        u.openUsb(); // 多态走子类重写方法
        u.closeUsb(); // 多态走子类重写方法
    }
}
