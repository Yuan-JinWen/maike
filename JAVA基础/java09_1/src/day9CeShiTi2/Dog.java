package day9CeShiTi2;

class Dog extends Animal{

    public void eat() {
        System.out.println(getNumOfLegs()+"条腿的"+getColor()+"的狗在啃骨头");
    }
    public void lookHome(){
        System.out.println(getNumOfLegs()+"条腿的"+getColor()+"的狗在看家");
    }

    public Dog() {
    }

    public Dog(String color, int numOfLegs) {
        super(color, numOfLegs);
    }
}
