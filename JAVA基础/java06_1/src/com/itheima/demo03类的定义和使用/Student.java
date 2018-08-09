package com.itheima.demo03类的定义和使用;

/*
学生事物:
    属性: 姓名, 年龄, 身高, 班级...爱好
    行为: 吃饭, 睡觉, 学习, 看书, 敲代码...

    怎么分辨属性和行为的?: 属性(名词), 行为(动词)

    类:java中的类就是用来描述现实生活中的一类事物(抽象的描述)(iPhone图纸)
    对象:对象是类产生的一个具体事物(具体的)(32G的土豪金价值6666元)(张三,18岁,身高1.66,体重120KG,黑黝黝,女)

    Java中的类如何描述现实生活的事物
    Java中的类包含:
        成员变量: 描述事物的属性(姓名, 年龄, 身高, 班级...爱好)
        成员方法: 描述事物的行为(吃饭, 睡觉, 学习, 看书, 敲代码...)

        成员变量: 和以前的变量一样,放的位置不一样,放在类中方法外. 数据类型 变量名 = 值;
        成员方法: 和以前的方法相比,去掉static即可
                   修饰符 返回值类型 方法名(数据类型 变量名,...) {
                        // 方法体;
                        return 结果;
                   }
 */
// 类是事物的抽象描述(相当于图纸)
public class Student {
    // 属性:
    // 姓名
    String name;  
    // 年龄
    int age;

    // 行为:
    // 吃饭
    public void eat() {
        System.out.println(name + "在吃饭");
    }
    // 睡觉
    public void sleep() {
        System.out.println(name + "在睡觉");
    }
}





/*    public class Student{
	创建的Student (人) 的类
	属性:
	姓名;
	String name;
	年龄;
	   int age 
	   
	   行为:
public void  eat(){
			 吃饭
	System.out.println(name+ "在吃饭");
	
	public void sleep (){
				睡觉
		System..out.println( name + "在睡觉");
	}
}
}
*/