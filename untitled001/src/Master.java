public class Master {
    String name;
    int age;

    public void sayHello() {
        System.out.println("hello~");
        fiveFlog();
    }

    public void fiveFlog() {
        System.out.println("1鞭子~2鞭子~3鞭子~4鞭子~5鞭子~");
    }

    public static void main(String[] args) {
        Master t = new Master();
        t.name = "马保国";
        t.age = 66;
        t.sayHello();
    }

}
