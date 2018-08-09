package Demo2;

public class PuStudent extends Student{

    public void set() {
        System.out.println("好好学习,天天向上");
    }

    public void show() {
        System.out.println("天天犯困,想去睡觉");
    }

    public PuStudent() {
    }

    public PuStudent(String name, int age) {
        super(name, age);
    }
}
