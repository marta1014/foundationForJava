//public class TypeFun<T> { // 泛型类改进
//    public void show(T t) {
//        System.out.println(t);
//    }
//}

public class TypeFun { // 泛型方法
    public <T> void show(T t) {
        System.out.println(t);
    }
}
