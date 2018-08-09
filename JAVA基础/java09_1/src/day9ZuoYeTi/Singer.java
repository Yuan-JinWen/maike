package day9ZuoYeTi;

public class Singer extends Person{
    public void eat() {
        System.out.println(getAge()+"的歌手"+getName()+"在吃大闸蟹");
    }

    public Singer() {
    }

    public Singer(String name, int age) {
        super(name, age);
    }

    public void sing(){
        System.out.println(getAge()+"的歌手"+getName()+"在演唱丑八怪");
    }
}
