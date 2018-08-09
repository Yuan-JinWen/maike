package Demo2;

public interface Sport {
    public default void playBasketball() {
        System.out.println("我打篮球很溜...那是骗你的");
    }
}
