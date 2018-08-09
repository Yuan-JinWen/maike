package com.itheima.demo08封装;

public class Person {
    private String name;
    private int age;

    // 设置属性setXxx()
    // 方法名可以随便去,但是要见名知意set方法名
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        if (a < 0 || a > 150) {
            System.out.println("年龄不合法...");
        } else {
            // 符合要求的年龄才赋值
            age = a;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
