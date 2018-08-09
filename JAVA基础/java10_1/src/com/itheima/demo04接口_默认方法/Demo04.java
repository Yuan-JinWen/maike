package com.itheima.demo04接口_默认方法;
/*
    默认方法和普通方法一样,在返回值前面多添加一个default
    修饰符 default 返回值类型 方法名(参数) {
        // 代码
    }

    默认方法:
        1.实现类可以直接拿来用
        2.实现类可以重写默认方法 (去掉default)
 */
public class Demo04 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.swimming();

        Girl g = new Girl();
        g.swimming();
    }
}
