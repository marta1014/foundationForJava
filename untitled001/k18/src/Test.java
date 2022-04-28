public class Test {
    public static void main(String[] args) {
        Jump jo = new Jump();
//        Jumping j = new Cat();
//        jo.method(j);


        // 匿名内部类开发中的使用 避免了创建Cat 类和Jump类
        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("Dog can jump ing too!");
            }
        });
    }
}
