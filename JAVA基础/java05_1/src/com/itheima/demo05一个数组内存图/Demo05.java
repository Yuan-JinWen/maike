package com.itheima.demo05一个数组内存图;

public class Demo05 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr); // [I@1c53fd30
        System.out.println(arr[0]); // 0
        System.out.println(arr[1]); // 0
        System.out.println(arr[2]); // 0

        // 修改元素
        arr[0] = 100;

        System.out.println(arr[0]); // 100
        System.out.println(arr[1]); // 0
        System.out.println(arr[2]); // 0
    }
}
