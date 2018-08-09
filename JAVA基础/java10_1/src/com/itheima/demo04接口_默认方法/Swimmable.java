package com.itheima.demo04接口_默认方法;
/*
    默认方法和普通方法一样,在返回值前面多添加一个default
    修饰符 default 返回值类型 方法名(参数) {
        // 代码
    }
 */
public interface Swimmable {
    // 默认方法
    public default void swimming() {
        System.out.println("默认方法... 狗刨式");
    }
}
