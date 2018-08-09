package com.itheima.demo10抽象类;
/*
    abstract关键字: 表示抽象

    抽象方法的格式:
        修饰符 abstract 返回值类型 方法名();

        和普通方法相比,有2点不同:
            1.返回值前面添加abstract
            2.将{}去掉换成;

    抽象类的格式:
        abstract class 类名 {

        }
 */

// 员工类
public abstract class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 抽象方法(工作)
     public abstract void work();

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
