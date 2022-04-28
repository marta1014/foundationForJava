public class ConcatMsg {
    /**
     * 形参和返回值
     *
     * 1-1 类名作为形参和返回值
     * - 方法的形参是类名，其实需要的是该类的对象
     * - 方法的返回值是类名，其实返回的是该类的对象
     *
     * 1-2 抽象类名作为形参和返回值
     * - 方法的形参是抽象类名，其实需要的是该抽象类的子类对象
     * - 方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
     *
     * 1-3 接口名作为形参和返回值
     * - 方法的行参是接口名，其实需要的是该接口的实现类对象
     * - 方法的返回值是接口名，其实返回的是该接口的实现类对象
     */


    /**
     * 内部类
     *
     * 特点
     * - 可以直接访问外部类的成员，包括私有
     * - 外部类想要访问内部类，必须创建对象
     */

    private int num = 4;

    public class Inner {
        public void showOuterMsg() {
            System.out.println(num);
        }
    }

    public void methods() {
        Inner inner = new Inner();
        inner.showOuterMsg();
    }
}
