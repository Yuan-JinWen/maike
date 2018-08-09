package day8CeShiTi;

import java.util.Scanner;
/*
请用户输入一个“QQ号码”，我们来判断这个QQ号码是否正确。
		要求：使用方法来完成判断功能。
		定义方法：checkQQ (String qq)方法内实现验证。
		验证规则：
			1)	必须是5—12位数字;
			2)	首位不能是0;

 */
public class Test1 {
    public static void main(String[] args) {
        checkQQ();
        }

    private static void checkQQ() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5-12位数字的QQ号");
          String str =sc.next();
     //   System.out.println(str.length());
        if(str.length()>5||str.length()<12){
          //  String sudstring = str.substring(0);
            //System.out.println(sudstring);
        }
        }
    }
