package com.itheima.demo04接口_默认方法;

public class Girl implements Swimmable {
    // 重写接口中的默认方法
    // 需要去掉default
    public void swimming() {
        System.out.println("默认方法...裸泳...");
    }
}
