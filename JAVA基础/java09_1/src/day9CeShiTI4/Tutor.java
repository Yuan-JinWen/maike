package day9CeShiTI4;

public class Tutor extends Teacher {
    public static Object t;

    public void work(){
        System.out.println("工号为"+getId()+"的助教"+getName()+"帮忙学生解决问题");
    }
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

}
