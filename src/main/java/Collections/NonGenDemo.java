package Collections;

public class NonGenDemo {
    public static void main(String args[]) {
        NonGen iOb;
        iOb = new NonGen(100);
        int v = (Integer) iOb.getOb();
        System.out.println("The value: " + v);
        System.out.println();
        NonGen iOb1;
        iOb1 = new NonGen ("New value");
        iOb1.showType();
        String iob3 = (String) iOb1.getOb();
        System.out.println("New value: " + iob3);
     //   iOb = iOb1;
        v = (Integer) iOb.getOb();

    }
}
