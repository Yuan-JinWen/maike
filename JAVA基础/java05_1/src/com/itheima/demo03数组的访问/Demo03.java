package com.itheima.demo03数组的访问;

public class Demo03 {
    public static void main(String[] args) {
        int a = 10;

        double[] ds = {1.1, 2.2};
        System.out.println(ds); // [D@1c53fd30
        int[] arr = {110, 114, 119, 120, 122};

        // 将地地址看做家庭住址
        System.out.println(arr); // [I@50cbc42f
        /*
            [I@50cbc42f: 数组地地址:
                [: 表示数组
                I: int类型数组, D:表示double类型数组
                @: 分割
                50cbc42f: 地址的十六进制, 十六进制表示会短一点
         */

        // 索引： 每一个存储到数组的元素，都会自动的拥有一个编号，从0开始，这个自动编号称为数组索引(下标/角标)
        /*
            访问数组的格式:
                数组名[索引]
                获取元素: 数组名[索引]
                修改元素: 数组名[索引] = 值;
          */
        // 访问索引为1的元素
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        // 修改arr数组索引为2的元素,新的值为999
        arr[2] = 999;

        // int arr[2] = 999; // 修改元素不要写类型

        System.out.println("------");
        System.out.println(arr[2]);

        // 数组的长度属性: (属性,事物的信息)
        // 数组的最小索引是0
        // 数组的最大索引: 数组的长度-1:    arr.length - 1
        System.out.println("长度" + arr.length);
    }
}
