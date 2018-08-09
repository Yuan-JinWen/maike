package day07CeShiTi;

public class Soldier {
    private String name;
    private int age;
    private String Aihao;


    public Soldier() {
    }

    public Soldier(String name, int age, String aihao) {
        this.name = name;
        this.age = age;
        Aihao = aihao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAihao() {
        return Aihao;
    }

    public void setAihao(String aihao) {
        Aihao = aihao;
    }
    public void show(){
        System.out.println(name+" "+age+" "+Aihao);
    }

}
