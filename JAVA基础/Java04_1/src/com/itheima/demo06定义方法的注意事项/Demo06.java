package com.itheima.demo06定义方法的注意事项;

/*
    1.定义位置，类中方法外面。
    2.调用方法时写错方法名字。
    3.调用方法时写错了参数列表。
    4.一个类中不能定义2个一模一样的方法。
    5.返回值类型，必须要和 return 语句返回的类型相同，否则编译失败 。
    6.不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。
 */
public class Demo06 {
    public static void main(String[] args) {
        // 2.调用方法时写错方法名字。
        // tset();

        // 3.调用方法时写错了参数列表。
        // getSum()
        // getSum(5);
        // getSum(5, 6, 7);

        // 5.返回值类型，必须要和 return 语句返回的类型相同，否则编译失败 。
        // byte i = getSum(5, 6);
    }

    // 4.一个类中不能定义2个一模一样的方法。
//    public static int getSum(int a, int b) {
//        int c = a + b;
//        return c;
//    }

    public static int getSum(int a, int b) {
        int c = a + b;

        // 6.不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。
        return c;
        // System.out.println("aa");
    }

    public static void test() {
    }
}

// 1.定义位置，类中方法外面。
//    public static void test() {
//    }