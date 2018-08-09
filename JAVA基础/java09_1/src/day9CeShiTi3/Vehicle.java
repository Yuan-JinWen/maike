package day9CeShiTi3;

public abstract class Vehicle {
    private int wheel;
    private String color;

    public abstract void run();

    public Vehicle() {
    }

    public Vehicle(int wheel, String color) {
        this.wheel = wheel;
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
