import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // 创建集合对象
         TreeSet<Student> st = new TreeSet<Student>(new Comparator<Student>() {
             @Override
             public int compare(Student o1, Student o2) {
                 int num1 = o1.getAge() - o2.getAge();
                 int num2 = num1 == 0 ? o1.getName().compareTo(o2.getName()) : num1;
                 return num2;
             }
         });

        Student s1 = new Student("admin",22);
        Student s2 = new Student("admin",2);
        Student s3 = new Student("admin",92);
        Student s4 = new Student("admin",32);
        Student s5 = new Student("user",32);
        Student s6 = new Student("bank",32);

        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add(s6);

        for (Student s: st) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
