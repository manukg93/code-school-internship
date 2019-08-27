package edu.codeschool.training.homework13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class System {

    // static fields
    private static File sout = null;
    private static PrintStream out = null;

    // private method
    private static void createOutputFile() throws IOException {

        sout = new File(java.lang.System.getProperty("user.dir") + File.separator + "src" + File.separator
                + "main" + File.separator + "java" + File.separator + "resources" + File.separator + "sout.txt");

        if (!(sout.exists())) {

            sout.createNewFile();

        }
    }

    // private method
    private static void createOutputObject() throws IOException {

        out = new PrintStream(sout);

    }

    public static void print(String arg) throws IOException {

        try {

            createOutputFile();
            createOutputObject();


            out.print(arg);

        } catch (FileNotFoundException fnf) {

            System.out.println("file not found exception: " + fnf.getStackTrace());

        } catch (IOException ioe) {

            System.out.println("I/O exception: " + ioe.getStackTrace());

        } finally {

            out.close();
        }
    }

    public static void println(String arg) throws IOException {

        try {

            createOutputFile();
            createOutputObject();

            out.println(arg);

        } catch (FileNotFoundException fnf) {

            System.out.println("file not found exception: " + fnf.getStackTrace());

        } catch (IOException ioe) {

            System.out.println("I/O exception: " + ioe.getStackTrace());

        } finally {

            out.close();
        }

    }
}
