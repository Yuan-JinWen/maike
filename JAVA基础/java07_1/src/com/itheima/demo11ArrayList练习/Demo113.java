package com.itheima.demo11ArrayList练习;

import java.util.ArrayList;

/*
    定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。格式参照 {元素@元素@元素}

    分析:
        1.定义一个集合存储一些元素
        2.定义一个方法用于打印成指定格式
            2.1.在方法中遍历拿到传入集合中的所有元素
            2.2.按照格式拼接
 */
public class Demo113 {
    public static void main(String[] args) {
        // 1.定义一个集合存储一些元素
        ArrayList<String> list = new ArrayList<>();
        list.add("貂蝉");
        list.add("西施");
        list.add("杨玉环");
        list.add("王昭君");

        printArrayList(list);
    }

    // 2.定义一个方法用于打印成指定格式
    /*
        {元素@元素@元素}

        1.先要一个{
        2.如果是最后一个元素,元素拼接}
        3.如果不是最后一个元素,元素拼接@
     */
    public static void printArrayList(ArrayList<String> arr) {
        // {貂蝉@西施@杨玉环@王昭君}
        String str = "{";
        // str = "{";
        for (int i = 0; i < arr.size(); i++) { // 集合有size()个元素,索引最大只能size() - 1
            if (i == arr.size() - 1) {
                // 最后一个元素
                // i = 3 str = "{貂蝉@西施@杨玉环@王昭君}"
                str += arr.get(i) + "}";
            } else {
                // i = 0 str = "{貂蝉@"
                // i = 1 str = "{貂蝉@西施@"
                // i = 2 str = "{貂蝉@西施@杨玉环@"
                str = str + arr.get(i) + "@";
                // str += arr.get(i) + "@";
            }
        }

        System.out.println(str);
    }
}
