import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerPlus {
    /**
     * 1 创建HashMap 键为编号 值为牌
     * 2 创建ArrayList 存储编号
     * 3 创建花色数组和点数数组
     * 4 从0开始往HashMap里存编号以及对应的牌 同时往ArrayList里存储编号
     * 5 洗牌 => 洗的是编号
     * 6 发牌 => 发的也是编号 为了保证编号是排序的 用treeSet集合接收
     * 7 定义看牌方法 遍历TreeSet集合 获取编号 到HashMap里找对应的牌
     * 8 调用看牌方法
     */
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        String[] colors = {"♦","♠️","♣️","♥️"}; // 定义花色
        String[] points = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"}; // 定义点数

        int index = 0;
        for (String point : points) {
            for (String color : colors) {
                hashMap.put(index,color+point);
                list.add(index);
                index++;
            }
        }
        hashMap.put(index,"大王");
        list.add(index);
        index++;
        hashMap.put(index,"小王");
        list.add(index);
//        for (String color : colors) {
//            for (String point : points) {
//                hashMap.put(index,color+point);
//                list.add(index);
//                index++;
//            }
//        }

//        System.out.println(hashMap);

        Collections.shuffle(list);

        // 发牌  使用treeset保证了编号是排序的 创建treeSet集合接收
        TreeSet<Integer> playerA = new TreeSet<>();
        TreeSet<Integer> playerB = new TreeSet<>();
        TreeSet<Integer> playerC = new TreeSet<>();
        TreeSet<Integer> DIPAI = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int item = list.get(i);
            if(i >= list.size() - 3) {
                DIPAI.add(item);
            } else if(i % 3 == 0) {
                playerA.add(item);
            } else if(i % 3 == 1) {
                playerB.add(item);
            } else if(i % 3 == 2) {
                playerC .add(item);
            }
        }

        showPokerInfo("playerA",playerA,hashMap);
        showPokerInfo("playerB",playerB,hashMap);
        showPokerInfo("playerC",playerC,hashMap);
        showPokerInfo("DIPAI",DIPAI,hashMap);
    }

    public static void showPokerInfo(String name, TreeSet<Integer> treeSet, HashMap<Integer,String> hashMap) {
        System.out.print(name + "底牌是：");
        for (Integer i : treeSet) {
            String poker = hashMap.get(i);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
