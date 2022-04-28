import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 随机生成 1 ～ 20 的随机数
 */

public class RandomTest {
    public static void main(String[] args) {
        // 创建set集合对象
//        Set<Integer> set = new HashSet<>();

        Set<Integer> set = new TreeSet<Integer>(); // 排序

        // 创建随机数对象
        Random r = new Random();

        while (set.size() < 10) {
            int num = r.nextInt(20) + 1;
            set.add(num);
        }

        for (Integer i:set) {
            System.out.println(i );
        }
    }
}
