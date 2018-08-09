package com.itheima.demo11数组反转;

/*

 */
public class Demo11 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            // 交换位置
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }

        // 重新遍历arr数组
        for (int i = 0; i < arr.length; i++) { // {55, 44, 33, 22, 11}
            System.out.println(arr[i]);
        }
    }

    public void test01() {
        int[] arr = {11, 22, 33, 44, 55};

        // 1.定义2个变量,一个记录小索引,一个记录大索引
        int start = 0;
        int end = arr.length - 1;

        // 循环交换元素, 小索引<大索引就需要交换位置
        while (start < end) {
            //  arr[start] 和 arr[end]要换位置
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // 小索引++, 大索引--
            start++;
            end--;
        }

        // 重新遍历arr数组
        for (int i = 0; i < arr.length; i++) { // {55, 44, 33, 22, 11}
            System.out.println(arr[i]);
        }
    }
}
