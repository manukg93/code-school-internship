package Collections;

public class TwoGenDemo {
    public static void main(String args[]) {
        TwoGen<Integer, String> tgobj = new TwoGen<Integer, String>(100, "Colleciton");
        tgobj.showType();
        int v = tgobj.getOb1();
        System.out.println("Meaning: " + v);
        String str = tgobj.getOb2();
        System.out.println("Meaning: " + str);
    }
}
