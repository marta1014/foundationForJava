public class OuterClass {
    /**
     * 匿名内部类
     * 格式
     * new 一个类名/接口名() {
     *     重写方法
     * }
     *  本质 是一个继承了该类/或者实现了该接口的子类匿名对象
     */

    public void methods() {
        /**
         * Inner inner = new Inner() {
         *             @Override
         *             public void show() {
         *                 System.out.println("匿名内部类");
         *             }
         *         };
         */

        /* lambda 以上code 转换为以下 */
        Inner inner = () -> System.out.println("匿名内部类");

        inner.show();
    }
}
