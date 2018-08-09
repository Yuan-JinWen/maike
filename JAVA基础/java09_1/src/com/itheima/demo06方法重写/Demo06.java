package com.itheima.demo06方法重写;

/*
    什么是方法重写(override): 子类定义一个和父类"一模一样"的方法
        一般来说,当子类和父类有相同的功能,但是子类的功能比父类的功能强大的时候重写父类的方法

     方法重写:
        1.2个类之间
        2.方法名相同
        3.返回值相同
        4.参数列表相同
        5.子类方法的权限大于等父类方法的权限

     方法的重载:
        同一个类中,方法名一样,参数列表不同.与返回值无关
 */
public class Demo06 {
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.callDispaly();
    }
}

/*
1. 老手机:
    发短信
    打电话
    来电显示(显示来电号码)
2. 智能手机:
    发短信
    打电话
    来电显示(显示来电号码,显示来电姓名,显示头像)
 */
// 老手机
class OldPhone {
    public void sendMessage() {
        System.out.println("发短信");
    }

    public void call() {
        System.out.println("打电话");
    }

    // 来电显示(显示来电号码)
    public void callDispaly() {
        System.out.println("显示来电号码");
    }
}
// public > protected
class NewPhone extends OldPhone {
    // 打电话,发短信给功能直接使用父类的
    // 子类写了一个和父类"一模一样"的方法
    // 子类重写父类的方法
    @Override // 检测方法是否是重写,不是重写就报错
    public void callDispaly() {
        // System.out.println("显示来电号码");
        // 调用父类的功能
        super.callDispaly();

        // 自己额外增加了功能
        System.out.println("显示来电姓名");
        System.out.println("显示来电头像");
    }
}