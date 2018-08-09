package day07CeShiTi;

import java.util.ArrayList;

/*
定义类：Test01,类中定义main()方法，依次完成以下要求:
	实例化3个Stu对象，通过有参构造的方法给3个对象的属性分别赋值为：1001, 61.0、1002, 59.9、1003, 29.8)
	创建一个ArrayList集合，分别将上面的3个Stu对象添加到集合中
	遍历集合,删除集合中元素的学号为1002的元素，并打印集合中剩余元素的学号和成绩。
   控制台输出结果如下:
	学号为1001的人分数为61.0分
	学号为1003的人分数为29.8分
 */
public class CeShiTi01 {
    public static void main(String[] args) {
        ArrayList<Stu> list = new ArrayList<>();
            Stu a = new Stu(1001,61.0);
            Stu b = new Stu(1002,59.9);
            Stu c = new Stu(1003,29.8);
            list.add(a);
            list.add(b);
            list.add(c);
        for (int i = 0; i < list.size(); i++) {
              Stu s = list.get(i);
              Stu k= list.remove(1);
            System.out.println("学号为"+s.getSnum()+"的人分数为"+s.getScore()+"分");
        }
    }
}
