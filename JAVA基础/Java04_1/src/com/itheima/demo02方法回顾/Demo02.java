package com.itheima.demo02方法回顾;
/*
    回顾方法
 */
public class Demo02 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // 打印3行5列的**
        for (int i = 0; i < 3; i++) { // 外循环控制行数

            for (int j = 0; j < 5; j++) { // 内循环控制列
                System.out.print("*");
            }

            // 打完一行才换行
            System.out.println();
        }
    }
}
