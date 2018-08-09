package com.itheima.demo10抢红包案例;
// qt/ c++
// idea配置tomcat
public class Demo10 {
    public static void main(String[] args) {
        // 创建界面
        MyRedPacketFrame frame = new MyRedPacketFrame("发红包嘻嘻嘻");
        frame.setOwnerName("小西瓜");
//        CommonWay com = new CommonWay();
        LuckyWay lw = new LuckyWay();
        frame.setOpenWay(lw); // 参数是接口,需要给接口的实现类对象
    }
}
