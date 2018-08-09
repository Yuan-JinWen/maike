package Demo3;

public class Cat extends Animal {
    public void eat() {
        System.out.println("Cat吃鱼鱼鱼鱼...");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

    public Cat() {
    }

    public Cat(String name, String weight) {
        super(name, weight);
    }
}
