import java.util.ArrayList;

public class ArrListTest002 {
    public static void main(String[] args) {
        ArrayList<Student>  arr = new ArrayList<Student>();

        Student s1 = new Student("周思涵",22);
        Student s2 = new Student("林允儿",21);
        Student s3 = new Student("炫雅",22);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
