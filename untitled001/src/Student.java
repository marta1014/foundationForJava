public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name; // 未用this修饰就是局部变量
        this.name = name; // 此处因为this的修饰 是成员变量
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Show() {
        System.out.println(name + "," + age);
    }

    // 构造函数 格式 修饰符 + class名称

    public Student() {
        System.out.println("构造函数被调用的测试");
    }
}

// 构造函数


