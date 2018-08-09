package com.itheima.demo07方法重载;

/*
    定义2个int数求和,定义3个int数求和

    我们发现2个数求和,3个数求和功能是一样的.如果定义不同的方法名使用起来不方便.最好取相同的名称,就像
人的吃饭功能.不管是吃面,还是吃米饭.都叫吃饭功能

    为了解决功能相同的时候我们可以使用相同的方法名.不用记忆太多的方法名.可以使用重载(overload)

    什么是重载:在同一个类中,方法名相同,参数列表不同

        参数列表不同:
            1.参数数量不同
            2.参数类型不一样 (不看变量名)

    重载方法的执行:
        1.根据方法名找到对应的方法(可能有多个)
        2.根据传入的参数的类型找到对应的方法执行

    重载的好处,对用功能相同的方法,我们不用写不同的方法名,写相同的方法名,传入不同参数,自动找到对应的方法执行.
 */
public class Demo07 {
    public static void main(String[] args) {
        int c = add(5, 6);
        System.out.println(c);

        int d = add(5, 6, 7);
        System.out.println(d);

        double dd = add(5.5, 5.5);
        System.out.println(dd);
    }

//    public static double add(double x, double y) {
//        return x + y + 1;
//    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
