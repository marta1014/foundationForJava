import java.util.Scanner;

public class StringTestlesson1 {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("admin"); // StringBuilder 可变字符串（容器）

       sb.append(",display").append(true).append(89757); //链式编程

        System.out.println("sb :" + sb);

        sb.reverse();

        System.out.println("sb reverse:"+ sb);

        // StringBuilder => String
        String displayString = sb.toString();
        // String => StringBuilder
        String st = "Marta";
        StringBuilder s = new StringBuilder(st);

    }
}
