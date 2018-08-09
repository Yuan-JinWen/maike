package com.itheima.demo04调用方法的三种形式;

public class Demo04 {
    public static void main(String[] args) {
        // 直接调用: 没有对返回值进行处理
        // getSum(5, 6);

        // 赋值调用(常用): 方法返回值类型是什么,我们就用什么变量接收.可接着对结果进行处理
        int sum = getSum(5, 6);
        System.out.println(sum + 100);

        // 输出调用: 可以看到方法的返回结果
        // System.out.println(11);
        System.out.println(getSum(5, 6));

        // show();
        // int v = show(); // 没有返回值, 不知道用什么保存
        // System.out.println(show()); // 没有返回值.不知道打印什么东西
    }

    // 注意:没有返回值的方法,只能直接调用
    public static void show() {
        System.out.println("我秀...");
    }

    public static int getSum(int a, int b) { // 形式参数:定义方式时,方法名后面,只是2个变量,没有具体值
        int c = a + b; // c = 11

        return c; // 11
    }
}
