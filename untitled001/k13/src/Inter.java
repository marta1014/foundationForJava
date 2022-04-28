public interface Inter {
    public int num = 20;
    public final int num2 = 20;
    // public static final int num3 = 20; <===> int num3 = 20
    // 接口中的变量是一个常量且被静态修饰/可通过接口名直接访问

    // 接口内部没构造方法 里面的方法只能是抽象的(默认就是)
}
