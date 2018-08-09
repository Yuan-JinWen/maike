package day06CeShiTi;
/*
一、有以下数据：
 三个老师(Teacher)信息：
教师编号	姓名	性别	年龄	科目
t001		薛之谦	男		26		Java
t002		张碧晨	女		24		IOS
t003		张杰	男		28		Java
二、请定义Teacher类；
三、创建MainApp类中，包含main()方法，创建相应对象，通过构造方法给成员变量赋值。
四、打印每个对象的所有属性。
要求：每个类要按照封装的原则进行定义。并提供无参和全参的构造方法。
 */
public class MainAPP {
    public static void main(String[] args) {
        Teacher t= new Teacher("too1","薛之谦","男",26,"Java");
        System.out.println(t.getBianhao()+","+t.getName()+","+t.getXingbie()+","+t.getAge()+","+t.getKumu());
        Teacher j= t;
        j.setBianhao("too2");j.setName("张碧晨");j.setXingbie("女");j.setAge(24);j.setKumu("IOS");
        System.out.println(t.getBianhao()+","+t.getName()+","+t.getXingbie()+","+t.getAge()+","+t.getKumu());
        Teacher k= j;
        k.setBianhao("too3");k.setName("张杰");k.setXingbie("男");k.setAge(28);k.setKumu("Java");
        System.out.println(t.getBianhao()+","+t.getName()+","+t.getXingbie()+","+t.getAge()+","+t.getKumu());
    }
}
