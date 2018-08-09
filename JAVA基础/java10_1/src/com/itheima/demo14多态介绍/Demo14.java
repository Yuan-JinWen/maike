package com.itheima.demo14多态介绍;

/*
    什么是多态: 一类事物的多种形态 H20 (水/冰/水蒸气)
        你要打出租车: 给你奔奔牌出租车,丰田牌出租车,奔驰牌出租车
        你要相亲(女的/活的): 范冰冰,凤姐,如花

    多态的前提:
        1.要有继承关系
        2.要有方法的重写

    多态的格式:
        父类/接口 变量名 = new 子类();

    重要:多态走子类重写方法

    多态看父类是否有这个方法,如果有,走子类重写方法
    如果父类没有这个方法,报错

    多态的缺点,只能调用父类的方法,不能调用子类特有的方法
 */
public class Demo14 {
    public static void main(String[] args) {
        // 父类/接口 变量名 = new 子类();
        Animal a = new Dog();
        a.eat(); // 多态走子类重写方法
        // a.lookHome();

        Animal c = new Cat();
        c.eat();
        // c.catchMouse(); // 不能调用子类特有的方法
    }
}

// 动物/父类
abstract class Animal {
    public abstract  void eat();
}

// Dog/子类
class Dog extends Animal {

    public void eat() {
        System.out.println("狗吃骨头...");
    }

    // 看家
    public void lookHome() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }

    public void eat() {
        System.out.println("猫吃鱼");
    }
}