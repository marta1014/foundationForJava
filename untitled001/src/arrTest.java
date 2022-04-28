import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class arrTest {
    public  static void main(String[] args) {
        // test 001
        int[] intArr = {2,4,6,8,10}; //整形数组
        char[] cahrArr = {'a','d','m','i','n'}; // 字符型数组
        int maxNum = intArr[0];

        for (int i=0; i < intArr.length; i++) {
            if(intArr[i] > maxNum) {
                maxNum = intArr[i];
            }
        }
        System.out.print(maxNum);

        // test 002

        float[] score = new float[6];
        float num = 0; // 成绩
        Scanner sc = new Scanner(System.in); // 创建扫描器(输入扫描器)
        System.out.println("请输入6位骚年的成绩");

        for(int i=0;i < score.length; i++) {
            score[i] = sc.nextInt();
            num = num + score[i];
        }

        System.out.println("骚年的平均分数是"+ num/score.length);

        // test 003

        // 数组插入
        int[] ar1 = {2,6,8,4,10};

        int insertNum = 22;

        int[] newAr1 = new int[ar1.length + 1];

        for(int i=0;i < ar1.length;i++) {
            newAr1[i] = ar1[i];
        }

        for (int i=newAr1.length-1; i>=3;i--) {
            newAr1[i] = newAr1[i-1];
        }

        newAr1[2] = insertNum;

        for (int i=0;i<newAr1.length;i++) {
            System.out.println(newAr1[i] + ",");
        }

        // 结论：数组长度的不可变，插入或者删除某元素很繁琐。。。（静待集合/链表的灵活储存方式）

        // test 003 99乘法表

        for (int i=1; i<=9; i++) {
            for (int j=1;j <=i; j++) {
                System.out.print( j + "*" + i + "=" +  i * j + " ");
            }
            System.out.println("");
        }

        // 放在同一个包下的两个类 不用导入亦可以使用 -- java规则
        faceObj t = new faceObj();
        t.callYouFather();

        List<String> list = Arrays.asList("admin", "user");

    }
}
