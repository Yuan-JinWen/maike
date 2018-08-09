package day9ZuoYeTi.Test2;


import java.util.ArrayList;

public class QunZhu extends User {
    public QunZhu() {
    }// 创建无参构造方法

    public QunZhu(String name, double leftMoney) {
        super(name, leftMoney);
    } // 创建有参构造方法
    public ArrayList<Double> faHongBao(double money, int count){
        //修饰符  集合类型 方法名(参数列表){}
        // 定义发红包的方法
        ArrayList<Double> list = new ArrayList<>();
         // 创建集合list
        double newMoney = getLeftMoney()-money;
        // 群主发红包以致自身余额减少,获取LeftMoney(原有的余额)- money(发红包总额)
        setLeftMoney(newMoney);
        // 将最终的余额重新设置Money;
        double vgemoney = money/count;
        // 计算发放的平均红包金额
        for (int i = 0; i < count; i++) {
            list.add(vgemoney);
        }   //通过遍历 将平均金额汇总到集合list中
        System.out.println("输出集合list"+list);
            return list;// 输出结果list

    }

}