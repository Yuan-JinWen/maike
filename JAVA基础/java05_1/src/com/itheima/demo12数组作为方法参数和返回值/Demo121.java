package com.itheima.demo12数组作为方法参数和返回值;

public class Demo121 {
    public static void main(String[] args) {
        int[] arr = new int[] {11, 22, 33, 44, 55};
        System.out.println("arr: " + arr);
        printArray(arr);

        // 外面再次来使用的时候,里面的内容被别人改过
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 数组作为参数传递的是数组的地址值
    //                              int[] arr2 = arr
    public static void printArray(int[] arr2) {
        System.out.println("arr2: " + arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        arr2[3] = 666; // 别人拿到地址修改了地址里面的内容
    }
}
