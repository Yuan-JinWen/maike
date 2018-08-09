package com.itheima.demo15多态的好处;
/*
    模拟去食堂吃饭,学生,老师,工人,

 */
public class Demo15 {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        Worker w = new Worker();
        Police p = new Police();

        kaiFan(s);
        kaiFan(t);
        kaiFan(w);
        kaiFan(p);
    }

    // 多态通常用于参数传递的时候形成多态.可以传入任意子类.提高代码的扩展性
    // 模拟人来食堂吃饭,参数写父类.在参数传递的时候形成多态.可以传入任意子类都可以.
    // 提高代码的扩展性
    //      kaiFan(s)           Person p = s; Person p = new Student(); // 父类 变量名 = new 子类();多态
    //      kaiFan(t);          Person p = t; Person p = new Teacher(); // 父类 变量名 = new 子类();多态
    //      kaiFan(w);          Person p = w; Person p = new Worker();  // 父类 变量名 = new 子类();多态
    public static void kaiFan(Person p) {
        p.eat();
    }

    // 模拟人来食堂吃饭,参数写具体的类名.只能传递具体的一种类型.其他类型不能传入.需要好多重载方法
    // 如有再来警察,司机.需要再添加2个重写的faiFan方法.扩展性很差
    //                          Student s1 = s;  Student s1 = new Student();
/*    public static void kaiFan(Student s1) {
        s1.eat();
    }
    //                          Teacher t1 = t; Teacher t1 = new Teacher();
    public static void kaiFan(Teacher t1) {
        t1.eat();
    }
    //                          Worker w1 = w; Worker w1 = new Worker();
    public static void kaiFan(Worker w1) {
        w1.eat();
    }*/
}

// 人类/父类
abstract class Person {
    public abstract void eat();
}

// 学生
class Student extends Person {
    public void eat() {
        System.out.println("一边吃饭,一边学习");
    }
}

// 老师
class Teacher extends Person {
    public void eat() {
        System.out.println("一边吃饭,一边备课");
    }
}

// 工人
class Worker extends Person {
    public void eat() {
        System.out.println("一边吃饭,一边喝酒");
    }
}

class Police extends Person {
    public void eat() {
        System.out.println("一边吃饭,一边抓小偷");
    }
}