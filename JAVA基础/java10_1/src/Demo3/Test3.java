package Demo3;

public class Test3 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        Animal a1 = new Cat();
        a1.eat();
        System.out.println("分割线------");
        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.eat();
            d.lookHome();
        }else {
            System.out.println("a不为Dog类型");
        }
        if(a1 instanceof Cat){
            Cat c = (Cat)a1;
            c.eat();
            c.catchMouse();
        }else{
            System.out.println("a1 不为Cat类型");
        }
    }
}
