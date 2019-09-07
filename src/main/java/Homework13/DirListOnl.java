package Homework13;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnl {
    public static void main(String args[]) {
        String dirname = "C:\\";
        File fl = new File(dirname);
        FilenameFilter Only = new OnlyExt("html");
        String s[] = fl.list(Only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
