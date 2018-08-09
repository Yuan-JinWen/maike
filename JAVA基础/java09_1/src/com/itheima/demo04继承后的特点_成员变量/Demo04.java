package com.itheima.demo04继承后的特点_成员变量;

public class Demo04 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.test();

        System.out.println("----------");
        Zi2 z2 = new Zi2();
        z2.test2();
    }
}

// ----------------------成员变量重名(少)----------------------------
// 就近原则:    局部变量 -> 子类成员变量 -> 父类成员变量
// this.name 表示本类成员变量
// super.name 表示父类成员变量
// super就表示父类
class Fu2 { // 父类/超类/基类
    String name = "凤姐";
}

class Zi2 extends Fu2 {
    String name = "如花";

    public void test2() {
        String name = "翠花";
        System.out.println(name); // 翠花
        System.out.println(this.name); // 如花
        System.out.println(super.name); // 凤姐
    }
}


// ----------------------成员变量不重名(多)----------------------------
class Fu {
    String name1 = "凤姐";
}

class Zi extends Fu {
    String name2 = "如花";

    public void test() {
        System.out.println(name1);
        System.out.println(name2);
    }
}