import java.util.Random;

public class Test02 {
    //1.使用代码完成：获取4个大于1小于10之间的随机整数，并在控制台打印输出

    public static void main(String[] args) {
        Random ran = new Random();
        for (int i = 0; i < 4; i++) {
         int s = ran.nextInt(8)+2;
         System.out.println("随机数"+s);

        }
    }
}
