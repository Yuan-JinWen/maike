package day9ZuoYeTi.Test2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        QunZhu qz = new QunZhu("老头子",1000);
        // 设置群主name 余额
        qz.show();
        //调用方法 显示
        Member m1 = new Member("王二",188);//创建三个接收红包对象,并设置余额
        Member m2 = new Member("张三",688);
        Member m3 = new Member("李四",888);
        m1.show();
        m2.show();// 调用方法显示
        m3.show();
        System.out.println("--------------------------------");
        ArrayList<Double>hongBao = qz.faHongBao(300,3);
         // 创建集合 list <数据类型> 变量= 调用qz.发红包的方法并设置金额和个数
        // 执行发红包方法

        System.out.println("发红包"+hongBao);

        qz.show();
        //调用显示方法


        m1.shouHongBao(hongBao);
        m2.shouHongBao(hongBao);
        m3.shouHongBao(hongBao);
            // 调用收红包的方法
        m1.show();
        m2.show();
        m3.show();
    }
}
