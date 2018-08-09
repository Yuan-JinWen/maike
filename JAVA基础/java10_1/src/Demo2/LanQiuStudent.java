package Demo2;

public class LanQiuStudent extends Student implements Sport {

    public void set() {
        System.out.println("学习让我容易犯困");
    }

    public void show() {
        System.out.println("困了,就想睡觉");
    }

    public LanQiuStudent() {
    }

    public LanQiuStudent(String name, int age) {
        super(name, age);
    }
}
