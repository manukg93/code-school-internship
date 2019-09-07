package Homework13;

import java.io.File;

public class DirList {
    public static void main(String args[]) {
        String dirName = ("C:\\");
        File fl = new File(dirName);
        if (fl.isDirectory()) {
            System.out.println("Catalog " + dirName);
            String s[] = fl.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirName + " /" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a catalog");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirName + " is not a catalog");
        }
    }
}
