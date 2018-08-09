package com.itheima.demo05定义方法练习;

public class Demo052 {
    public static void main(String[] args) {
        int i = getSum();
        System.out.println(i);
    }

    /*
        定义一个方法计算1+2+3...+100的和
            定义方法2个明确:
                1.明确返回值类型: 整数求和,结果是整数int
                2.参数列表: 没有未知数据 ()
     */
    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }
}
