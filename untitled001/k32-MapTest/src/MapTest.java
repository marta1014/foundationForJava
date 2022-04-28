import java.util.Collection;
import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        // 创建map集合对象
        HashMap<String, String> map = new HashMap<>();
        map.put("HM001","admin");
        map.put("HM002","user ");
        // put key重复时会替换该值

        System.out.println(map);

        /**
         * Map
         * put(k,v) / remove(k) / clear() / containsKey(k) / containsValue(v) / isEmpy()
         */

        /**
         * Map 的获取功能
         * get(k) / keySet() 获取所有键的集合   / Collection(v) values() 值的集合
         */

        Collection<String> values = map.values();
    }
}