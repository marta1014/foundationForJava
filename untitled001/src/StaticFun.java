public class StaticFun {
    // 静态方法不需要new 直接类名.方法调用

    public static void staticFnTest() {
        System.out.println("静态方法的调用。。。");
    }

    public static void main(String[] args) {
        StaticFun.staticFnTest();
    }
}


 // class 类相当于一个模版
 // 对象的方法叫做成员方法 / 类的方法叫做静态方法