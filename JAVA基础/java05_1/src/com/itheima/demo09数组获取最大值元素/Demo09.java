package com.itheima.demo09数组获取最大值元素;

/*
    获取到数组最大值:
    思路:
        1.定义一个遍历记录比较之后的较大值
        2.遍历数组,拿出数组中的每个元素,都和较大值比较
        3.如果取出来的元素比较大值大,我们换掉这个较大值为刚取出来的元素
        4.for循环完成,最大值就求出来了
 */
public class Demo09 {
    public static void main(String[] args) {
        int[] arr = {-5, -15, -2000, -10000, -100, -4000};

        // 1.定义一个遍历记录比较之后的较大值
        // 先假设索引为0的元素就是最大值
        int max = arr[0]; // max = 5;
        // int max = 0; // max = 0; // 不能使用0作为默认的最大值,因为数组中可能全是负数,都比0小

        // 2.遍历数组,拿出数组中的每个元素,都和较大值比较
        for (int i = 1; i < arr.length; i++) { // i = 1,2,3,4,5
            // i = 1; max(5) < arr[1](15);  max = arr[1](15);
            // i = 2; max(15) < arr[2](2000);  max = arr[2](2000);
            // i = 3; max(2000) < arr[3](10000);  max = arr[3](10000);
            // i = 4; max(10000) < arr[4](100);  false
            // i =5; max(10000) < arr[5](4000);  false
            // 拿出数组中的每个元素,都和较大值比较
            if (max < arr[i]) { // 取出的元素比max大
                max = arr[i]; // max就换成取出的元素
            }
        }

        System.out.println("最大值: " + max);
    }
}
