package com.itheima.demo11静态代码块;

import java.util.ArrayList;

/*
    什么是静态代码块:
        被static修饰的代码块
    静态代码块的位置: 类中方法外
    静态代码块在类加载的时候执行(在第一次创建对象前执行,只会走一次)
    静态代码块适合给静态的成员变量赋值
 */
public class Demo11 {
    public static void main(String[] args) {
        GameRoom g1 = new GameRoom();
        GameRoom g2 = new GameRoom();
        GameRoom g3 = new GameRoom();
        GameRoom g4 = new GameRoom();
    }
}

class GameRoom {
    private static ArrayList<String> str = new ArrayList<>();

    // 类中方法外
    static {
        // 在静态代码块中赋值一次
        System.out.println("我是静态代码块...");
        str.add("张三");
        str.add("李四");
        str.add("王五");
    }

    public GameRoom() {
        System.out.println("我是构造方法GameRoom()");
        System.out.println(str);
    }

    public void show() {
        System.out.println("xixi");
    }
}
