public class Book {
    String name;
    String author;
    Double price;
    // 创建对象时需要new 关键字 以及后边的（）小括号
    public Book(String _name,String _author,Double _price) { // 构造方法
        // 构造方法： 不需要声明返回值类型（写了void就不是构造方法）/不需要写return语句/名字要和类名相同/调用该方法需要new关键字/调用时会永远创建一个新的对象并返回/
       name = _name;
       author = _author;
       price = _price;
    }
}
