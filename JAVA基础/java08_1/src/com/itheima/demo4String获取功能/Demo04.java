package com.itheima.demo4String获取功能;

/*
    int length​() 返回此字符串的长度。
    String concat​(String str) 将指定的字符串连接到该字符串的末尾。
    char charAt​(int index) 返回指定索引处的 char值。
    int indexOf​(int ch) 返回指定字符第一次出现的字符串内的索引。
    String substring​(int beginIndex) 返回一个字符串，该字符串是此字符串的子字符串。
    String substring​(int beginIndex, int endIndex) 返回一个字符串，该字符串是此字符串的子字符串。

    属性没有(): 数组的属性: arr.length
    方法有(): 字符串的方法: str.length()

    字符串是不可变的.调用方法后对字符串操作,产生一个新的字符串返回,不会改变老的字符串
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr.length);
        //            012345678910111213
        String str = "helloworld中国天朝";
        //                   or
        // int length​() 返回此字符串的长度。中文也算一个
        System.out.println("length: " + str.length());

        // String concat​(String str) 将指定的字符串连接到该字符串的末尾。
        // String str3 = str + "你好";
        String str2 = str.concat("你好");
        System.out.println("str: " + str); // str: helloworld中国天朝
        System.out.println("str2: " + str2); // str2: helloworld中国天朝你好

        // char charAt​(int index) 返回指定索引处的 char值。
        System.out.println("charAt:" + str.charAt(3)); // l
        System.out.println("charAt:" + str.charAt(4)); // o
        System.out.println("charAt:" + str.charAt(5)); // w
        System.out.println("charAt:" + str.charAt(6)); // o

        // public int indexOf(String str) 返回第一次出现参数字符串的索引位置
        //
        System.out.println("indexOf: " +  str.indexOf("e")); // 1
        System.out.println("indexOf: " +  str.indexOf("o")); // 4
        System.out.println("indexOf: " +  str.indexOf("or")); // 6
        System.out.println("indexOf: " +  str.indexOf("ak")); // -1:表示没有找到

        //               012345678910111213
        // String str = "helloworld中国天朝";
        // String substring​(int beginIndex) 截取一个子字符串
        // int beginIndex: 从哪里开始砍断,直到结尾

        String substring = str.substring(6); // 老的字符串(str)是不会变的,操作后返回一个新的字符串
        System.out.println("str: " + str); // str: helloworld中国天朝
        System.out.println("substring: " + substring); // substring: orld中国天朝

        // String substring​(int beginIndex, int endIndex) 截取一个子字符串
        // int beginIndex: 从哪里开始砍断(包含头)
        // int endIndex: 到哪里结束(不包含尾)
        System.out.println("substring: " + str.substring(2, 8)); // substring: llowor
    }
}
