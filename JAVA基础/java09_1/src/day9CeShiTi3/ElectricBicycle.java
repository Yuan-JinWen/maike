package day9CeShiTi3;

public class ElectricBicycle extends Vehicle {
    public void run() {
        System.out.println(getWheel()+"个轮子的"+getColor()+"的电动车骑着跑");
    }
    public void charge(){
        System.out.println(getWheel()+"个轮子的"+getColor()+"的电动车自行车在充电");
    }

    public ElectricBicycle() {
    }

    public ElectricBicycle(int wheel, String color) {
        super(wheel, color);
    }
}
