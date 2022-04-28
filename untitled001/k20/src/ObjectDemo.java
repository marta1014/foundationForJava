public class ObjectDemo {
    private String name;
    private int age;

    public ObjectDemo() {}

    public ObjectDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
    public boolean equals(Object o) {
        /**
         * this => objectDemo1
         * o => objectDemo2
         */
        if (this == o) return true;
        // 比较地址是否相同
        if (o == null || getClass() != o.getClass()) return false;
        // 参数是null直接false 或者 判断两个对象是否来自同一个类 非同类直接false

        ObjectDemo that = (ObjectDemo) o;
        // 向下转型 此时that => objectDemo2

        if (age != that.age) return false;
        // 比较
        return name != null ? name.equals(that.name) : that.name == null;
        // 比较内容非null 然后比较内容是否相同
    }
}
