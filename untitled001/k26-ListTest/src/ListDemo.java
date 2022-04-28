import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        /**
         * List 特点 有序/可重复
         */

        List<String> list = new ArrayList<String>(); // create list Object

        list.add("admin");
        list.add("user");
        list.add("person");

        System.out.println(list);

         //        Iterator<String> it = list.iterator(); // 通过集合调用iterator方法得到迭代器对象

        //         while (it.hasNext()) { // ConcurrentModificationException
        //              String item = it.next();
        //              if(item.equals("user")) {
        //                  list.add("heng");
        //              }
        //         }
        // 并发修改异常
        // 迭代器在遍历过程中，通过集合对象修改了集合中元素的长度，造成迭代器获取元素中判断
        // 预期修改值和实际修改值不一致

        // for循环可解决以上问题

        ListIterator<String> listIterator = list.listIterator(); // 列表迭代器
        while (listIterator.hasNext()) {
            String n = listIterator.next();
            if(n.equals("user")) {
                listIterator.add("java");
            }
            System.out.println(n);
        }

        //    while (listIterator.hasPrevious()) { // 逆向遍历
        //    System.out.println(listIterator.previous());
        //}

        System.out.println(list);

        for (String i:list) { // 增强for循环 简化数组和collection集合的遍历
            System.out.println(i);
        }

        /**
         * LinkedList 链表
         */
    }
}
