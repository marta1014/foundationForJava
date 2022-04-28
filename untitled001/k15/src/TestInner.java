public class TestInner {
    public static void main(String[] args) {
        /**
         *   Inner inner = new Inner(); XXX
         *    成员内部类 外界创建使用格式
//         *    格式： 外部类名.内部类名 name = 外部类对象.内部类对象 XXX
//         *
//         *    Outer.Inner oi = new Outer().new Inner(); XXX
//         *    oi.showOuterMsg(); XXX
         */

        Outer o = new Outer();
        o.showPrivateMsg();

    }
}
