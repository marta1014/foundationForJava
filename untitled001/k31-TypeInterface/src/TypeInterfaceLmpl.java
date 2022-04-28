public class TypeInterfaceLmpl<T>  implements TypeInterface<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
