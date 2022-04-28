import java.util.Scanner;
public class UserLoginMockLesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your userName");
        String userNameLine = sc.nextLine();
        System.out.println("please input your password");
        String userPassword = sc.nextLine();

        String msg = showMsg(userNameLine, userPassword);
        System.out.println(msg);
    }
    public static String showMsg(String name, String pwd) {
        String msg;
        if("marta".equals(name) && "89757".equals(pwd)) {
            msg = "successful";
        } else {
           msg = "error ! please again";
        }
        return msg;
    }

}
