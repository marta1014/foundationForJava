import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionTest1 {
    /**
     *       集合
     *       Collection(单列集合)
     *       创建collection集合对象  多态形式创建/ArrayList
     *
     *       Iterator 迭代器 集合专用遍历方式 常用方法 next() hasNext()
     *
     *
     *       Map(双列集合)
     */

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>(); // 创建集合对象
        c.add("22");
        c.add("Java");
        c.add("Java3");
        c.add("JavaEE");

        Iterator<String> i = c.iterator(); // 迭代器

        while (i.hasNext()) {
            String in = i.next();
            System.out.println(i.next());
        }
    }
}
