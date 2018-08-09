package day07ZuoYe;
/*
1.请写出引用类型的使用步骤
        创建对象
        如 Scanner sc = new Scanner(System.in);
        调用方法
        int I = sc.next();
        System.out.println(i);

        2.使用代码完成：键盘录入三个数据获取最大值
*/

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int i = sc.nextInt();
        System.out.println("请输入第二个数据:");
        int a = sc.nextInt();
        System.out.println("请输入第三个数据:");
        int b = sc.nextInt();
        int max = i ;
         if (i > a ){
             max= i;
         }
         if (max >b){
             max=max;
         }
         System.out.println(max);

    }
}
