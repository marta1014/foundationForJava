public abstract class Animal {
    String name;
    double age;

    public Animal(String _name,double _age) {
        name = _name;
        age = _age;
    }
    // 编写有参构造方法不是为了实例化、而是为了方便子类调用

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
