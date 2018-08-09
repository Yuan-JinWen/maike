package com.itheima.day08数组操作2个问题;

public class Demo8 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        // System.out.println(arr[3]); // ArrayIndexOutOfBoundsException: 数组索引越界

        // 数组属于引用数据类型,引用数据类型可以赋值null, 表示这个变量不记录这个地址
       arr = null;

        System.out.println(arr[0]); // NullPointerException: 空指针异常
    }
}
