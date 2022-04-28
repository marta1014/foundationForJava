public class Outer {
    /**
     * 局部内部类
     * 方法调用也是间接 通过外部类的对象调用他的成员方法，在该方法内部创建局部内部类对象调用方法
     */

    private int num = 22;

    public void methods() {
        int num2 = 90;
        class Inner {
            public void showOuterMsg() {
                System.out.println(num);
                System.out.println(num2);
            }
        }

        Inner i = new Inner();
        i.showOuterMsg();
    }
}
