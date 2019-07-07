package code.school.internship;
import java.util.Scanner;

public class SymbolPrint {
    public static void main(String[] args) {
        System.out.println("import font");
        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);
        if(c>=65 && c<=90){
            c+=32;
            System.out.print("--> " + c);
        }
        if(c>=97 && c<=122){
            c-=32;
            System.out.println("--> " + c );
        }
        else {
            System.out.println("error (this is not a font)");
        }
    }
}
