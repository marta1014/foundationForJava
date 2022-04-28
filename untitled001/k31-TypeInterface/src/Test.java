import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        TypeInterfaceLmpl<String> t1 = new TypeInterfaceLmpl<String>();
        t1.show("admin");

        TypeInterfaceLmpl<Integer> t2 = new TypeInterfaceLmpl<Integer>();
        t2.show(66);

        /**
         * 类型通配符 <?>
         *     List<?> => 元素类型未知的List
         *     仅表示它是各种泛型List的父类，并不能吧元素添加到其中
         *
         *     通配符 上限
         *     <? extends Number> => 表示类型是List或者其子类
         *
         *     通配符 下限
         *     <? super Number> => 表示类型是List或者其父 类
         */

        List<?> list = new ArrayList<Object>();
        List<?> list1 = new ArrayList<Number>();
        List<?> list2 = new ArrayList<Integer>();


        List<? extends Number> list4 = new ArrayList<Number>();
        List<? extends Number> list5 = new ArrayList<Integer>();

        List<? super Number> list6 = new ArrayList<Object>();
        List<? super Number> list7 = new ArrayList<Number>();
        // List<? super Number> list8 = new ArrayList<Integer>(); XX

    }
}
