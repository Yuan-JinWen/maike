package com.itheima.demo08方法重载练习;

/*
定义方法比较两个数据是否相等。参数类型分别为两个 byte 类型，两个 short 类型，两个 int 类型，两个 long 类型，并
在 main 方法中进行测试。
 */
public class Demo081 {
    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 1;
        System.out.println(compare(b1, b2));

        short s1 = 1;
        short s2 = 2;
        System.out.println(compare(s1, s2));

        int i1 = 1;
        int i2 = 1;
        System.out.println(compare(i1, i2));

        long l1 = 1;
        long l2 = 2;
        System.out.println(compare(l1, l2));
    }

    // byte 类型
    public static boolean compare(byte b1, byte b2) {
        System.out.println("byte");
        return b1 == b2;
    }

    // short 类型
    public static boolean compare(short s1, short s2) {
        System.out.println("short");
        return s1 == s2;
    }

    // int 类型
    public static boolean compare(int i1, int i2) {
        System.out.println("int");
        return i1 == i2;
    }

    // long 类型
    public static boolean compare(long l1, long l2) {
        System.out.println("long");
        return l1 == l2;
    }
}
