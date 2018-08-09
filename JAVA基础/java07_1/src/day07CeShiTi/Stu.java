package day07CeShiTi;
/*
成员属性: snum (学号)：int类型, score(成绩):double类型，属性使用private修饰
为所有属性提供set/get方法
 */
public class Stu {
    private int snum;
    private double score;

    public Stu() {
    }

    public Stu(int snum, double score) {
        this.snum = snum;
        this.score = score;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
