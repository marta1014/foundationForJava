public class Tiger extends Animal implements Run,Activable{
   public Tiger(String name,double age) {
       super(name,age); // 由于父类的构造方法给属性做了赋值，此处便可以直接调用
   }

    @Override
    public void run() {
        System.out.println(getName() + "在奔跑！");
    }

    @Override
    public void active() {
        run();
    }
}
