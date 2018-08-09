package com.itheima.demo18接口多态的综合案例;
// 键盘
public class Keyboard implements Usb {
    public void openUsb() {
        System.out.println("Usb键盘开启...键盘敲击了...");
    }

    public void closeUsb() {
        System.out.println("Usb键盘关闭...");
    }
}
