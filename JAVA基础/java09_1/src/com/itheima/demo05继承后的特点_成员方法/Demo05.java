package com.itheima.demo05继承后的特点_成员方法;

public class Demo05 {
    public static void main(String[] args) {
        // 成员方法不重名
        Zi z = new Zi();
        z.show1();
        z.show2();

        System.out.println("--------------");
        // 成员方法重名
        Zi2 z2 = new Zi2();
        z2.show3();
    }
}

// -------------------成员方法重名-----------------------
// 就近原则(子类自己有就用子类自己的,子类没有就用父类的): 子类成员方法 -> 父类的成员方法
class Fu2 {
    // 方法声明, 方法体
    public void show3() {
        System.out.println("Fu2 show3");
    }
}

class Zi2 extends Fu2 {
    public void show3() {
        System.out.println("Zi2 show3");
    }
}

// -------------------成员方法不重名-----------------------
class Fu {
    public void show1() {
        System.out.println("fu show1");
    }
}

class Zi extends Fu {
    public void show2() {
        System.out.println("Zi show2");
    }
}