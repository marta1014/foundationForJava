import java.util.ArrayList;

/**
 * ArrayList 集合
 *
 * 构造方法
 * public ArrayList()  => 创建一个空集合
 *
 * ArrayList 常用
 *
 *
 */

public class ArrListTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("admin");
        arr.add("user");
        arr.add("person");
        arr.add(3,"arrList");
        arr.remove("funny"); //返回false 支持索引
        arr.set(1,"soul"); //修改
        arr.get(8); //获取不存在 => 索引越界
        System.out.println(arr);

        // common
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i ));
        }
    }
}
