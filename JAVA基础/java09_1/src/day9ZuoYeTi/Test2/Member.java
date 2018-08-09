package day9ZuoYeTi.Test2;

import java.util.ArrayList;
import java.util.Random;

public class Member  extends  User{
    // Member 继承 User
    public Member() {
    }
        // 无参构造方法
    public Member(String name, double leftMoney) {
        super(name, leftMoney);
    }
        // 有参构造方法
     public void shouHongBao(ArrayList<Double>list){
        // 定义shouHongBao方法 (参数列表为群主返回集合list)
        System.out.println("集合list:"+list);

         Random ran = new Random();
         // 创建个随机数 Random
         int index  = ran.nextInt(list.size());
         // 定义一个集合长度 index

         double money = list.remove(index);
         // 收到的红包 在集合内remove掉它(长度为index)

         double newMoney = getLeftMoney()+money;
         // 现有余额= 原来余额+ 红包金额
         setLeftMoney(newMoney);
         // 将现有余额重新设置余额
     }
}
