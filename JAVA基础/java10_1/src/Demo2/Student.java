package Demo2;
/*
学生类:
		属性: 姓名 年龄
		行为: 学习 睡觉
	有些学生会打篮球,定义一个接口Sport,包含一个playBasketball方法
	在main方法中创建普通学生和会打篮球的学生,先使用多态的方式调用学习的方法.
	会打篮球的学生需要向下转型,调用打篮球的功能
 */
public abstract class Student {
    private String name;
    private  int age;

    public  abstract void set();
    public  abstract void show ();

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
