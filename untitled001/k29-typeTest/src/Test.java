public class Test {
    public static void main(String[] args) {
       TypeTest<String> t = new TypeTest<String>();
       t.setT("admin");
       System.out.println(t.getT());

       TypeTest<Integer> i = new TypeTest<Integer>();
       i.setT(9);
        System.out.println(i.getT());
    }
}
