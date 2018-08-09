package day9CeShiTI4;

public class Lecturer extends Teacher {
    public void work(){
        System.out.println("工号为"+getId()+"的讲师"+getName()+"在讲课");
    }

    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }
}
