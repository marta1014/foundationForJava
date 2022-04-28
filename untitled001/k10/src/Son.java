public class Son extends Father{
  public int age = 30;
  public void show() {
      int age = 20;
      System.out.println(age); // 局部

      System.out.println(this.age); // 本类成员变量

      System.out.println(super.age); // 父类成员变量
  }
}
