public class Cat extends Animal{
 // 继承了抽象类以后需要重写抽象类里的抽象方法

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    // 父类中的抽象方法就是限制子类必须要做某些事
}
