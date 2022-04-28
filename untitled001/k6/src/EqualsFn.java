public class EqualsFn {
    private String name;
    private int age;
    private String IDCard;

    public EqualsFn() {}

    public EqualsFn(String name,int age, String IDCard) {
        this.name = name;
        this.age = age;
        this.IDCard = IDCard;
    }

    public boolean equalsTest(Object obj) { // 重写equals方法
        EqualsFn equalsFn = (EqualsFn) obj;
        return this.name == equalsFn.name && this.age == equalsFn.age && this.IDCard == equalsFn.IDCard;
    }

    public static void main(String[] args) {
        EqualsFn f1 = new EqualsFn("张嫂",12,"89757");
        EqualsFn f2 = new EqualsFn("张嫂",12,"89757");
        System.out.println(f1.equalsTest(f2));
    }
}
