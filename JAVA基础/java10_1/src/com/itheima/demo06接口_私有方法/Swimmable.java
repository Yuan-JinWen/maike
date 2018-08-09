package com.itheima.demo06接口_私有方法;

public interface Swimmable {
    private void swimming() {
        System.out.println("我是接口中的私有方法...蝶泳");
    }

    private static void swimming2() {
        System.out.println("我是接口中的私有方法...蝶泳");
    }

    public default void show() {
        swimming();
    }

    public static void show2() {
        swimming2();
    }
}
