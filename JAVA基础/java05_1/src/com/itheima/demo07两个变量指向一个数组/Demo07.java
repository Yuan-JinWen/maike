package com.itheima.demo07两个变量指向一个数组;

public class Demo07 {
    public static void main(String[] args) {
        int[] arr1 = new int[2];

        System.out.println(arr1); // [I@1c53fd30
        System.out.println(arr1[0]); // 0
        System.out.println(arr1[1]); // 0

        // 将数组arr1赋值给数组arr2,赋值的是地址值
        int[] arr2 = arr1; //  int[] arr2 = 1c53fd30

        arr2[1] = 200;

        System.out.println(arr1); // [I@1c53fd30
        System.out.println(arr1[0]); // 0
        System.out.println(arr1[1]); // 200

        System.out.println(arr2); // [I@1c53fd30
        System.out.println(arr2[0]); // 0
        System.out.println(arr2[1]); // 200

        System.out.println("-----------");
        // 数组的默认值
        int[] arr3 = new int[2];
        System.out.println(arr3[0]); // 0

        double[] arr4 = new double[2];
        System.out.println(arr4[0]); // 0.0

        boolean[] arr5 = new boolean[2];
        System.out.println(arr5[0]); // false

        char[] arr7 = new char[2];
        System.out.println(arr7[0]); // 看不到
        System.out.println(arr7[0] + 1); // ascii码值是0 结果是1

        // String是引用数据类型
        String[] arr6 = new String[2];
        System.out.println(arr6[0]); // null
        /*
            int[] ->            0
            double[] ->         0.0
            boolean[] ->        false
            引用数据类型[] ->     null
            char[] ->           '\u0000'
         */
    }
}
