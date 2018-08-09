package com.itheima.demo06局部内部类;
/*
    局部内部类:定义在方法内

    局部内部类格式:
        class 外部类名 {
            数据类型 变量名;    
               
            修饰符 返回值类型 方法名(参数列表) {    
                // 在方法内定义了一个类.局部内部类
                class 内部类 {        
                    // 成员变量            
                    // 成员方法            
                }        
            }    
        }

    局部内部类好处:可以直接使用外部类的成员
    局部内部类特点:编译后外部类名$数字内部类名

    成员内部类和局部内部类用的非常少
 */
class Chinese {
    String name = "凤姐";

    public void eat() {
        // 在方法内定义了一个类.局部内部类
        // 这个方法中定义的类,只有这个方法内能使用
        class Chopsticks { // 筷子
            private int length = 80;

            public void use() {
                System.out.println(name + "在使用筷子:" + length);
            }
        }

        // 接着创建对象
        Chopsticks c = new Chopsticks();
        c.use();
    }

}

public class Demo06 {
    public static void main(String[] args) {
        // System.out.println(a);
        // Chopsticks c = new Chopsticks();

        Chinese c = new Chinese();
        c.eat();
    }

    public static void test01() {
        // 方法中的局部变量只能方法自己使用,方法外无法访问
        int a = 20;
    }
}
