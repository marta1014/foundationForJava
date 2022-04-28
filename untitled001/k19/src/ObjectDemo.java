public class ObjectDemo {
    private String name;
    private int age;

    public ObjectDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ObjectDemo() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
