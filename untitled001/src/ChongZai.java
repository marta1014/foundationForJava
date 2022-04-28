public class ChongZai {
    // 重载 overload
    public void fire(String type, int limit) {
        System.out.println("武器类型");
    }

    public void fire(int num) {
        System.out.println("武器数量:"+ num);
    }

    public void fire() {
        System.out.println("小手枪一击毙命 boo～");
    }

    public static void main(String[] args) {
        ChongZai overload = new ChongZai();
        overload.fire(7);
    }
}
