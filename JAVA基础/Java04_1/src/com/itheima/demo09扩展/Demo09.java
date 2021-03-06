package com.itheima.demo09扩展;

/*
1*1=1
1*2=2	2*2=4
1*3=3	2*3=6	3*3=9
1*4=4	2*4=8	3*4=12	4*4=16
1*5=5	2*5=10	3*5=15	4*5=20	5*5=25
1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36
1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49
1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64
1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81



1*
2*	*
3*	*	*
4*	*	*	*
5*	*	*	*	*
6*	*	*	*	*	*
7*	*	*	*	*	*	*
8*	*	*	*	*	*	*	*
9*	*	*	*	*	*	*	*	*

*********
*********
*********
*********
*********
*********
*********
*********
*********
*********

分析:
    1.有9行,9列.的**
    2.我们先打印出9行9列的**

 */
public class Demo09 {
    public static void main(String[] args) {
        print99(9);
    }

    public static void print99(int n) {
        for (int i = 1; i <= n; i++) { // 外循环控制行

            // j < 几每行就会出现几个**,所以j<?, ?不能写死.和行有有关
            for (int j = 1; j <= i; j++) { // 内循环控制列
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }

            // 一行打了9颗星就要换行
            System.out.println();
        }
    }
}
