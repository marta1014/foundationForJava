import java.util.Scanner;

public class UserLoginLesson2 {
    public static void main(String[] args) {
        String userName = "marta";
        String password = "89757";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("userName");
            String name = sc.nextLine();

            System.out.println("password");
            String pwd = sc.nextLine();

            if(name.equals(userName) && pwd.equals(password)) {
                System.out.println("successful");
                break;
            } else {
                if(2 - i == 0) {
                    System.out.println("LOCK");
                } else {
                    System.out.println("fail" + "," +( 2 - i) + "次机会");
                }
            }
        }

    }
}
