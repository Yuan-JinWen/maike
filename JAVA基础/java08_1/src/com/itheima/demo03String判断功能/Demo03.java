package com.itheima.demo03String判断功能;

/*
    boolean equals​(Object anObject) 将此字符串与指定对象进行比较。
    boolean equalsIgnoreCase​(String anotherString) 将此 String与另一个 String比较，忽略案例注意事项。
    boolean startsWith​(String prefix, int toffset) 判断是否已指定字符串开头
    boolean endsWith​(String suffix) 判断是否已指定字符串结尾
 */
public class Demo03 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "Hello";

        // 1.boolean equals​(Object anObject) 比较字符串内容是否相等
        boolean b = str1.equals(str2);
        System.out.println("equals: " + b);
        // equals​比较内容会区分大小写
        System.out.println("equals: " + str1.equals(str3)); // false

        // boolean equalsIgnoreCase​(String anotherString) 忽略大小写比较字符串
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str3)); // true

        // boolean startsWith​(String prefix, int toffset) 判断是否已制定字符串开头
        System.out.println("startsWith: " + str1.startsWith("he")); // true
        System.out.println("startsWith: " + str1.startsWith("o")); // false

        // boolean endsWith​(String suffix) 判断是否已指定字符串结尾
        System.out.println("endsWith: " + str1.endsWith("o")); // true
        System.out.println("endsWith: " + str1.endsWith("oo")); // false
    }
}
