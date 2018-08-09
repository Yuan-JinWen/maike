package com.itheima.demo07继承后的特点_构造方法;
// 父类
public class Person {
        private String name;
        private int age;

        public Person() {
            System.out.println("父类无参构造 Person()");
        }
        public Person(String name, int age) {
            System.out.println("父类有参构造 Person(String name, int age)");
            this.name = name;
            this.age = age;
        }
        public void eat() {
            System.out.println(name + "吃饭");
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

class Student extends Person {
    private double score;

    public Student() {
        super();
        System.out.println("子类无参构造: Student()");
    }

    public Student(String name, int age, double score) {
        // super();
        // 子类的有参构造调用父类的有参构造,父类中的成员变量使用父类去赋值
        super(name, age);

        // 子类中的成员变量,子类自己赋值
        this.score = score;
        System.out.println("子类有参构造: Student(String name, int age, double score)");
    }

    public void show() {
        // super();
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
}