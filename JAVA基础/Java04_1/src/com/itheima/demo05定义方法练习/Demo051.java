package com.itheima.demo05定义方法练习;

public class Demo051 {
    public static void main(String[] args) {
        boolean b = compare2(10, 20);
        System.out.println(b);
    }

    public static boolean compare2(int a, int b) {
        return a == b; // 会先算出结果在return
    }

    /*
        定义一个方法比较两是否相个整数同
        定义方法2个明确:
            1.明确返回值类型: 要么相同(true),要么不相同(false), boolean类型
            2.参数列表: 不知道具体是哪2个数比较, 2个未知数据, (int a, int b)
    */
    public static boolean compare(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
