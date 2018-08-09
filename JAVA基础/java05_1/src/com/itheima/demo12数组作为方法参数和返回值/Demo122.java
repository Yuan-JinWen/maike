package com.itheima.demo12数组作为方法参数和返回值;

public class Demo122 {
    public static void main(String[] args) {

        // 断点要打在程序会执行到的地方
        if (3 > 5) {
            System.out.println("嘻嘻");
        }

        int[] arr2 = getArray(); //  0x110 -> arr2 = 0x110

        System.out.println("arr2: " + arr2); // 0x110
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    // 数组作为返回值,返回的是数组的地址
    public static int[] getArray() {
        int[] arr = new int[]{11, 22, 33, 44, 55}; // 0x110      arr = 0x110
        System.out.println("arr: " + arr); // 0x110
        return arr; // 0x110
    }
}
