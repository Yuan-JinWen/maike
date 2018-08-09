package com.itheima.demo05接口_静态方法;

/*
    静态方法是不能继承的.使用类名调用
    接口中带静态方法: 使用接口名调用
 */
public class Demo05 {
    public static void main(String[] args) {
        // Worker w = new Worker();
        // w.swimming();

        // 接口名.静态方法名()
        Swimmable.swimming();

        // 类名.静态方法名()
        Worker.swimming();
    }
}
