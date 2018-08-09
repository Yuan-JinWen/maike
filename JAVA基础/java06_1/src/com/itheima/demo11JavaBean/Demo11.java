package com.itheima.demo11JavaBean;

public class Demo11 {
    public static void main(String[] args) {
        // 使用无参构造
        Cat c1 = new Cat();
        // 使用set赋值
        c1.setName("流浪猫");
        c1.setColor("黑黝黝");
        c1.setWeight(2);
        c1.setType("野生的");

        System.out.println(c1.getName() + " , " + c1.getColor() + " , " + c1.getWeight() + "," + c1.getType());

        // 使用有参构造,直接赋值
        Cat c2 = new Cat("咖菲猫", 2, "咖啡色", "家养");
        System.out.println(c2.getName() + " , " + c2.getColor() + " , " + c2.getWeight() + "," + c2.getType());
    }
}
