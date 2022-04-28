public class GouZao {
    // 该案例是为了识别正确的构造方法
    String name = "阿猫";
    String health = "健康";
    int age = 4;

    public void GouZao() {
        health = "强壮";
        age = 20;
        System.out.println("其实该方法不是构造方法啊");
    }

    public void printMsg() {
        System.out.println("name:" + name + "," + "health:" + health + "," + "age:" + age );
    }

    public static void main(String[] args) {
        GouZao gz = new GouZao(); // 此时自动创建了构造方法并调用了空的构造方法，并非是line 6 的GouZao函数
        gz.printMsg();
//        gz.GouZao();
    }
}
