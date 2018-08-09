package com.itheima.demo07对象数组;
/*
    数组: 用于存储同一类型的多个元素容器,长度是固定的
        数据类型[] 数组名 = new 数据类型[长度];
        int[] arr = new int[5];
        double[] arr = new double[5];
 */
public class Demo07 {
    public static void main(String[] args) {
        // 数组可以存储引用数据类型
        Phone[] phones = new Phone[3];

        Phone p1 = new Phone("小米", 1999); // 0x110
        Phone p2 = new Phone("华为", 2999); // 0x210
        Phone p3 = new Phone("锤子", 999); // 0x310

        // 将3个手机对象放入数组中,存入的是地址
        phones[0] = p1; // 0x110
        phones[1] = p2; // 0x210
        phones[2] = p3; // 0x310

        // 遍历数组,拿到每个手机,并打印
        for (int i = 0; i < phones.length; i++) {
            // com.itheima.demo07对象数组.Phone@0x110
            //com.itheima.demo07对象数组.Phone@0x210
            //com.itheima.demo07对象数组.Phone@0x310
            // System.out.println(phones[i]);
            Phone p = phones[i];
            System.out.println(p.getBrand() + " , " + p.getPrice());
        }
    }
}
