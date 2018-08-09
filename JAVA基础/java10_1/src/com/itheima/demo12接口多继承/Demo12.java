package com.itheima.demo12接口多继承;
/*
    Java中有多继承吗?
        1.类只能单继承
        2.接口可以多继承
 */
public class Demo12 {
    public static void main(String[] args) {

    }
}

interface Father {
    public abstract void makeMoney();
}

interface Mother {
    public abstract void shopping();
}

// 一个接口继承了其他多个接口
interface Brother extends Father, Mother { // java源代码中可能有
    public abstract void lol();
}

class Son implements Brother {

    public void makeMoney() {

    }

    public void shopping() {

    }

    public void lol() {

    }
}
