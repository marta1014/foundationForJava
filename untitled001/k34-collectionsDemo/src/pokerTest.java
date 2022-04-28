import java.util.ArrayList;
import java.util.Collections;

public class pokerTest {
    /**
     * 斗地主
     * 1 创建牌盒 2 装牌进盒 3 洗牌 4 发牌 5 看牌
     */

    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        /**
         * ♦️2 。。。 ♣️2 。。。 ♥️2 。。。♠️2 。。。 大王/小王
         */

        String[] colors = {"♦","♠️","♣️","♥️"}; // 定义花色
        String[] points = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"}; // 定义点数

        // 装牌
        for (String color : colors) {
            for (String point : points) {
                poker.add(color+point);
            }
        }
        poker.add("大王");
        poker.add("小王");

        Collections.shuffle(poker); // 洗牌

        // 发牌给三位玩家
        ArrayList<String> playerA = new ArrayList<String>();
        ArrayList<String> playerB = new ArrayList<String>();
        ArrayList<String> playerC = new ArrayList<String>();
        ArrayList<String> DiPai = new ArrayList<String>();

        for (int i = 0; i < poker.size(); i++) {
            String item = poker.get(i);
            if(i >= poker.size() - 3) {
                DiPai.add(item);
            } else if(i % 3 == 0) {
                playerA.add(item);
            } else if(i % 3 == 1) {
                playerB.add(item);
            } else if(i % 3 == 2) {
                playerC .add(item);
            }
        }

        ShowInfo("playerA",playerA);
        ShowInfo("playerB",playerB);
        ShowInfo("playerC",playerC);
        ShowInfo("DiPai",DiPai);


    }

    public static void ShowInfo(String name,ArrayList<String> arr) { // 看牌
        System.out.print(name + "扑克牌是：");

        for (String pk : arr) {
            System.out.print(pk + " ");
        }
        System.out.println();
    }
}
