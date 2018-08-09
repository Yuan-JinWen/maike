package com.itheima.demo07成员变量和局部变量的区别;

/*
    如何区分成员变量和局部变量:
        成员变量:类中方法外
        局部变量: 方法中定义的变量或者方法的参数

成员变量和局部变量的区别:
    在类中的位置不同  重点
        成员变量：类中，方法外
        局部变量：方法中或者方法声明上(形式参数)

    作用范围不一样  重点
        成员变量：类中
        局部变量：方法中

    初始化值的不同  重点
        成员变量：有默认值
                byte,short, int, long   默认值是0
                float, double           默认值是0.0
                char                    默认值'\u0000'
                引用数据类型(String)    默认值null
        局部变量：没有默认值。必须先定义，赋值，最后使用

    在内存中的位置不同  了解
        成员变量：堆内存
        局部变量：栈内存

    生命周期不同  了解
        成员变量：随着对象的创建而存在，随着对象的消失而消失
        局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
 */
public class Car {
    String name; // 成员变量,类中方法外

    public void run(int speed) { // 局部变量
        int a = 30; // 局部变量,方法中

        System.out.println(a);
        System.out.println(speed);
        System.out.println(name);
    }

    public void test() {
        // 局部变量只能本方法中使用
//         System.out.println(speed);
//         System.out.println(a);
        System.out.println(name);
    }
}
