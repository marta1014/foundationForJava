public class Test {
    public static void main(String[] args) {
        ObjectDemo objectDemo = new ObjectDemo();
        objectDemo.setName("admin");
        objectDemo.setAge(33);
        System.out.println(objectDemo);
        /**
         *   底层Object.toString()方法 生成ObjectDemo@6e0be858
         *   所以 建议子类重写该方法(自动生成即可) command + n toString()
         *   ObjectDemo@6e0be858 => ObjectDemo{name='admin', age=33}
         */

    }
}
