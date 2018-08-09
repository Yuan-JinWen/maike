package com.itheima.demo08class作为成员变量;
// 衣服
public class Armour {
    // 衣服名称
    private String name;

    // 衣服防御力
    private int protect;

    public Armour() {
    }

    // 满参构造
    public Armour(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
