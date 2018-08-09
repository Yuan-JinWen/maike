package com.itheima.demo08class作为成员变量;

public class Demo08 {

    public static void main(String[] args) {
        // 创建武器: 裁决之杖,
        Weapon w = new Weapon("屠龙刀", 99999);

        // 创建衣服:
        Armour a = new Armour("三级甲", 15000000);

        // 创建角色
        Role r = new Role(1, 100, "渣渣辉", w, a);
        r.attack();
        r.wear();
    }
}
