package com.itheima.demo07匿名内部类;
// 游泳接口
interface Swimmable {
    // 抽象的游泳方法
    public abstract void swimming();
}

// .定义一个类实现接口
class Student implements Swimmable {
    // 2.重写抽象方法
    public void swimming() {
        System.out.println("学生...狗刨式蛙泳...");
    }
}
/*
    接口的使用:
        1.定义一个类实现接口
        2.重写抽象方法
        3.创建实现类对象

        这种方式有点繁琐.使用匿名内部类

    匿名内部类格式:
        new 父类/接口() {
            // 重写方法;
        }.调用方法();

    匿名内部类的作用:简写代码

    匿名内部类的本质:
        1.定义了一个没有名字的类
        2.这个没有名字的类实现了接口
        3.创建这个没有名字的类的对象
        4.对象调用了方法
 */


public class Demo07 {
    public static void main(String[] args) {
        // 3.创建实现类对象
        Student s = new Student();
        s.swimming();
        System.out.println("------------");

        // 使用匿名内部类
        new Swimmable() {
            // 重写抽象方法
            public void swimming() {
                System.out.println("匿名内部类...裸泳...");
            }
        }.swimming();

        // 如果想调用2次方法.需要记住名字
        // 接口  变量名 = new 接口实现类(); // 多态
        Swimmable sw = new Swimmable() {
            public void swimming() {
                System.out.println("....自由泳...6666");
            }
        };

        System.out.println("------------");
        sw.swimming(); // 多态走接口的实现类中方法
        sw.swimming();

        // goSwimming(s);
        // goSwimming(sw);

        // 直接在参数这里创建一个匿名内部类
        goSwimming(new Swimmable() {
            public void swimming() {
                System.out.println("蛙泳");
            }
        });

        // 匿名内部类作为参数传递
        // 直接在参数这里创建一个匿名内部类.减少代码
        goSwimming(new Swimmable() { // Swimmable接口的实现类对象
            public void swimming() {
                System.out.println("美女...裸泳+仰泳");
            }
        });

        // lambda:更简单
    }

    // 匿名内部的使用场景: 模拟请一批会游泳的人去游泳
    public static void goSwimming(Swimmable s) { // 参数写接口,可以传入任意实现类对象
//        System.out.println(s);
        s.swimming();
    }
}
