package day9CeShiTi2;

public abstract class Animal {
    private String color;
    private int numOfLegs;



    public Animal() {
    }

    public Animal(String color, int numOfLegs) {
        this.color = color;
        this.numOfLegs = numOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
    public abstract void eat();
}
