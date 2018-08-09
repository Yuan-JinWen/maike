package com.itheima.demo08ArrayList简单实用;

import java.util.ArrayList;

/*
    看说明文档:
        1.看包: java.util
        2.看类的说明: 可调整大小的数组实现.可以增加和删除元素
        3.看构造方法:
            ArrayList​(): 创建一个ArrayList
        4.看普通方法:
            boolean add​(E e) 将指定的元素追加到此列表的末尾。

    ArrayList<E>: <E>叫做泛型(就业班会详细讲解),要存储什么类型的数据,E就写什么
 */
public class Demo08 {
    public static void main(String[] args) {
        // 1.创建对象
        // ArrayList<String> list = new ArrayList<String>();
        // JDK1.7后右边可以省略直接写<>即可
        ArrayList<String> list = new ArrayList<>();

        // 2.调用方法
        list.add("张三");
        list.add("秀");
        list.add("天秀");

        System.out.println(list); // [张三, 秀, 天秀],输出的不是地址.因为作为特殊的操作
    }
}
