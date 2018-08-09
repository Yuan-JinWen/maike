package com.itheima.demo03子类不能使用的内容;

/*
    子类不能继承父类的构造方法: 构造方法名和类名一样,父类和子类类名肯定不一样
    父类中私有的内容子类不能直接拿来用
    对于私有的成员变量需要提供getXXX/setXxx方法让子类访问
 */
public class Demo03 {
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println(z.num1);
        // System.out.println(z.num2); // 父类私有的成员变量子类不能直接拿来用
        z.show1();
        // z.show2(); // 父类中私有的方法子类不能直接拿来用

        z.setNum2(666);
        System.out.println(z.getNum2());
    }
}

class Fu {
    int num1 = 10;
    private int num2 = 20;

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void show1() {
        System.out.println("Fu show1");
    }

    private void show2() {
        System.out.println("Fu show2");
    }

    public Fu() {
    }
}

class Zi extends Fu {
    // class Zi extends Fu{
    public Zi() {
        // public Zi
    }
}