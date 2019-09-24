package homework19;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String>h=new HashSet<>();
        h.add("AB");
        h.add("CC");
        h.add("TK");
        h.add("DS");
        h.add("VV");
        h.add("GG");
        h.add("TT");
        System.out.println(h);
        System.out.println(h.contains("DM"));
        System.out.println(h.isEmpty());
        //System.out.println(h.iterator());
        System.out.println(h.size());
        System.out.println();

    }
}
