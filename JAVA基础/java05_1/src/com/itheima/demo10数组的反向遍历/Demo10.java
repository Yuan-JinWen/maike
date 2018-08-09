package com.itheima.demo10数组的反向遍历;

public class Demo10 {
    public static void main(String[] args) {
        //           0    1   2   3  4
        int[] arr = {11, 22, 33, 44, 55};

        // 数组的遍历
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        // 数组的反向遍历 (没有修改数组中的元素)
        /*System.out.println(arr[4]);
        System.out.println(arr[3]);
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr[0]);*/
        // arr.length - 1 = 4
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
