package com.itheima.demo18接口多态的综合案例;
// 鼠标
public class Mouse implements Usb {
    public void openUsb() {
        System.out.println("usb鼠标开启.鼠标点击了");
    }

    public void closeUsb() {
        System.out.println("usb鼠标关闭");
    }
}
