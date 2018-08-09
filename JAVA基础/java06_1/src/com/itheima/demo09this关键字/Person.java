package com.itheima.demo09this关键字;

public class Person {
    private String name;
    private int age;

    // 设置属性setXxx()
    // 方法名可以随便去,但是要见名知意set方法名
    // (String name): 方法参数是局部变量.
    // private String name;成员变量
    // 当局部变量和成员变量同名时,使用局部变量(就近原则)
    //
    public void setName(String name) {
        // 谁调用这个方法,方法中的this就是谁
        System.out.println("this = " + this);
        this.name = name;
    }


    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("年龄不合法...");
        } else {
            // 符合要求的年龄才赋值
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
