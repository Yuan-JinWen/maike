package day9ZuoYeTi;
class Actor extends Person {
    public void eat() {
        System.out.println(getAge()+"的演员"+getName()+"在吃小龙虾");
    }
    public void dance(){
        System.out.println(getAge()+"的演员"+getName()+"在跳白天鹅");
    }

    public Actor() {
    }

    public Actor(String name, int age) {
        super(name, age);
    }
}