package day9CeShiTi3;

public class Car extends Vehicle {
    public void run() {
        System.out.println(getWheel()+"个轮子的"+getColor()+"的汽车开着跑");
    }
    public void addGasoline(){
        System.out.println(getWheel()+"个轮子的"+getColor()+"的汽车在加油");
    }

    public Car() {
    }

    public Car(int wheel, String color) {
        super(wheel, color);
    }
}
