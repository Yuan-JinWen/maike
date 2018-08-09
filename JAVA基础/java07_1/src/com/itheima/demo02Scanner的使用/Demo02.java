package com.itheima.demo02Scanner的使用;


import java.util.Scanner;

/*
    看说明文档:
        1.看包: java.util
        2.看类的说明: 一个简单的文本扫描器，可以使用正则表达式解析原始类型和字符串
        3.看构造方法:
            Scanner​(InputStream source) 构造一个新的 Scanner ，产生从指定的输入流扫描的值。
        4.看普通方法:
            String next​(): 获取输入的字符串
            int nextInt​(): 获取输入的int数字

  面向对象就是找到对象调用其方法
      1.创建对象
      2.调用方法
 */
// 类名不要和Java已有的类名重复
public class Demo02 {
    public static void main(String[] args) {
        // 1.创建对象
        Scanner sc = new Scanner(System.in);

        // 2.调用方法
        String str = sc.next();
        System.out.println("输入的内容: " + str);

        int i = sc.nextInt();
        System.out.println("输入的内容2: " + i);
    }
}
