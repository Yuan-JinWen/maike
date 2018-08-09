package com.itheima.demo13Math类;

/*
    请使用 Math 相关的API，计算在  -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？

    分析:
        1.定义变量满足要求的数量
        2.找到-10.8到5.9之间的整数for: -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
        3.遍历获取到每个数字
        4.看数字绝对值是否大于 6 或者小于 2.1
        5.如果满足数量+1
 */
public class Demo131 {
    public static void main(String[] args) {
        // 1.定义变量满足要求的数量
        int count = 0;

        // 2.找到-10.8到5.9之间的整数for: -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
        for (double i = Math.ceil(-10.8); i < Math.ceil(5.9); i++) {
            // System.out.println(i);
            // 4.看数字绝对值是否大于 6 或者小于 2.1
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                count++;
                System.out.println("符合要求的数字: " + i);
            }
        }

        System.out.println(count);
    }
}
