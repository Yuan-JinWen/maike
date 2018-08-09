package com.itheima.demo05定义方法练习;

public class Demo053 {
    public static void main(String[] args) {
        printHW(5);
        System.out.println("----------------");
        printHW(6);
    }

    /*
        定义一个方法实现不定次数打印HelloWorld
            定义方法2个明确:
                    1.明确返回值类型: void
                    2.参数列表: 不确定要打印多少次,未知数据,作为参数 (int count)
     */
    public static void printHW(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello World Idea");
        }
    }

}
