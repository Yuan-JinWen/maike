package day9CeShiTi2;

 class Parrot extends Animal {
     public void eat() {
         System.out.println(getNumOfLegs()+"条腿的"+getColor()+"的鹦鹉在吃小米");
     }
     public void say(){
         System.out.println(getNumOfLegs()+"条腿的"+getColor()+"的鹦鹉在说你好,丑八怪");
     }

     public Parrot() {
     }

     public Parrot(String color, int numOfLegs) {
         super(color, numOfLegs);
     }
 }
