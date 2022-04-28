public class ErrorTest {

    /**
     * throwable(Error\Exception)
     * Error
     *
     * Exception RuntimeException/非RuntimeException
     * RuntimeException 编译期间不检查
     * 非RuntimeException 编译期间就会检查 否则不能通过编辑
     *
     *  * JVM(java虚拟机)默认处理方案
     *      * 抛出异常/报告位置信息等/结束程序
     *
     *      - try ... catch ...
     *      - throws 抛出异常且需要进一步try...catch。。。
     */

    public static void main(String[] args) {
        System.out.println("start");
        errMethods();
        System.out.println("end");
    }

    public static void errMethods() {
        try {
            int[] arr = {3,4,6};
            System.out.println(arr[3]);
        }  catch (ArrayIndexOutOfBoundsException err) {
             err.printStackTrace();
        }
    }

    public static void errMethods1() throws ArrayIndexOutOfBoundsException {
        try {
            int[] arr = {3,4,6};
            System.out.println(arr[3]);
        }  catch (ArrayIndexOutOfBoundsException err) {
            err.printStackTrace();
        }
    }
}
