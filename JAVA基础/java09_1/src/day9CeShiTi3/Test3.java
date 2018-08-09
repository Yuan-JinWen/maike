package day9CeShiTi3;

public class Test3 {
    public static void main(String[] args) {
        Car c = new Car(4,"白色");
        c.run();
        c.addGasoline();
        ElectricBicycle eb = new ElectricBicycle(2,"黑色");
        eb.run();
        eb.charge();
    }
}
