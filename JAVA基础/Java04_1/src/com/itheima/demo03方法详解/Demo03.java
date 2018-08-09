package com.itheima.demo03方法详解;
/*
    方法详细格式:
        修饰符 返回值类型 方法名(数据类型1 变量名1, 数据类型2 变量名2...) {
            // 方法体
            return 结果;
        }

        修饰符: public static
        返回值类型: void(无返回值), byte(字节类型), short(短整型), int(整型), long(长整型), 
		float(单精浮点型),double(双精浮点型), char(字符型), boolean(布尔类型)(基本数据类型),
		引用数据类型(String)(字符串类型)
        方法名: 满足标识符规范(见名知意)
        (数据类型1 变量名1, 数据类型2 变量名2...): 参数列表, 对于未知的数据就定义在参数列表上面
        方法体: 代码,以前学的代码都可以放,定义变量,if,for,while,switch
        return 结果; 1.结束方法 2.将结果返回到方法调用的地方

        定义一个方法2个明确
            1.返回值类型(按照我们想法来)  	返回值类型 (按照我们想法来)
            2.参数列表(未知的数据)			参数列表 (未知的数据)
 */
public class Demo03 {
    public static void main(String[] args) {
        // 实际参数: 调用方法传入的具体值
        // int c = 5;
        int sum = getSum(5, 6);
        System.out.println(sum);
    }
    /*
        定义方法实现两个整数的求和计算
        定义一个方法2个明确:
            1.返回值类型: 两个整数求和结果是整数,返回int类型
            2.参数列表: 具体是哪两个整数求和不清楚,作为参数列表: (int a, int b)
     */
    //                        (int a = 5, int b = 6)
    public static int getSum(int a, int b) { // 形式参数:定义方式时,方法名后面,只是2个变量,没有具体值
        int c = a + b; // c = 11

        return c; // 11
    }
}
