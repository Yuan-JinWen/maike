package com.itheima.demo11JavaBean;

/*
    定义一个类,描述猫
    JavaBean 是 Java语言编写类的一种标准规范(5部分)
        1.类需要是公开的
        2.私有成员变量
        3.无参构造(必须的)
        4.有参构造(建议)
        5.成员变量提供getXxx/setXxx
 */
// 1.类需要是公开的
public class Cat {
    // 2.私有成员变量
    private String name;
    private double weight;
    private String color;
    private String type;

    // 快捷键: alt + insert (fn+enter)
    // 3.无参构造(必须的)
    public Cat() {
    }

    // 4.有参构造(建议)
    public Cat(String name, double weight, String color, String type) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.type = type;
    }

    // 5.成员变量提供getXxx/setXxx
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
