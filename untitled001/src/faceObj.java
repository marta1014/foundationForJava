public class faceObj {
    String name;
    int age;

    public void callYouFather() {
        System.out.println("call your father tomorrow");
    }

    public int numAddRes(int x,int y) {
        return x + y;
    }

    public static void main(String[] args) {

        faceObj t = new faceObj();
        System.out.println(t.name);
        System.out.println(t.age);

        t.callYouFather();
        t.numAddRes(33,5);
    }
}
