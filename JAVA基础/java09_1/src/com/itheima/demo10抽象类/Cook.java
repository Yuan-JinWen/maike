package com.itheima.demo10抽象类;

public class Cook extends Employee {

    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("厨师炒菜多加点盐,为自己带盐...");
    }
}
