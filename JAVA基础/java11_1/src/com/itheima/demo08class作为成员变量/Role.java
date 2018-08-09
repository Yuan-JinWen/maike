package com.itheima.demo08class作为成员变量;
// 角色
public class Role {
    // 角色id
    private int id;

    // 角色血量
    private int blood;

    // 角色名字
    private String name;

    // 成员变量的格式: 数据类型 变量;
    // 角色拥有武器
    private Weapon weapon; // w: new Weapon("屠龙刀", 99999);
    // 成员变量是类名,实际保存这个类的对象
    // 将对象也看做一个值
    // 数据类型 变量名 = 值;

    // 角色拥有衣服
    private Armour armour; // a new Armour("三级甲", 150);
    // 成员变量是类名,实际保存这个类的对象

    // 普通方法:攻击
    public void attack() {
        System.out.println(name + " 使用 " + weapon.getName() + "造成" + weapon.getHurt() + "伤害");
    }

    // 普通方法:穿衣服
    public void wear() {
        System.out.println(name + "穿上了 " + armour.getName() + "增加了 " + armour.getProtect() + "防御");
    }

    public Role() {
    }

    // 参数是类名需要传这个类的对象
    public Role(int id, int blood, String name, Weapon weapon, Armour armour) {
        this.id = id;
        this.blood = blood;
        this.name = name;
        this.weapon = weapon;
        this.armour = armour;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }
}
