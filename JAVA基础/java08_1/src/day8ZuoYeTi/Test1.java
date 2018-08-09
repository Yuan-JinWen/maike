package day8ZuoYeTi;

//1.请使用任意3种构造方法创建3个字符串,直接输出字符串对象的内容。

import java.sql.SQLOutput;


public class Test1 {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("str1:"+str1);

        String str2 = new String("Hello");
        System.out.println("str2:"+str2);

        char[] value ={'H','e','l','l','o'};// 字符数组
        String str3 = new String(value);    // 创建对象,将字符数组value赋值给str3 并串连
        System.out.println("str3:"+str3);

        byte [] bytes = {89,90,65,73,89};
        String str4 = new String(bytes);
        System.out.println("str4:"+str4);

        String str5 = new String (bytes,0,3);
        System.out.println("str5:"+str5);

    }
}
