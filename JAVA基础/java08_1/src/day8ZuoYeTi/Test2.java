package day8ZuoYeTi;
/*
2.请说出"通过构造方法创建字符串对象"和"直接赋值创建字符串对象"的区别.
	String str1 = "hello";
	String str2 = new String("hello");
 */
public class Test2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1==str2);
        // 通过构造方法创建字符串对象,创建出来的是地址值.是在堆里,
        // 而直接赋值创建字符串对象,是保存在栈里.
        // 一个是字符串,一个是含字符串的地址值,所以打印输出的结果是false.
    }
}
