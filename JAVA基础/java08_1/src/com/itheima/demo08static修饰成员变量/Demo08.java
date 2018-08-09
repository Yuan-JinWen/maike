package com.itheima.demo08static修饰成员变量;

/*
    static:表示静态
    static可以修饰成员变量和成员方法
    static修饰成员变量: static 数据类型 变量名 = 值;

    什么样的变量适合定义为静态的?:这个类公共的
        教室,公交车,共享单车,音箱,空调.老师
 */
public class Demo08 {
    public static void main(String[] args) {
        // 创建对象
        Chinese c1 = new Chinese("范冰冰", 20);
        c1.country = "中国";
        c1.show();

        Chinese c2 = new Chinese("李冰冰", 25);
        // c2.country = "中国";
        c2.show();

        Chinese c3 = new Chinese("凤姐", 21);
        // c3.country = "中国";
        c3.show();

        System.out.println("-----------");
        c3.country = "美国";
        c1.show();
        c2.show();
        c3.show();
    }
}
