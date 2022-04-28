public class TransformRGB {
    public String rgb(int x, int y, int z) {
        return handleLow16(x) + handleLow16(y) + handleLow16(z);
    }

    public String red(int x) {
        return rgb(x,0,0);
    }
    public String green(int x) {
        return rgb(0,x,0);
    }
    public String blue(int x) {
        return rgb(0,0,x);
    }

    public String handleLow16(int num) {
        if(num < 16) {
            return  "0" + Integer.toHexString(num);
        } else {
            return Integer.toHexString(num);
        }
    }

    public static void main(String[] args) {

        TransformRGB color = new TransformRGB();
        System.out.println(color.rgb(200,120,40));
        System.out.println(color.blue(66));
        System.out.println(color.green(20));
        System.out.println(color.red(220));
    }
}
