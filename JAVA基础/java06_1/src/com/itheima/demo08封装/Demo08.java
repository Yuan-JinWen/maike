package com.itheima.demo08封装;

/*
    现实生活中的人类:
        属性:姓名, 年龄, 性别, 身高, 体重, 钱, 银行卡

        人的所有属性会暴露在外面吗?为了安全起见,有些属性是会隐藏起来的.

        封装原则:
            将不需要暴露的内容隐藏起来.提供对应方法给别人使用

        如何隐藏内容?
            使用private, private表示私有
            1.private是一个关键字
            2.private修饰的内容只有本类可以使用
            3.提供获取属性getXxx()和设置属性setXxx()的方法

            格式: private 数据类型 变量名;

        在setXxx方法中,我们可以对传入的参数进行判断.合法的数据就设置,不合法的数据就拦截不要了(提高了安全性)

        总结封装的步骤:
            1.将成员变量私有
            2.提供getXxx和setXxx方法
            3.外部使用getXxx和setXxx方法
 */
public class Demo08 {
    public static void main(String[] args) {
        Person p = new Person();
        // 直接设置属性, 为了安全,将成员变量封装起来.不让他直接使用
        // p.name = "老王吧";
        // p.age = -88;
        p.setName("老王吧");
        p.setAge(-88);
        p.setAge(-68);
        p.setAge(88);

        // 获取名称和年龄
        //p.name
        // p.age
        System.out.println(p.getName() + " , " +  p.getAge());
    }
}
