package com.itheima.demo09ArrayList常用方法和遍历;

import java.util.ArrayList;

/*
    ArrayList常用方法:
        1. boolean add​(E e) 将指定的元素追加到此列表的末尾。
        2. E get​(int index) 返回此列表中指定位置的元素。
        3. E remove​(int index) 删除该列表中指定位置的元素。
        4. E set​(int index, E element) 用指定的元素替换此列表中指定位置的元素。
        5. int size​() 返回此列表中的元素数。
 */
public class Demo09 {
    public static void main(String[] args) {
        // 1.创建ArrayList对象
        ArrayList<String> list = new ArrayList<>();

        // 2.add 添加数据
        list.add("秀");
        list.add("天秀");
        list.add("陈独秀");
        list.add("蒂花之秀");

        //  2. E get​(int index) 返回此列表中指定位置的元素。
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        // 3. E remove​(int index) 删除该列表中指定位置的元素。
        String remove = list.remove(0);
        System.out.println("remove: " + remove);

        System.out.println(list); // [天秀, 陈独秀, 蒂花之秀]
        // 4. E set​(int index, E element) 用指定的元素替换此列表中指定位置的元素。
        String set = list.set(1, "李大钊,浙江周树人..");
        System.out.println("set: " + set);
        System.out.println(list);

        // 5.int size​() 返回此列表中的元素数。
        System.out.println(list.size());

        System.out.println("----------");
        // 遍历ArrayList中的所有元素
        /*System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));*/
        /*for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }*/

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
