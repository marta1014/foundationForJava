public class Dolphin extends Animal implements swim{
    public Dolphin(String name,double age) {
        super(name,age);
    }

    @Override
    public void swim() {
        System.out.println(getName() + "在戏水");
    }
}
