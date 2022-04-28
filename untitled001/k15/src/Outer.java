public class Outer {
    // 成员内部类
    private int num = 19;
    private class Inner {
        public void showOuterMsg() {
           System.out.println(num);
        }
    }
    public void showPrivateMsg() {
        Inner i = new Inner();
        i.showOuterMsg();
    }
}
