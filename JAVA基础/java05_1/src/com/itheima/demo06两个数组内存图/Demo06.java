package com.itheima.demo06两个数组内存图;

public class Demo06 {
    public static void main(String[] args) {
        int[] arr1 = new int[2];
        int[] arr2 = new int[3];

        System.out.println(arr1); // [I@1c53fd30
        System.out.println(arr1[0]); // 0
        System.out.println(arr1[1]); // 0

        System.out.println(arr2); // [I@50cbc42f
        System.out.println(arr2[0]); // 0
        System.out.println(arr2[1]); // 0
        System.out.println(arr2[2]); // 0

        arr1[0] = 1000;
        arr2[0] = 2000;

        System.out.println(arr1); // [I@1c53fd30
        System.out.println(arr1[0]); // 1000
        System.out.println(arr1[1]); // 0

        System.out.println(arr2); // [I@50cbc42f
        System.out.println(arr2[0]); // 2000
        System.out.println(arr2[1]); // 0
        System.out.println(arr2[2]); // 0
    }
}
