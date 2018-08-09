package com.itheima.demo13接口练习;

public class Demo13 {
    public static void main(String[] args) {
        // 创建 学生
        Student s = new Student();
        s.study();
        s.smoking();

        // 创建 老师
        Teacher t = new Teacher();
        t.teach();
        t.swimming();

        // 创建 工人
        Worker w = new Worker();
        w.moveZhuan();
        w.smoking();

        // 创建 司机
        Driver d = new Driver();
        d.drive();
        d.swimming();
    }
}
