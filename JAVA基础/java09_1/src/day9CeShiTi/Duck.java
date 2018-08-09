package day9CeShiTi;

public class Duck extends  Poultry{
    public void eat(){
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在吃鱼");
    }
    public void swim(){
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在游泳");
    }

    public Duck() {
    }

    public Duck(String color, int age) {
        super(color, age);
    }
}
