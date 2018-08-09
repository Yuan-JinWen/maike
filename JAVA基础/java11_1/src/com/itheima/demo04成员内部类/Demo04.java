package com.itheima.demo04成员内部类;
/*
    内部类的分类:按位置分
        1.成员内部类:类中方法外
        2.局部内部类:方法中


    成员内部类格式:类中方法外
    class 外部类名 {
        // 成员变量
        // 成员方法

        class 内部类名 {
            // 成员变量
            // 成员方法
        }
    }

    内部类的好处:可以直接访问外部类的成员(成员变量,和成员方法)
    成员内部类编译后:外部类名$内部类名.class
 */
class Body {
    boolean isLive = true;
    public void walk() {
        System.out.println("666的走...");
    }
    // 成员内部类格式:类中方法外
    class Heart {
        private String color = "红黑色";

        public void jump() {
            if (isLive) {
                System.out.println("心脏在跳动");
                walk();
            } else {
                System.out.println("over...");
            }
        }
    }
}

public class Demo04 {
    public static void main(String[] args) {
        // 内部类的创建格式1(只能用内部类): 外部类名.内部类名 变量名 = new 外部类名().new 内部类名();
        // Body.Heart heart = new Body(). new Heart();
        // System.out.println(heart);
        // heart.jump();

        // 内部类的创建格式1(先创建外部类对象,才创建内部类对象): 推荐使用
        // 外部类名 外部类对象名 = new 外部类名();
        // 外部类名.内部类名 变量名 = 外部类对象名.new 内部类名();
        Body b = new Body();
        Body.Heart h = b.new Heart();

        h.jump();
        b.isLive = false;
        h.jump();
    }
}


class A { // 外部类

    class B { // 内部类

    }
}

class Person {
}

class Student {
}