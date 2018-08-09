package day9CeShiTi;

 class Poultry {
    private String color;
    private int age;

    public void eat(){
        System.out.println(age+"岁的"+color+"家禽在吃饭");
    }

    public Poultry() {
    }

    public Poultry(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
