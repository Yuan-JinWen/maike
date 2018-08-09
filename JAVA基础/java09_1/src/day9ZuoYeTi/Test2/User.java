package day9ZuoYeTi.Test2;

public class User {
    private String name;
    private double leftMoney;

    public void show(){
        System.out.println(name+"的余额:"+leftMoney);
    }

    public User() {
    }

    public User(String name, double leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }
}
