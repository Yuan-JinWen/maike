package com.itheima.demo10抢红包案例;

import com.itheima.known.RedPacketFrame;

// 强制让我们使用子类
public class MyRedPacketFrame extends RedPacketFrame {
    /**
     * 构造方法:生成红包界面.
     *
     * @param title 页面的标题.
     */
    public MyRedPacketFrame(String title) {
        super(title);
    }
}
