package com.itheima.demo06String分割功能;

/*
    String[] split​(String regex) 将此字符串拆分为给定的 regular expression的匹配。

    不要求你记住方法名,要求记住功能名
 */
public class Demo06 {
    public static void main(String[] args) {
        String str = "马云,马化腾,马冬梅,马蓉";

        String[] strings = str.split(","); // => {"马云", "马化腾", "马冬梅", "马蓉"}
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            System.out.println(s);
        }
    }
}
