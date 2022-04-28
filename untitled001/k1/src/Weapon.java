public class Weapon {
    public String type;
    public double wright;
    public int capacity;

    public void fire() {
        System.out.println("每一个武器都有一个功能，开火～");
    }
}

/**
 * about 抽象类 abstract
 * 当一个类被abstract修饰为抽象类、他不可以被实例化(创建对象)
 * 当一个方法被abstract修饰为抽象方法、该方法只有声明、没有任何实现(存在的意义就是规范子类的代码)
 * 抽象方法被子类继承后、子类必须重写该方法、除非子类也是抽象类
 * 只有抽象类中可以定义抽象方法、普通类不可以
 */
