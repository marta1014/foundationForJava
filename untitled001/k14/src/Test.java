public class Test {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();

        Animal cat = new Cat();
        cat.setName("加菲");
        System.out.println(cat.getName());
        cat.eat();
        ((Cat) cat).jump();

        // 使用的时候最终是使用的具体的子类/实现类
        Cat c = new Cat("加菲啊",8);
        c.eat();
        c.jump();
    }
}

// 接口和抽象类的区别

/**
 * 成员区别
 *
 * 抽象类 变量，常量，构造方法，抽象方法，非抽象方法
 * 接口 常量，抽象方法
 *
 * 关系区别
 *
 * 类与类 单继承
 * 类与接口 实现，单实现/多实现
 * 接口与接口 单继承/多继承
 *
 * 设计理念区别
 *
 * 抽象类 对类抽象 包括属性/行为
 * 接口 行为抽象 行为
 */