package day06CeShiTi;

public class Teacher {
    private String bianhao;
   private String name;
    private String xingbie;
   private int age;
    private String kumu;

    public Teacher() {
    }

    public Teacher(String bianhao, String name, String xingbie, int age, String kumu) {
        this.bianhao = bianhao;
        this.name = name;
        this.xingbie = xingbie;
        this.age = age;
        this.kumu = kumu;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKumu() {
        return kumu;
    }

    public void setKumu(String kumu) {
        this.kumu = kumu;
    }
}

