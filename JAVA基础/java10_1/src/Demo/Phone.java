package Demo;

/*
两个类都有call()  sendMessage() 方法
 */
public abstract class Phone {
    public abstract void call();
       // System.out.println("打电话");

    public abstract void sendMessage();

       // System.out.println("发短信");

    public Phone() {
    }
}
