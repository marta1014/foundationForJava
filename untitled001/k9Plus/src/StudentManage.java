import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        while (true) {
            System.out.println("welcome to StudentManagement");
            System.out.println("1 添加");
            System.out.println("2 删除");
            System.out.println("3 修改");
            System.out.println("4 查看");
            System.out.println("5 退出");
            System.out.println("请输入选项 ");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    addStudent(arr);
                    System.out.println("successful add");
                    break;
                case "2":
                    deleteStudentMsg(arr);
                    break;
                case "3":
                    updateStudentMsg(arr);
                    break;
                case "4":
                    showAllStudentMsg(arr);
                    System.out.println("successful show msg");
                    break;
                case "5":
                    System.out.println("5");
                    System.exit(0); // JVM退出
            }
        }
    }

    public static void addStudent(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("please input student sid");
             sid = sc.nextLine();
            boolean flag = isUsed(arr,sid);
            if(flag) {
                System.out.println("already isUsed");
            } else {
                break;
            }
        }
        System.out.println("please input student name");
        String name = sc.nextLine();
        System.out.println("please input student age");
        String age = sc.nextLine();
        System.out.println("please input student address");
        String address = sc.nextLine();

        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        stu.setSid(sid);
        stu.setAddress(address);

        arr.add(stu);
    }

    public static void showAllStudentMsg(ArrayList<Student> arr) {
        if (arr.size() == 0) {
            System.out.println("无信息");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");

        for (int i = 0; i <arr.size() ; i++) {
            Student s  = arr.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

    public static void deleteStudentMsg(ArrayList<Student> arr) {
        System.out.println("please input need remove the student sid");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int Index = -1;

        for (int i = 0; i < arr.size(); i++) {
            Student s  = arr.get(i);
            if(s.getSid().equals(id)) {
                Index = i;
                break;
            }
        }

        if(Index == -1) {
            System.out.println("FAILED NOT FOUND");
        } else {
            arr.remove(Index);
            System.out.println("successful delete");
        }
    }

    public static void updateStudentMsg(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your need update student the sid");
        String id = sc.nextLine();

        System.out.println("输入新的姓名");
        String name = sc.nextLine();
        System.out.println("输入新的年纪");
        String age = sc.nextLine();
        System.out.println("输入新的地址");
        String address = sc.nextLine();

        Student stu = new Student();
        stu.setName(name);
        stu.setAddress(address);
        stu.setAge(age);
        stu.setSid(id);

        for (int i = 0; i < arr.size(); i++) {
            if(stu.getSid().equals(id)) {
                arr.set(i,stu);
                break;
            }
        }

        System.out.println("successful edit");

    }

    public static boolean isUsed(ArrayList<Student> arr,String id) {
        boolean flag = false;
//        for (int i = 0; i < arr.size(); i++) {
//            Student stu = arr.get(i);
//            if(stu.getSid().equals(id)) {
//                    flag = true;
//                    break;
//            }
//        }
        for (Student stu : arr) {
            if (stu.getSid().equals(id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
