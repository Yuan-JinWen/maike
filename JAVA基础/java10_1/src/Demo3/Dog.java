package Demo3;

public class Dog extends Animal {

    public void eat() {
        System.out.println("Dog吃骨头");
    }
    public void lookHome(){
        System.out.println("狗狗看家");
    }
    public Dog() {
    }

    public Dog(String name, String weight) {
        super(name, weight);
    }
}
