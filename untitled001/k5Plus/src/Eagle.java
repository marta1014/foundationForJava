public class Eagle extends Animal implements Fly,Activable{
    public Eagle(String name,double age) {
        super(name,age);
    }

    @Override
    public void fly() {
        System.out.println(getName() + "在飞～") ;
    }

    @Override
    public void active() {
        fly();
    }
}
