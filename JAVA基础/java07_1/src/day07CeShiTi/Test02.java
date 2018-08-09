package day07CeShiTi;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Soldier> list = new ArrayList<>();
        Soldier s = new Soldier("王小兵", 25, "打篮球");
        Soldier s1 = new Soldier("李团长", 35, "游泳");
        Soldier s2 = new Soldier("王军长", 55, "踢足球");

        list.add(s);
        list.add(s1);
        list.add(s2);
        for (int i = 0; i < list.size(); i++) {
            Soldier y = list.get(i);
            if (y.getAge() > 40) {
                y.setAihao("打高尔夫");
                y.show();
            }
           // for (int i1 = 0; i1 < list.size(); i1++) {
            //                System.out.println(list.get(i1).getName() + " " + list.get(i1).getAge() + " " + list.get(i1).getAihao());
            //            }

        }
    }
}

