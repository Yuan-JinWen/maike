package Demo;
/*
1.现有两个手机类OldPhone和NewPhone
	两个类都有call()  sendMessage() 方法,
	已知接口Play中有一个方法playGame(),NewPhone有玩游戏的功能;
	要求:分别测试OldPhone和NewPhone的两个方法,
	再测试新手机palyGame()的方法.
 */
public class Test1 {
    public static void main(String[] args) {
        Phone p = new oldPhone();
        p.call();
        p.sendMessage();

        Phone p1 = new NewPhone();
        p1.call();
        p1.sendMessage();

       System.out.println("-------");

       if(p1 instanceof NewPhone){
            NewPhone n = (NewPhone)p1;
            ((NewPhone) p1).playGame();
        } else {
            System.out.println("p 不是NewPhone类型");
        }


    }




}
