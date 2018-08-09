package Demo2;

public class Test2 {
    public static void main(String[] args) {
        Student s = new PuStudent("李明", 18);
        s.set();
        s.show();
        Student s1 = new LanQiuStudent("姚明",28);
        s1.set();
        s1.show();

        System.out.println("---------------华丽的分割线呈现---------------");
        if(s1 instanceof LanQiuStudent){
            LanQiuStudent l = (LanQiuStudent)s1;
            l.playBasketball();
            l.set();
            l.show();
        } else {
           System.out.println("现s1不为LanQiuStudent类型");
        }
    }
}
