package com.itheima.demo10构造方法;

/*
    我们在创建对象的时候能不能就给值呢?可以的.通过构造方法

    构造方法作用:在new (创建对象)的时候给成员变量赋值

    构造方法也是一个方法,只是有点特别
        构造方法2个特点:
            1.构造方法名称和类名一样
            2.构造方法没有返回值,连void都不能写

        构造方法注意事项:
            1.我们没有写构造方法系统会提供一个默认的无参构造方法(免费赠送)
                    public 类名() {
                    }
            2.如果我们写了构造方法,默认的构造方法不没有了

    构造方法可以给成员变量赋值,setXxx也可以给成员变量赋值.
         构造方法赋值只有一次机会,就是在new对象的时候
         setXxx,可以多次调用赋值

    建议:当你写了有参构造方法的时候,也补上无参构造方法,别人就有多种方式创建对象
 */
public class Demo10 {
    public static void main(String[] args) {
        Dog d0 = new Dog();
        // new关键字,在堆中开辟一块空间
        Dog d1 = new Dog("二狗", 1); // 刚创建的狗没有姓名和年龄
        // 假设有10000行代码,有可能忘记赋值

        // 后面设置姓名和年龄
//        d1.setName("旺财");
        // d1.setAge(2);
        System.out.println(d1.getName() + " , " + d1.getAge());
        d1.setName("三狗");
        d1.setName("五狗");
        d1.setName("狗狗狗");
    }
}
