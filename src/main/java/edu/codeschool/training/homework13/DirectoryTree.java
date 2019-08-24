package edu.codeschool.training.homework13;

import java.io.File;
import java.nio.file.Files;

public class DirectoryTree {

    public static void main(String[] args) {

        File directoryCodeSchool = new File(System.getProperty("user.dir") + "/src/main/java/resources/code_school_trainings");
        directoryCodeSchool.mkdir();
        System.out.println(directoryCodeSchool.getParentFile());

        File directoryJava = new File(directoryCodeSchool.getParentFile(), "/code_school_trainings/java");
        directoryJava.mkdir();
        System.out.println(directoryJava.getParentFile());

        File aaa = new File(directoryCodeSchool.getParentFile(), "/files/aaa.txt");
        System.out.println(aaa.exists());

    }
}
