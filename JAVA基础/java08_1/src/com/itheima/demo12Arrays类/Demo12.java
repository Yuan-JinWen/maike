package com.itheima.demo12Arrays类;

import java.util.Arrays;

/*
    Arrays类: (数组的工具类,帮我们操作数组)
        该类包含用于操作数组的各种方法（如排序和搜索）。
    没有构造方法就不能创建对象.全是静态方法

    静态方法:
        static String toString​(int[] a) 返回指定数组的内容的字符串表示形式。
        static void sort​(int[] a) 按照数字顺序排列指定的数组。
 */
public class Demo12 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        String string = Arrays.toString(arr);
        System.out.println(string);

        int[] arr2 = {9, 6, 3, 5, 4, 10, 8};
        Arrays.sort(arr2); // 会对数组中的元素重新排序
        System.out.println(Arrays.toString(arr2));
    }
}
