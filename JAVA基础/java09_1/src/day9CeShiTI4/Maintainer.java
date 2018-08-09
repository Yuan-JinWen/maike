package day9CeShiTI4;

public class Maintainer extends AdminStaff {
    public void work(){
        System.out.println("工号为"+getId()+"的维护专员"+getName()+"在解决不能共享屏幕问题");
    }

    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }
}
