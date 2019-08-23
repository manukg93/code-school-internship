package code.school.internship.classes_and_objects.homework.homework13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Delete_Methods {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\homework13_Lesson13_Exception.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        File fileinput = new File("E:\\homework13_Lesson13_Exception.txt");
        FileInputStream file2 = new FileInputStream(fileinput);
        int i;

        FileOutputStream file3 = new FileOutputStream(file);
        while ((i=file2.read())!=-1){
            file3.write(i);
        }
        file2.close();
        file3.close();
        fileinput.deleteOnExit();


        File skipFile = new File("C:\\Users\\LENOVO\\Desktop\\codeSchoolTrainings\\java\\skipfile.txt");
        if(!skipFile.exists()){
            skipFile.createNewFile();
        }
        FileOutputStream sFile = new FileOutputStream(skipFile);
        FileInputStream iFile = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\codeSchoolTrainings\\java\\lesson3.txt");

        iFile.skip(10);
        int j;
        while ((j=iFile.read())!=-1){
            sFile.write(j);
        }

        iFile.close();
        sFile.close();



    }
}