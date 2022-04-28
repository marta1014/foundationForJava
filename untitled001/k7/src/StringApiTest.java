public class StringApiTest {
    /**
     * String类 特点
     * 1 字符串不可变 => 创建后不可被更改
     * 2 虽然值不可变 但可以被共享
     */
    static String str = "admin";

    public static void main(String[] args) {
        System.out.println(str.length());
    }

}