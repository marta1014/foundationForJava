import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
         int[] arr = {2,4,6,8,10,2,1,6,3};

        System.out.println("排序前" + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后" + Arrays.toString(arr));
    }
}
