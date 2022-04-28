public class IntegerDemo  {
    /**
     * 基本类型包装类
     *
     * 最常用操作 将基本数据类型与字符串之间的转换
     * 包装类 => 基本类型
     * Boolean => boolean
     * Integer => int
     * Byte => byte
     * Long => long
     * Float => float
     * Double => double
     * Character => char
     * Short => short
     */
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer i = Integer.valueOf(100);
        Integer i2 = Integer.valueOf("100");

        System.out.println(i2);
        System.out.println(i);

        /**
         * int 转成 S tring
         */

        String s = String.valueOf(i); // *

        /**
         * String => int
         */

        String str = "strTest";

        // 方式1
        Integer ii = Integer.valueOf(str);
        int X = i.intValue();
        // 此时X为int类型

        // 方式2
        int ir = Integer.parseInt(str);  // *
    }
}
