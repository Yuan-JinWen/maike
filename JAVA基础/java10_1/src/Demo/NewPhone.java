package Demo;

public class NewPhone extends Phone implements Play{

    public void call() {
        System.out.println("NewPhone类的打电话");
    }

    public void sendMessage() {
        System.out.println("NewPhone类的发短信");
    }

    public NewPhone() {
    }

    public void playGame() {
        System.out.println("玩游戏");
    }




}
