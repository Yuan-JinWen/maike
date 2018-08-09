package com.itheima.demo04Random类;

import java.util.Random;

/*
        看说明文档:
        1.看包: java.util
        2.看类的说明: 该类的实例用于生成伪随机数
        3.看构造方法:
            Random​() 创建一个新的随机数生成器。
        4.看普通方法:
            int nextInt​() 从这个随机数生成器的序列返回下一个伪随机数，均匀分布的 int值。-2147483648~2147483647
            int nextInt​(int bound) 产生一个0到bound之间的随机数包含0,不包含bound, [0, bound)
 */
public class Demo04 {
    public static void main(String[] args) {
        // 1.创建对象
        Random ran = new Random();

        // 2.调用方法
        int i = ran.nextInt();
        // System.out.println("随机数1: " + i);

        for (int j = 0; j < 20; j++) {
            int i1 = ran.nextInt(10);
            System.out.println("随机数2: " + i1);
        }
    }
}
