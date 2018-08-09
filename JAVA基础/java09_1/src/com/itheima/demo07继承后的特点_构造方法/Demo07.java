package com.itheima.demo07继承后的特点_构造方法;

/*
    继承后子类的构造方法都会先走父类的无参构造

    1.为什么需要先走父类的构造方法
        因为父类中可能会有成员变量.需要使用父类的构造方法给父类的成员变量赋值

    2.为什么走父类无参构造不走父类有参构造
        Java是95年的时候就设计好了.那个时候不知道我们今天会写什么样的构造方法.但是系统默认会提供无参构造.所以就执行无参构造

    3.子类构造方法是如何执行到父类的无参构造方法
        在子类构造方法第一行默认有super(); 不写也有

        super(); 表示调用父类的无参构造
        super(参数...); 调用父类的有参构造

        super():只能放在构造方法的第一行

    继承后子类构造方法的标准写法:
        1. 子类的有参构造调用父类的有参构造,父类中的成员变量使用父类去赋值
        2. 类中的成员变量,子类自己赋值
 */
public class Demo07 {
    public static void main(String[] args) {
        /*
        使用子类无参构造创建对象
            父类无参构造 Person()
            子类无参构造: Student()
         */
//        Student s1 = new Student();

         /*
        使用子类有参构造创建对象
            父类无参构造 Person()
            子类有参构造: Student(String name, int age, double score)
         */
        Student s1 = new Student("凤姐", 18, 99);
        s1.show();
    }
}