package com.itheima.demo08数组遍历;

/*
    什么是数组遍历:挨个取出数组中的每个元素
 */
public class Demo08 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};

        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/
        // 以上代码是重复的.如果元素很多要很很多行.我们可以使用循环来解决.我们发现索引是在变化的
        // 索引由0变化到4
        /*for (int i = 0; i < 5; i++) {
            // i = 0;    System.out.println(arr[0]);
            // i = 1;    System.out.println(arr[1]);
            // i = 2;    System.out.println(arr[2]);
            // i = 3;    System.out.println(arr[3]);
            // i = 4;    System.out.println(arr[4]);
            System.out.println(arr[i]);
        }*/
        // 以上代码,5不能写死.应该写数组的长度
        /*for (int i = 0; i < arr.length; i++) { // i = 0, i 最大值 = arr.length - 1
            System.out.println(arr[i]);
        }*/
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
