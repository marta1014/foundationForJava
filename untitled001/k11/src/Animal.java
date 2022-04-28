public abstract class Animal { // 抽象类
    private String name;
    private int age;
    public Animal() {};
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat(); // 抽象方法 => 因为没有方法体故为抽象方法、索引类必须定义为抽象类

    public void sleep() {
        System.out.println("睡觉");
    }

    /**
     * 抽象类特点
     * 1. abstract 需用关键字修饰抽象方法和抽象类
     * 2. 抽象类里可以美誉抽象方法
     * 3. 抽象类参照多态来创建对象(虽不能直接实例化，参照多态的方式通过子类对象来实例化)
     * 4. 抽象类的子类需要重写抽象类的抽象方法(全部抽象方法)
     * 5. 如果不重写抽象类中的抽象方法，需要自己本身就是抽象类
     *
     * 注意： 父类中的抽象方法就是限制子类必须要做某些事/ 非抽象方法为了提高复用性
     *
     * 多态的前提：有继承或者实现关系；有方法重写；有父(类/接口)引用指向(子/实现)类对象
     *
     * 抽象类的成员特点
     * 1
     */
}
