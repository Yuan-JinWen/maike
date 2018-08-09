package day9CeShiTi;

 class Cock extends Poultry{
    public void eat(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在啄米");
    }
    public  void crow(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在打鸣");
    }

    public Cock() {
    }

    public Cock(String color, int age) {
        super(color, age);
    }
}
