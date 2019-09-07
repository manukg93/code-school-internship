package Homework13;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String args[]) {
        File fl = new File("C:\\Program Files\\Java");
        p("Files name: " + fl.getName());
        p("source: " + fl.getPath());
        p("Absolut path: " + fl.getAbsolutePath());
        p(fl.exists() ? "Exists" : "Doesn't exists");
        p(fl.canWrite() ? "Anable for record" : "Isn't anable");
        p(fl.canRead() ? "Anable for read" : "Doesn't anable to read");
        p(fl.isDirectory() ? "Is a catalog" : "isn't a catalog");
        p(fl.isFile() ? "is a simple file" : "isn't a simple file");
        p(fl.isAbsolute() ? "is abosult" : "isn't a absolut");
        p("Last changes in the file " + fl.lastModified());
        p("Size: " + fl.length() + " bite");

        // method Delete()
        p("Need to delete: " + fl.delete());

    }
}
