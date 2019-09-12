package Collections;

public class ClassDemo1 {
    public static void main(String args[]) {
        GenDemo<Integer> iOb;
        iOb = new GenDemo<Integer>(88);
        iOb.showType();
        int v = iOb.getob();
        System.out.println("value: " + v);
        System.out.println();
        GenDemo<String> strOb = new GenDemo<String>("Message");
        strOb.showType();
        String str = strOb.getob();
        System.out.println("value: " + str);
    }
    }
