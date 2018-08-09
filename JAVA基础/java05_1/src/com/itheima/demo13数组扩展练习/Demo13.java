package com.itheima.demo13数组扩展练习;

import java.util.Scanner;

/*
    有一个编程比赛,有5个评委给选手打分.取消最高分和最低分的平均分就是这个选手的最后得分,这5个评委的打分使用键盘录入(1-100)

    分析:
        1.5个评分是同一种数据,使用数组保存比较方便,定义数组长度为5,元素类型为int
        2.循环录入评委的发评分
        3.找出最高分和最低分
        4.计算去掉最高分和最低分的总分(剩余3个人的分数)
        5.求平均分
 */
public class Demo13 {
    public static void main(String[] args) {
        // 1.定义数组长度为5,元素类型为int
        int[] arr = new int[5];

        // 2.创建键盘录入
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请录入第一个评委的分数(1-100):");
        arr[0] = sc.nextInt(); // 60

        System.out.println("请录入第二个评委的分数(1-100):");
        arr[1] = sc.nextInt(); // 70

        System.out.println("请录入第三个评委的分数(1-100):");
        arr[2] = sc.nextInt(); // 70

        System.out.println("请录入第四个评委的分数(1-100):");
        arr[3] = sc.nextInt(); // 70

        System.out.println("请录入第五个评委的分数(1-100):");
        arr[4] = sc.nextInt(); // 70*/
        for (int i = 0; i < arr.length; i++) {  
            System.out.println("请录入第" + (i + 1) + "个评委的分数(1-100):");
            arr[i] = sc.nextInt();
        }

        // 建议做好一大步,先验证保证这步没有问题,再往下面做.
        // 遍历看看录入的分数
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }*/

        // 3.找出最高分和最低分
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // 获取最大值
            if (max < arr[i]) {
                max = arr[i];
            }

            // 获取最小值
            if (min > arr[i]) {  
			// if(max<arr[i] ) { max =arr[i];}
                min = arr[i];
            }
		
            // 求总分
            sum += arr[i];
        }

        // 计算平均分 = 3个评委的分数 / 人数
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.println("最终得分:  "+ avg);
    }
}
