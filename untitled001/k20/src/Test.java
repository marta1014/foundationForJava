public class Test {
    public static void main(String[] args) {
        ObjectDemo objectDemo1 = new ObjectDemo();
        objectDemo1.setAge(22);
        objectDemo1.setName("admin");

        ObjectDemo objectDemo2 = new ObjectDemo();
        objectDemo1.setAge(22);
        objectDemo1.setName("admin");

        /**
         *  System.out.println(objectDemo1 == objectDemo2);
         *  =>  false 内存地址不同 此处比较的是地址值而不是内容
         */

        /**
         * equals
         * System.out.println(objectDemo1.equals(objectDemo2));
         * => false 内存地址不同 此处默认 比较的是地址值而不是内容
         * 重写equals方法后 => true
         */


    }
}
