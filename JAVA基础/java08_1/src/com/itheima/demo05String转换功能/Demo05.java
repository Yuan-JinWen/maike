package com.itheima.demo05String转换功能;

/*
    public char[] toCharArray () ：将此字符串转换为新的字符数组。
    public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。
    public String toLowerCase() ：使用默认语言环境的规则将此 String所有字符转换为小写。
    public String toUpperCase() ：将此 String所有字符转换为大写，使用默认语言环境的规则。
    public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使
    用replacement字符串替换
 */
public class Demo05 {
    public static void main(String[] args) {
        String str = "HelloWrold666";

        // public char[] toCharArray () ：将此字符串转换为新的字符数组。
        char[] chars = str.toCharArray();
        System.out.println("char[]" + chars); // jdk做的优化,char数组不是地址
        // 遍历数组
        for (int i = 0; i < chars.length; i++) {
            // 取出每个元素
            char c = chars[i];
            System.out.println(c);
        }

        System.out.println("------------");
        // public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i]; // 获取的是每个字符的ASCII码值
            System.out.println(b);
        }

        // public String toLowerCase() ：使用默认语言环境的规则将此 String所有字符转换为小写。
        String lowerCase = str.toLowerCase();
        System.out.println("str: " + str);
        System.out.println("lowerCase: " + lowerCase);
        // public String toUpperCase() ：将此 String所有字符转换为大写，使用默认语言环境的规则。
        String upperCase = str.toUpperCase();
        System.out.println("upperCase: " + upperCase);

        String str2 = "Hello ItHeima, I love ItHeima";
        // public String replace (CharSequence target, CharSequence replacement) ：将target使用replacement替换
        // CharSequence: 我们传入字符串即可
        String replace = str2.replace("ItH", "嘻嘻嘻");
        System.out.println("str2: " + str2); // str2: Hello ItHeima, I love ItHeima
        System.out.println("replace: " + replace); // replace: Hello 嘻嘻嘻eima, I love 嘻嘻嘻eima

    }
}
